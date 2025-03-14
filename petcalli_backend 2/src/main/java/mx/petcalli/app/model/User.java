package mx.petcalli.app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users") // indica el nombre d enuestra tabla
public class User {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
	private Integer id; 


=======
	private Integer id;
	
>>>>>>> 3c132a3cc594da562bfd18bc6755e6bb462b4ef0
	@Column(name = "name", length = 45, nullable = false)
	private String name;

	@Column(name = "last_name", length = 100, nullable = false)
	private String lastName;
	
	@Column(name = "email", length = 50, nullable = false, unique = true)
	private String email;
	
	@Column(name = "telephone", length = 50, nullable = false, unique = true)
	private String telephone;
	
	@Column(name = "password", length = 100, nullable = false)
	private String password; 
	
	User (){
		
	}

	public User(String name, String lastName, String email, String telephone, String password) {
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.telephone = telephone;
		this.password = password;
	}
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
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
		builder.append("User [name=");
		builder.append(name);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", email=");
		builder.append(email);
		builder.append(", telephone=");
		builder.append(telephone);
		builder.append(", password=");
		builder.append(password);
		builder.append("]");
		return builder.toString();
	}

	
	

	
	
}