package controller;

import static org.junit.Assert.assertTrue;
import controllers.SearchController;
import org.junit.Test;
import play.mvc.Result;
import twitter4j.TwitterException;
import java.util.concurrent.*;

/**
 * SearchControllerUnitTest  tests contains the actions 
 * to test the searchControllerUnitTest class for searching the
 * tweets based on the specific keyword(s).
 * 
 * @see SearchController
 * @see searchControllerUnitTest
 * @author Tejpreet Kaur
 *
 */
public class searchControllerUnitTest {
	/**
	 * public void testSearchController annonated with @Test
	 * will be executed as a Test Case.
	 * Unit Test to test the  whether the related  tweet(s) exist
	 * for the given keyword(s) .
     * @author Tejpreet Kaur
	 */
    @Test
    public void testSearchController() throws TwitterException, ExecutionException, InterruptedException {
        CompletionStage<Result> result = new SearchController().searchTweet("technology");
        CompletableFuture<Result> r = result.toCompletableFuture();
        assertTrue(r.get().toString().length() > 0);
    }
}
