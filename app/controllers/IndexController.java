package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

/**
 * IndexController class contains an action to handle HTTP requests
 * to the application's search page.
 * @version 1.0
 * @see IndexController
 */

public class IndexController extends Controller{
	/**
	 * An action that renders an HTML page @view (index.scala.html) with a welcome message.
	 * The configuration in the <code>routes</code> file means that
	 * this method will be called when the application receives a
	 * <code>GET</code> request with a path of <code>/</code>.
	 *
	 */
	public Result root() {
	    return ok(index.render("Welcome to TweetAnalytics"));
    }
}
