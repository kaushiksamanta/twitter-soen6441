package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import twitter4j.TwitterException;
import services.twitterService;
import views.html.*;

import java.util.concurrent.CompletionStage;

public class ProfileController extends Controller{
    public CompletionStage<Result> profile(String username) throws TwitterException {
        return twitterService.getUserDetails(username).thenApplyAsync((details -> ok(profile.render(details))));
    }
}
