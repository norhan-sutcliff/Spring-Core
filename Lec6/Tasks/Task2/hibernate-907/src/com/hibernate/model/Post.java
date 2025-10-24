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
public class Post {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String header;
    private String content;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Post() {}

    public Post(String header, String content) {
        this.header = header;
        this.content = content;
    }


    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getHeader() { return header; }
    public void setHeader(String header) { this.header = header; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    @Override
    public String toString() {
        return "Post{" +
               "id=" + id +
               ", header='" + header + '\'' +
               ", content='" + content + '\'' +
               '}';
    }
}
