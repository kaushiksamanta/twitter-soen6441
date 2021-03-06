package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import twitter4j.TwitterException;
import services.twitterService;
import java.util.concurrent.CompletionStage;

/**
 * SearchController class contains searchTweet method which gets the tweets for the
 * the keyword(s) entered by the user on in JSON format asynchronously.
 * @version 1.0
 * @see SearchController
 * @author Kaushik Samanta
 */

public class SearchController extends Controller {
	
	 /**
     * An action that return JSON with the tweets details.
     * The configuration in the routes file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/tweets/:keyword</code>.
     * @author Kaushik Samanta
     * @param keyword  a string for keyword(s)
     * @return related tweets containing the keyword(s) in JSON format
     * @throws TwitterException It throws a TwitterException
     *
     */
    public CompletionStage<Result> searchTweet(String keyword) throws TwitterException {
        return twitterService.getTweets(keyword).thenApplyAsync(tweets -> ok(tweets));
    }
}
