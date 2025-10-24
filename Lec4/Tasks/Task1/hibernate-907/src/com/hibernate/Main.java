package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.Player;

public class Main {

	public static void main(String[] args) {
		Configuration configuration = new Configuration()
				.addAnnotatedClass(Player.class)
				.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		

		Transaction transaction = session.beginTransaction();
		
		Player p1 = new Player("ahmed",22,true);
		Player p2 = new Player("Mohamed",29,false);
		session.save(p1);
		session.save(p2);
		
		p1.setAge(27);
		p2.setName("Mohameddd");
		session.update(p1);
		session.update(p2);
		
		session.delete(p1);
		
		System.out.println(session.get(Player.class, 2));
		transaction.commit();
		
		session.close();
		factory.close();
		

	}

}


/*Student_907 s1 = new Student_907(1L, "ahmed123", "pass123", 22, "Cairo");
Student_907 s2 = new Student_907(2L, "sara_ali", "sara@456", 24, "Alexandria");
Student_907 s3 = new Student_907(1L, "mohamed_h", "mh2025", 21, "Giza");
Student_907 s4 = new Student_907(4L, "fatma99", "ftmPass", 23, "Mansoura");
Student_907 s5 = new Student_907(5L, "karim_dev", "kdev!78", 25, "Tanta");

session.save(s1);
session.save(s2);
session.save(s3);
session.save(s4);
session.save(s5);
System.out.println("--------------------");
		System.out.println(student_907.toString());
		
		
		student_907.setUserName("updated user name");
		
		session.update(student_907);
*
*
*/
