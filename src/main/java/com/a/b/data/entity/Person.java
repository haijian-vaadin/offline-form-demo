package com.a.b.data.entity;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

import com.a.b.data.AbstractEntity;

@Entity
public class Person extends AbstractEntity {

@NotEmpty
private String firstName;
public String getFirstName() {
  return firstName;
}
public void setFirstName(String firstName) {
  this.firstName = firstName;
}
private String lastName;
public String getLastName() {
  return lastName;
}
public void setLastName(String lastName) {
  this.lastName = lastName;
}
private String email;
public String getEmail() {
  return email;
}
public void setEmail(String email) {
  this.email = email;
}



}
