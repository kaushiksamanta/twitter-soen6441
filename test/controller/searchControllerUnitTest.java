package controller;

import static org.junit.Assert.assertTrue;
import controllers.SearchController;
import org.junit.Test;
import play.mvc.Result;
import twitter4j.TwitterException;
import java.util.concurrent.*;

public class searchControllerUnitTest {
    @Test
    public void testSearchController() throws TwitterException, ExecutionException, InterruptedException {
        CompletionStage<Result> result = new SearchController().searchTweet("technology");
        CompletableFuture<Result> r = result.toCompletableFuture();
        assertTrue(r.get().toString().length() > 0);
    }
}
