package com.hibernate.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.utils.HibernateUtil;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Main {
 
	static final SessionFactory factory=HibernateUtil.getSessionFactory();
	public static void main(String[] args) {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Users u=new Users();
		//u.setId(1);
		u.setUsername("atun");
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode("1");
        u.setPassword(encodedPassword);
		session.save(u);
		tx.commit();
		
		//session.close();
System.out.print("done");
	}
}
