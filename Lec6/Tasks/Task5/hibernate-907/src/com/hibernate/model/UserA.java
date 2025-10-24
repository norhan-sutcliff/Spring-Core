package com.hibernate.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.util.List;

@Entity()
public class UserA extends User {

    private Integer adminLevel;

    public UserA() {}

    public UserA(String name, Integer age, Integer adminLevel) {
        super(name, age);
        this.adminLevel = adminLevel;
    }

    public Integer getAdminLevel() { return adminLevel; }
    public void setAdminLevel(Integer adminLevel) { this.adminLevel = adminLevel; }

    @Override
    public String toString() {
        return "AdminUser{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", adminLevel=" + adminLevel +
                '}';
    }
}
