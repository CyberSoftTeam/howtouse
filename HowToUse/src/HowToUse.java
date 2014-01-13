/**
 * 
 */

/**
 * @author luanvu
 *
 */
public class HowToUse {
	private String message;
	private String description;
	private String username;
	public HowToUse(String message, String description, String username) {
		super();
		this.message = message;
		this.description = description;
		this.username = username;
	}
	public HowToUse() {
		super();
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String toString() {
		return "HowToUse [message=" + message + ", description=" + description
				+ ", username=" + username + "]";
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HowToUse other = (HowToUse) obj;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
}
