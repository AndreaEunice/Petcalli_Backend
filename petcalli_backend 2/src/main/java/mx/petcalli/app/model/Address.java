package mx.petcalli.app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "address") 
public class Address {
 
 @Id 
 @GeneratedValue(strategy = GenerationType.IDENTITY) 
 private Integer id; 

 @ManyToOne 
 @JoinColumn(name = "fk_id_user", nullable = true)
 private User user;

 @Column(name = "street", length = 300, nullable = false)
 private String street;

 @Column(name = "city", length = 100, nullable = false)
 private String city;

 @Column(name = "state", length = 100, nullable = false)
 private String state;

 @Column(name = "zip", nullable = false)
 private Integer zip;
 
 @Column(name = "country", length = 100, nullable = false)
 private String country;
 
Address (){
 
}

// Probablemente se retire, ya que tenemos el constructor vacio arriba
public Address(String street, String city, String state, Integer zip, String country) {
 this.street = street;
 this.city = city;
 this.state = state;
 this.zip = zip;
 this.country = country;
}

public Integer getId() {
 return id;
}

public void setId(Integer id) {
 this.id = id;
}

public String getStreet() {
 return street;
}

public void setStreet(String street) {
 this.street = street;
}

public String getCity() {
 return city;
}

public void setCity(String city) {
 this.city = city;
}

public String getState() {
 return state;
}

public void setState(String state) {
 this.state = state;
}

public Integer getZip() {
 return zip;
}

public void setZip(Integer zip) {
 this.zip = zip;
}

public String getCountry() {
 return country;
}

public void setCountry(String country) {
 this.country = country;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Address [id=");
	builder.append(id);
	builder.append(", street=");
	builder.append(street);
	builder.append(", city=");
	builder.append(city);
	builder.append(", state=");
	builder.append(state);
	builder.append(", zip=");
	builder.append(zip);
	builder.append(", country=");
	builder.append(country);
	builder.append("]");
	return builder.toString();
}



 

 


 
}