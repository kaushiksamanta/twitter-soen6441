package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import twitter4j.TwitterException;
import services.twitterService;

import java.util.concurrent.CompletionStage;

public class SearchController extends Controller {

    public CompletionStage<Result> searchTweet(String keyword) throws TwitterException {
        return twitterService.getTweets(keyword).thenApplyAsync(tweets -> ok(tweets));
    }
}
