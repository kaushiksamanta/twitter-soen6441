package controller;

import static org.junit.Assert.assertTrue;
import controllers.ProfileController;
import org.junit.Test;
import play.mvc.Result;
import twitter4j.TwitterException;
import java.util.concurrent.*;

public class profileControllerUnitTest {
    @Test
    public void testProfile() throws TwitterException, ExecutionException, InterruptedException, TimeoutException {
        CompletionStage<Result> result = new ProfileController().profile("HikkanAndrey");
        CompletableFuture<Result> r = result.toCompletableFuture();
        assertTrue(r.get().toString().length() > 0);
    }
}
