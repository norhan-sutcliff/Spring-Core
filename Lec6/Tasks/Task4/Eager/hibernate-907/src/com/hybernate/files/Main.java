package com.hybernate.files;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.User;
import com.hibernate.model.UserDetails;
import com.hibernate.model.Friend;
import com.hibernate.model.Post;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Configuration configuration = new Configuration()
				.addAnnotatedClass(User.class)
				.addAnnotatedClass(UserDetails.class)
				.addAnnotatedClass(Friend.class)
				.addAnnotatedClass(Post.class)
				.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		

		Transaction transaction = session.beginTransaction();
		
		User user1 = new User("Ahmed", 27);
        UserDetails details1 = new UserDetails("Cairo, Egypt", "12345678910");
        user1.setUserDetails(details1);

        session.persist(user1);
        ////////////////////////////////////////
        User fetchedUser = session.get(User.class, user1.getId());
        System.out.println(fetchedUser);
        System.out.println(fetchedUser.getUserDetails());
        ////////////////////////////////////////


        User user2 = new User("Norhan", 26);

        List<Friend> friends = new ArrayList<>();
        Friend f1 = new Friend("Sara");
        Friend f2 = new Friend("Ali");
        Friend f3 = new Friend("Omar");
        friends.add(f1);
        friends.add(f2);
        friends.add(f3);
        
        user2.setFriends(friends);
        session.persist(user2);
        
        User user3 = new User("Yamen", 10);

        Post post1 = new Post("abc", "abcdefgh");
        Post post2 = new Post("123", "123456789");
        
        post1.setUser(user3);
        post2.setUser(user3);

        List<Post> posts = new ArrayList<>();
        posts.add(post1);
        posts.add(post2);

        user3.setPosts(posts);
        session.persist(user3);
        
        
		transaction.commit();
		
		session.close();
		factory.close();
		

	}

}
