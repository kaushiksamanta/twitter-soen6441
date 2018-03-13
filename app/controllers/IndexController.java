package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

/**
 * IndexController class implements the view @index.scala.html and
 * contains an action to handle HTTP requests to the application's
 * root page.
 * @author Kaushik
 */

public class IndexController extends Controller{
	/**
	 * An action that renders an HTML page with the search page for
	 * the user to enter the keyword to get latest tweets related
	 * @return
	 */
	public Result root() {
	    return ok(index.render("Welcome to TweetAnalytics"));
    }
}
