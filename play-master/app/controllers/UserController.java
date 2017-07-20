package controllers;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.inject.Inject;

import controllers.forms.UserForm;
import controllers.forms.UserSearchForm;
import models.User;
import play.data.Form;
import play.data.FormFactory;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class UserController extends Controller {

    @Inject
    FormFactory formFactory;

    /**
     * user home
     */
    @Transactional(readOnly = true)
    public Result index() {
        Form<UserSearchForm> bindForm = formFactory.form(UserSearchForm.class).bindFromRequest();
        UserSearchForm form = bindForm.get();
        List<User> users = User.search(form.id, form.firstName, form.lastName,form.middleName);
        return ok(views.html.user.index.render(form,users));
    }

    /**
     * user create
     */
    public Result create() {
        // Create Form
        Form<UserForm> userForm = formFactory.form(UserForm.class).fill(UserForm.createForm(Optional.empty()));
        return ok(views.html.user.detail.render(userForm));
    }

    /**
     * user detail
     */
    @Transactional(readOnly = true)
    public Result detail(Long id) {
        Optional<User> userOpt = User.findByPk(User.class, id);
        Form<UserForm> userForm = formFactory.form(UserForm.class).fill(UserForm.createForm(userOpt));
        return ok(views.html.user.detail.render(userForm));
    }

    /**
     * user create complete
     * update & insert(if id is null -> insert)
     */
    @Transactional
    public Result register() {
        Form<UserForm> bindForm = formFactory.form(UserForm.class).bindFromRequest();
        if (bindForm.hasErrors()) {
            return badRequest(views.html.user.detail.render(bindForm));
        }
        UserForm userForm = bindForm.get();
        if (Objects.isNull(userForm.id)) {
            // insert
            User.create(userForm.firstName, userForm.lastName,userForm.middleName);
        } else {
            // update
            User user = User.findByPk(User.class, userForm.id).orElseThrow(() -> new RuntimeException("user not found"));
            user.update(userForm.firstName, userForm.lastName,userForm.middleName);
        }
        return index();
    }
}
