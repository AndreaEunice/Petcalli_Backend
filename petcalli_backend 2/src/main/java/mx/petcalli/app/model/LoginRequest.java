package mx.petcalli.app.model;

import jakarta.persistence.Column;

public class LoginRequest {

	@Column(name = "email", length = 50, nullable = false, unique = true)
	private String email;
	
	

	@Column(name = "password", length = 100, nullable = false)
	private String password; 
	
	
   LoginRequest(){
	   
   }


public LoginRequest(String email, String password) {
	super();
	this.email = email;
	this.password = password;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("LoginRequest [email=");
	builder.append(email);
	builder.append(", password=");
	builder.append(password);
	builder.append("]");
	return builder.toString();
}
	
	
   
   
}

