package controllers;

import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import twitter4j.Status;
import twitter4j.TwitterException;
import services.twitterService;
import java.util.List;
import views.html.*;

public class SearchController extends Controller {

    public Result searchTweet() throws TwitterException {
        List<Status> tweets = twitterService.getTweets("technology");
        return ok(search.render(tweets));
    }
}
