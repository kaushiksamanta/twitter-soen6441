package services;

import modals.userModal;
import play.libs.Json;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class twitterService {

    public static Twitter getTwitterinstance() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("uvZYPifCuMDmDLhGzryVaH9sA")
                .setOAuthConsumerSecret("G01gHXhUerHAevCjhR0U1iOlm5VNmxC5cGRnldvHscVFcMfkvQ")
                .setOAuthAccessToken("969353476450017280-r7gPo5QAT8svSDiCBoB0jSKu1f3Oa8P")
                .setOAuthAccessTokenSecret("TmapsealCXor82pige4FwRZ16tqKollMbBb6AieVcKVrJ");
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        return twitter;
    }

    public static CompletionStage<ArrayNode> getTweets(String keyword) throws TwitterException {
        CompletableFuture<ArrayNode> future = new CompletableFuture<>();
        Twitter twitter = getTwitterinstance();
        Query query = new Query(keyword);
        query.setCount(10);
        QueryResult result = twitter.search(query);
        List<Status> tweets = result.getTweets();
        ArrayNode tweetJSON = Json.newArray();
        tweets.forEach((tweet) -> {
        	ObjectNode node = Json.newObject();
        	node.put("text", tweet.getText());
        	node.put("name", tweet.getUser().getName());
        	node.put("screenName", tweet.getUser().getScreenName());
        	tweetJSON.add(node);
        });
        future.complete(tweetJSON);
        return future;
    }

    public static CompletionStage<userModal> getUserDetails(String username) throws TwitterException {
        CompletableFuture<userModal> future = new CompletableFuture<>();
        Twitter twitter = getTwitterinstance();
        User user = twitter.showUser(username);
        List<Status> timelineData = getUsersTimeline(username);
        List<String> list = new ArrayList<String> ();
        timelineData.forEach((data) -> {
        	list.add(data.getText());
        });
        userModal usermodal = new userModal();
        usermodal.setId(user.getId());
        usermodal.setName(user.getName());
        usermodal.setEmail(user.getEmail());
        usermodal.setScreenName(user.getScreenName());
        usermodal.setLocation(user.getLocation());
        usermodal.setDescription(user.getDescription());
        usermodal.setFollowersCount(user.getFollowersCount());
        usermodal.setUrl(user.getURL());
        usermodal.setBiggerProfileImageURLHttps(user.getBiggerProfileImageURLHttps());
        usermodal.setIsProtected(user.isProtected());
        usermodal.setTimeline(list);
        future.complete(usermodal);
        return future;
    }

    public static List<Status> getUsersTimeline(String username) throws TwitterException {
        Twitter twitter = getTwitterinstance();
        User user = twitter.showUser(username);
        Paging p = new Paging();
        p.setCount(10);
        List<Status> timeline = twitter.getUserTimeline(user.getId(),p);
        return timeline;
    }
}
