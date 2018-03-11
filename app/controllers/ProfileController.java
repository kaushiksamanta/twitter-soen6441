package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import twitter4j.TwitterException;
import services.twitterService;
import views.html.*;
import java.util.concurrent.CompletionStage;



/**
 * ProfileController class implements the 
 * @view profile.scala.html .
 * ProfileController gets the username from  the @routes
 * and gets details of the username from the 
 * 
 * @class twitterService 
 * and asynchronously passing the  details to the
 * @view profile.scala.html .
 * 
 * 
 * @author 
 */

public class ProfileController extends Controller{
	
	/**
	 * Returns the user and the timeline details  to the @view profile.scala.html.
	 * The string argument must specify the username.
	 * This method always return immediately, whether or not the user details
	 * exists.
	 * 
	 * @param username  a String giving the  ScreenName of the user
	 * @return  the user details and timeline  to the @view profile.scala.html
	 * @throws TwitterException
	 * 
	 */
	
    public CompletionStage<Result> profile(String username) throws TwitterException {
        return twitterService.getUserDetails(username).thenApplyAsync((details -> ok(profile.render(details))));
    }
}
