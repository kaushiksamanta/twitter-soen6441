package services;
import com.fasterxml.jackson.databind.node.ArrayNode;
import modals.userModal;
import org.junit.Test;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;

import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import static org.junit.Assert.assertTrue;

public class twitterServiceUnitTest {

    @Test
    public void testTweetService() throws TwitterException, ExecutionException, InterruptedException {
        CompletionStage<ArrayNode> result = twitterService.getTweets("technology");
        assertTrue(result.toCompletableFuture().get().size() > 0);
    }

    @Test
    public void testUserDetailsService() throws TwitterException, ExecutionException, InterruptedException {
        CompletionStage<userModal> result = twitterService.getUserDetails("NarendraGarg001");
        assertTrue(result.toCompletableFuture().get().getScreenName() != null);
    }

    @Test
    public void testUserTimelineService() throws TwitterException, ExecutionException, InterruptedException {
        List<Status> result = twitterService.getUsersTimeline("NarendraGarg001");
        assertTrue(result.size() >= 0);
    }

    @Test
    public void testTwitterInstanceService() throws TwitterException, ExecutionException, InterruptedException {
        Twitter tweet = twitterService.getTwitterinstance();
        assertTrue(tweet instanceof Twitter);
    }
}
