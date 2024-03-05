package spring;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterRequest {

	private String email;
	private String password;
	private String confrmPassword;
	private String name;
	
	public void setConfrmPassword(String confrmPassword) {
		this.confrmPassword=confrmPassword;
	} 	
	
	public boolean isPasswordEqualToConfrmPassword() {
		return password.equals(confrmPassword);
	} 		
}
