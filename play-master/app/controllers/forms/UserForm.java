package controllers.forms;

import java.util.Optional;

import javax.validation.constraints.Size;

import models.User;

/**
 * Created by kawashimayuu on 2017/07/15.
 */
public class UserForm {
    public Long id;
    @Size(min = 1, max = 5 ,message = "first name is 1〜5")
    public String firstName;
    @Size(min = 1, max = 5 ,message = "last name is 1〜5")
    public String lastName;
    @Size(min = 1, max = 5 ,message = "middle Name is 1〜5")
    public String middleName;

    public static UserForm createForm(Optional<User> userOpt) {
        UserForm form = new UserForm();
        userOpt.ifPresent(user -> {
            form.id = user.id;
            form.firstName = user.firstName;
            form.lastName = user.lastName;
            form.middleName=user.middleName;
        });
        return form;
    }
}
