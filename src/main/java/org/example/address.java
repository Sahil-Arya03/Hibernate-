package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

import java.time.*;
import java.util.Date;

@Entity
@Table(name = "student_address") // it changes the name of the table from the address to student_address in the database
public class address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //it automatically generates the value
    @Column(name = "address_id") //we can change the name using this annotation
    private int addressId;
    @Column(length = 20,name = "CITY")//length specify the maximum no of char that can be taken as input
    private String City;
    @Column(length = 20,name = "STATE")
    private String State;
    @Transient // does not create a column out of it in the database
    private double Latitude;
    @Column(name = "DATE")
    @Temporal(TemporalType.DATE) //  this only stores the date of it not the day and time
    private LocalDate addeddate;
    @Lob // this is to define the large object
    private byte [] image; //this is to save the image in the database
  address(int addressId,  String City, String State, LocalDate addeddate, byte [] image)
  {
      this.addressId = addressId;
      this.City = City;
      this.State = State;
      this.addeddate = addeddate;
      this.image = image;
  }
  address()
  {
      super();
  }
  // all the getter and setters
  public int getAddressId() {
      return addressId;
  }
  public void setAddressId(int addressId) {
      this.addressId = addressId;
  }

  public String getCity() {
      return City;
  }
  public void setCity(String City) {
      this.City = City;
  }

  public String getState() {
      return State;
  }
  public void setState(String State) {
      this.State = State;
  }

  public LocalDate getAddeddate() {
      return addeddate;
  }
  public void setAddeddate(LocalDate addeddate) {
      this.addeddate = addeddate;
  }

  public byte[] getImage() {
      return image;
  }
  public void setImage(byte[] image) {
      this.image = image;
  }
}
