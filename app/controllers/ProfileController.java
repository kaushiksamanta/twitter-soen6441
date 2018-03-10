package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.User;
import views.html.*;
import services.twitterService;

import java.util.List;

public class ProfileController extends Controller{
    public Result profile(String username) throws TwitterException {
        User user = twitterService.getUserDetails(username);
        List<Status> timeline = twitterService.getUsersTimeline(username);
        return ok(profile.render(username, user, timeline));
    }
}
