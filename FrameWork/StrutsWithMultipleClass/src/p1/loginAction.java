package p1;

import com.opensymphony.xwork2.ActionSupport;

public class loginAction extends ActionSupport {
	
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public void validate() {
		if(username.length()==0) {
			addFieldError("username", "username can't be empty \n");
		}
		if(password.length()==0) {
			addFieldError("password", "password can't be empty");
		}
	}
	
	public String execute() {
		return "s";
	}

}
