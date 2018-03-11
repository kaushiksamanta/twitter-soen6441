package modals;

import twitter4j.Status;
import twitter4j.User;
import java.util.List;

public class userModal {
    protected User user;
    protected List<Status> timeline;
    public void setUser(User user) {
        this.user = user;
    }
    public void setTimeline(List<Status> timeline) {
        this.timeline = timeline;
    }
    public User getUser(){
        return user;
    }
    public List<Status> getTimeline(){
        return timeline;
    }
}
