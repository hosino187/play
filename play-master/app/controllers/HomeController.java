package controllers;

import play.mvc.Controller;
import play.mvc.Result;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * Home!
     */
    public Result index() {
        return ok(views.html.index.render());
    }
    /**
     * template!
     */
    public Result template() {
        return ok(views.html.template.render());
    }
    public Result test() {
        return ok(views.html.test.render());
    }

}
