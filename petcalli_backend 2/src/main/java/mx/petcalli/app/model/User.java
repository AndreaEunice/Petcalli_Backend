package mx.petcalli.app.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users") // indica el nombre d enuestra tabla
public class User {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 


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

	    @OneToMany(mappedBy = "user")
    @JsonIgnoreProperties("user") // Evita la recursión infinita al serializar
    private List<Order> orders;
	
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

	public void setOrders(List<Order> orders) {
        this.orders = orders;
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
