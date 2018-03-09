package controllers;

import com.fasterxml.jackson.databind.node.ArrayNode;
import play.mvc.Controller;
import play.mvc.Result;
import twitter4j.TwitterException;
import services.twitterService;

public class SearchController extends Controller {

    public Result searchTweet(String keyword) throws TwitterException {
    	ArrayNode result = twitterService.getTweets(keyword);
        return ok(result);
    }
}
