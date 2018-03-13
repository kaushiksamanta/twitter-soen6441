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
	 * Retrieve the value of name.
	 * @return A String data type.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Retrieve the value of email.
	 * @return A String data type.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Retrieve the value of screenName.
	 * @return A String data type.
	 */
	public String getScreenName() {
		return screenName;
	}

	/**
	 * Retrieve the value of location.
	 * @return A String data type.
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Retrieve the value of description.
	 * @return A String data type.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Retrieve the value of followersCount.
	 * @return A int data type.
	 */
	public int getFollowersCount() {
		return followersCount;
	}

	/**
	 * Retrieve the value of publicUrl.
	 * @return A String type.
	 */
	public String getUrl() {
		return publicUrl;
	}

	/**
	 * Retrieve the value of isProtected.
	 * @return A boolean  type.
	 */
	public Boolean getIsProtected() {
		return isProtected;
	}

	/**
	 * Retrieve the value of profileImage.
	 * @return A String type.
	 */
	public String getBiggerProfileImageURLHttps() {
		return imageUrl;
	}

	/**
	 * Retrieve the value of timeline.
	 * @return A List<String> type.
	 */
	public List<String> getTimeline() {
		return timeline;
	}
	
}
