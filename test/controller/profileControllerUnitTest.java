package controller;

import static org.junit.Assert.assertTrue;
import controllers.ProfileController;
import org.junit.Test;
import play.mvc.Result;
import twitter4j.TwitterException;
import java.util.concurrent.*;

/**
 * ProfileControllerUnitTest  class contains a method to 
 * test the working of the Profile Controller class on the 
 * profile details of the twitter users.
 * @see ProfileController
 * @see profileControllerUnitTest
 * @author 
 *
 */

public class profileControllerUnitTest {
	/**
	 * public void testProfile annonated with @Test will be executed as
	 * a Test Case.
	 * Unit Test to test the  whether the Twitter Profile details exists 
	 * for a given twitter username .
	 * @throws TwitterException throws TwitterException
	 * @throws ExecutionException throws ExecutionException
	 * @throws InterruptedException throws InterruptedException
	 */
    @Test
    public void testProfile() throws TwitterException, ExecutionException, InterruptedException {
        CompletionStage<Result> result = new ProfileController().profile("HikkanAndrey");
        CompletableFuture<Result> r = result.toCompletableFuture();
        assertTrue(r.get().toString().length() > 0);
    }
}
