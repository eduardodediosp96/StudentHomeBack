package com.studenthome.entity.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="landlord")
public class Landlord implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
   
    private String lastName;
    private String dni;
    private String phone;
    private String email;
    private String password;

    public long getId()  {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
  
  
    public String getlastName() {
        return lastName;
    }
    public void setlastName(String lastName) {
        this.lastName = lastName;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getPhone() {return phone;}
    public void setPhone(String phone) {this.phone = phone; }
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email; }
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password; }


}
