package modals;

import java.util.List;

/**
 * userModal class to map the value from twitter and store.
 * @version 1.0
 * @see userModal
 *
 */
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

	/**
	 * Set the value of id.
	 * @param id A variable of type long.
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Set the value of name.
	 * @param name A variable of type String.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Set the value of email.
	 * @param email A variable of type String.
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Set the value of screenName.
	 * @param screenName A variable of type String.
	 */
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	/**
	 * Set the value of location.
	 * @param location A variable of type String.
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * Set the value of description.
	 * @param description A variable of type String.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Set the value of followersCount.
	 * @param followersCount A variable of type int.
	 */
	public void setFollowersCount(int followersCount) {
		this.followersCount = followersCount;
	}

	/**
	 * Set the value of publicUrl.
	 * @param publicUrl A variable of type String.
	 */
	public void setUrl(String publicUrl) {
		this.publicUrl = publicUrl;
	}

	/**
	 * Set the value of isProtected.
	 * @param isProtected A variable of type String.
	 */
	public void setIsProtected(Boolean isProtected) {
		this.isProtected = isProtected;
	}

	/**
	 * Set the value of imageUrl.
	 * @param imageUrl A variable of type String.
	 */
	public void setBiggerProfileImageURLHttps(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * Set the value of timeline.
	 * @param timeline A variable of type List<String>.
	 */
	public void setTimeline(List<String> timeline) {
		this.timeline = timeline;
	}

	/**
	 * Retrieve the value of id.
	 * @return A long data type.
	 */
	public long getId() {
		return id;
	}

	/**
	 * Retrieve the value of id.
	 * @return A long data type.
	 */
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
