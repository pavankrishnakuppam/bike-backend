package com.globomatics.bike.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "bike")
@JsonIgnoreProperties
public class Bike implements Serializable {

  private Long id;
  private String name;
  private  String email;
  private String phone;
  private String model;
  private String serialNumber;
  private BigDecimal purchasePrice;
  private Date purchaseDate;
  private boolean contact;

  @Id
  @GeneratedValue(
      strategy = GenerationType.AUTO)
  @Column(
      name = "id",
      unique = true,
      nullable = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Column(
      name = "name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  @Column(
      name = "email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  @Column(
      name = "phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
  @Column(
      name = "model")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }
  @Column(
      name = "serial_number")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }
  @Column(
      name = "purchase_price")
  public BigDecimal getPurchasePrice() {
    return purchasePrice;
  }

  public void setPurchasePrice(BigDecimal purchasePrice) {
    this.purchasePrice = purchasePrice;
  }
  @Column(
      name = "purchase_date")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy")
  public Date getPurchaseDate() {
    return purchaseDate;
  }

  public void setPurchaseDate(Date purchaseDate) {
    this.purchaseDate = purchaseDate;
  }
  @Column(
      name = "contact")
  public boolean isContact() {
    return contact;
  }

  public void setContact(boolean contact) {
    this.contact = contact;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Bike)) return false;
    Bike bike = (Bike) o;
    return isContact() == bike.isContact() &&
        Objects.equals(getId(), bike.getId()) &&
        Objects.equals(getName(), bike.getName()) &&
        Objects.equals(getEmail(), bike.getEmail()) &&
        Objects.equals(getPhone(), bike.getPhone()) &&
        Objects.equals(getModel(), bike.getModel()) &&
        Objects.equals(getSerialNumber(), bike.getSerialNumber()) &&
        Objects.equals(getPurchasePrice(), bike.getPurchasePrice()) &&
        Objects.equals(getPurchaseDate(), bike.getPurchaseDate());
  }

  @Override
  public int hashCode() {

    return Objects.hash(getId(), getName(), getEmail(), getPhone(), getModel(), getSerialNumber(), getPurchasePrice(), getPurchaseDate(), isContact());
  }
}
