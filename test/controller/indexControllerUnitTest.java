package controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.*;
import controllers.IndexController;
import org.junit.Test;
import play.mvc.Result;

public class indexControllerUnitTest {
    @Test
    public void testIndex() {
        Result result = new IndexController().root();
        assertEquals(OK, result.status());
        assertEquals("text/html", result.contentType().get());
        assertEquals("utf-8", result.charset().get());
        assertTrue(contentAsString(result).contains("Welcome to TweetAnalytics"));
    }
}
