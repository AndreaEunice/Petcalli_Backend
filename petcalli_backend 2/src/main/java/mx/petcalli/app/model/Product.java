package mx.petcalli.app.model;

import jakarta.persistence.*;


@Entity
@Table(name = "products")
public class Product {
 
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id; 

 @Column( name = "title", length = 200, nullable = false )
 private String title;
 
 @Column( name = "brand", length = 45, nullable = false )
 private String brand; 
 
 /* @ManyToOne
 @JoinColumn( name = "petType", referencedColumnName = "id")
 @JsonIgnoreProperties({"petType", "description"})
 private PetType petType; */
 
 @Column( name = "image", length = 300, nullable = false )
 private String image;
 
 @Column ( name = "price", nullable = false)
 private Double price;
 
 @Column ( name = "description", length = 500, nullable = false )
 private String description; 
 
 /*
 @ManyToOne
 @JoinColumn( name = "productCategory", referencedColumnName = "id")
 @JsonIgnoreProperties ({"name"})
 private ProductCategory productCategory; */
 
 @Column( name = "color", length = 45, nullable = true )
 private String color; 
 
 @Column( name = "size", length = 45, nullable = true )
 private String size; 
 

 public Product(){ 
 }


 public Product(String title, String brand, String image, Double price, String description, String color, String size) {
  super();
  this.title = title;
  this.brand = brand;
  // this.petType = petType;
  this.image = image;
  this.price = price;
  this.description = description;
  // this.productCategory = productCategory;
  this.color = color;
  this.size = size;
 }


 public int getId() {
  return id;
 }


 public void setId(int id) {
  this.id = id;
 }

 public String getTitle() {
  return title;
 }


 public void setTitle(String title) {
  this.title = title;
 }


 public String getBrand() {
  return brand;
 }


 public void setBrand(String brand) {
  this.brand = brand;
 }


 /* public PetType getPetType() {
  return petType;
 }


 public void setPetType(PetType petType) {
  this.petType = petType;
 } */


 public String getImage() {
  return image;
 }


 public void setImage(String image) {
  this.image = image;
 }


 public Double getPrice() {
  return price;
 }


 public void setPrice(Double price) {
  this.price = price;
 }


 public String getDescription() {
  return description;
 }


 public void setDescription(String description) {
  this.description = description;
 }

/*
 public ProductCategory getProductCategory() {
  return productCategory;
 }


 public void setProductCategory(ProductCategory productCategory) {
  this.productCategory = productCategory;
 }
*/

 public String getColor() {
  return color;
 }


 public void setColor(String color) {
  this.color = color;
 }


 public String getSize() {
  return size;
 }


 public void setSize(String size) {
  this.size = size;
 }


 @Override
 public String toString() {
  StringBuilder builder = new StringBuilder();
  builder.append("Product [id=");
  builder.append(id);
  builder.append(", title=");
  builder.append(title);
  builder.append(", brand=");
  builder.append(brand);
  // builder.append(", petType=");
  // builder.append(petType);
  builder.append(", image=");
  builder.append(image);
  builder.append(", price=");
  builder.append(price);
  builder.append(", description=");
  builder.append(description);
  // builder.append(", productCategory=");
  // builder.append(productCategory);
  builder.append(", color=");
  builder.append(color);
  builder.append(", size=");
  builder.append(size);
  builder.append("]");
  return builder.toString();
 }


 
 
 
 
 
}