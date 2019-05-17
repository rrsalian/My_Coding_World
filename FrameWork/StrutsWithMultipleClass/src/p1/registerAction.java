package p1;

import com.opensymphony.xwork2.ActionSupport;

public class registerAction extends ActionSupport {

	private String username;
	private String password;
	private String confirmpassword;
	
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
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	
	
	public void validate() {
		if(username.length()==0) {
		 addFieldError("username", "username can't be empty");
		}
		if(password.length()==0) {
			addFieldError("password", "password can't be empty");
		}
		if(confirmpassword.length()==0) {
			addFieldError("confirmpassword", "password can't be empty");
		}
		if(confirmpassword.equals(password)==false) {
			addFieldError("confirmpassword", "password and confirm password is not same");
			
		}
	}
	
	
	public String execute() {
		return "s";
	}

}
