package models;

import modals.userModal;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertTrue;

public class userModelUnitTest {
    userModal user;

    @Before
    public void setup() {
        user = new userModal();
        user.setName("Narendra Garg");
        user.setEmail("narendragarg@gmail.com");
        user.setScreenName("NarendraGarg001");
        user.setLocation("Roorkee, India");
        user.setDescription("Everything comes to u in the right moments be patient....#BePossitive");
        user.setFollowersCount(23);
        user.setUrl("https://t.co/jMNJDmDucO");
        user.setBiggerProfileImageURLHttps("https://pbs.twimg.com/profile_images/921632924239319040/2OMh0tGc_bigger.jpg");
        user.setIsProtected(false);
        List<String> timeline = new ArrayList<String>();
        timeline.add("RT @DNN_Blockchain: Following the success of our pre-sale and consultation with our community, our public sale start date has been delayed…");
        user.setTimeline(timeline);
    }

    @Test
    public void testUserModal() {
        assertTrue(user.getScreenName() == "NarendraGarg001");
    }
}
