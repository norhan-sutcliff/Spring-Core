package com.hybernate.files;

import org.hibernate.cfg.Configuration;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class main {

	public static void main(String[] args) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {

		Configuration config = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Teacher.class);
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.getCurrentSession();
		
		Transaction tran =  session.beginTransaction();
		Teacher teacher = new Teacher(1,"Ahmed",27,"Cairo");
		session.save(teacher);
		tran.commit();
		
		session.close();
		sf.close();
	}

}
