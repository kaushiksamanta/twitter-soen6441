package modals;

import java.util.List;

public class userModal {
	protected long id;
	protected String name;
	protected String email;
	protected String screenName;
	protected String location;
	protected String description;
	protected String imageUrl;
	protected int followersCount;
	protected String publicUrl;
	protected Boolean isProtected;
	protected List<String> timeline;
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setFollowersCount(int followersCount) {
		this.followersCount = followersCount;
	}
	
	public void setUrl(String publicUrl) {
		this.publicUrl = publicUrl;
	}
	
	public void setIsProtected(Boolean isProtected) {
		this.isProtected = isProtected;
	}
	
	public void setBiggerProfileImageURLHttps(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	public void setTimeline(List<String> timeline) {
		this.timeline = timeline;
	}
	
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getScreenName() {
		return screenName;
	}
	
	public String getLocation() {
		return location;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getFollowersCount() {
		return followersCount;
	}
	
	public String getUrl() {
		return publicUrl;
	}
	
	public Boolean getIsProtected() {
		return isProtected;
	}
	
	public String getBiggerProfileImageURLHttps() {
		return imageUrl;
	}
	
	public List<String> getTimeline() {
		return timeline;
	}
	
}
