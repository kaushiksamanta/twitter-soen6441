package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import twitter4j.TwitterException;
import services.twitterService;
import java.util.concurrent.CompletionStage;

/**
 * SearchController class search tweets for the 
 * the keyword(s) entered by the user on @routes and
 * get the related tweets containing the mentioned
 * keyword(s) in JSON format asynchronously on localhost.
 * 
 * @author 
 *
 */

public class SearchController extends Controller {
	
	/**
	 * Returns the tweets related to the keyword(s) in JSON
	 * format on the localhost.
	 * The string argument must specify the keyword(s).
	 * This method always return immediately, whether or not the tweet(s )
	 * exist(s).
	 * 
	 * @param keyword  a string for keyword(s)
	 * @return related tweets containing the  keyword(s)
	 * @throws TwitterException
	 */

    public CompletionStage<Result> searchTweet(String keyword) throws TwitterException {
        return twitterService.getTweets(keyword).thenApplyAsync(tweets -> ok(tweets));
    }
}
