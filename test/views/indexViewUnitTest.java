package views;
import org.junit.Test;
import play.test.WithApplication;
import play.twirl.api.Content;
import static org.assertj.core.api.Assertions.assertThat;

public class indexViewUnitTest extends WithApplication {
	@Test
	public void renderTemplate() {
	  Content html = views.html.index.render("Welcome to TweetAnalytics");
	  assertThat("text/html").isEqualTo(html.contentType());
	  assertThat(html.body()).contains("Welcome to TweetAnalytics");
	}
}