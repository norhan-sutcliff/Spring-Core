package com.hibernate.model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import java.util.List;

@Entity()
public class UserDetails {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String address;
    private String phone;
    @OneToOne(mappedBy = "userDetails")
    private User user;

    public UserDetails() {}

    public UserDetails(String address, String phone) {
        this.address = address;
        this.phone = phone;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    @Override
    public String toString() {
        return "UserDetails{" +
               "id=" + id +
               ", address='" + address + '\'' +
               ", phone='" + phone + '\'' +
               '}';
    }
}
