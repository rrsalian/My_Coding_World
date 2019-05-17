package p1;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{

	private String username;
	private String usercity;


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsercity() {
		return usercity;
	}
	public void setUsercity(String usercity) {
		this.usercity = usercity;
	}



	public void validate() {
		if(username.length()==0) {
			addFieldError("username", "user name can't be empty");
		}
		if(usercity.length()==0) {
			addFieldError("usercity", "user city can't be empty");
		}
	}


	public String execute() {
		System.out.println(username);
		System.out.println(usercity);
		return "s";
	}

}
