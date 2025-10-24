package com.hybernate.files;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.User;
import com.hibernate.model.UserA;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Configuration configuration = new Configuration()
				.addAnnotatedClass(User.class)
				.addAnnotatedClass(UserA.class)
				.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		

		Transaction transaction = session.beginTransaction();
		
		User user1 = new User("Ahmed", 28);
        session.persist(user1);

        UserA admin1 = new UserA("Norhan", 26, 5);
        session.persist(admin1);
        List<User> allUsers = session.createQuery("from User", User.class).list();

        for (User u : allUsers) {
            System.out.println(u);
        }
        
		transaction.commit();
		
		session.close();
		factory.close();
		

	}

}
