package com.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Configuration cfg=new Configuration().configure();
     SessionFactory sf=cfg.buildSessionFactory();
     Session session=sf.openSession();
     Transaction tx=session.beginTransaction();
     Manager obj=new Manager();
     obj.setName("Nimitha");
     obj.setDept("Fininace");
     obj.setExp(7);
     session.save(obj);
     tx.commit();
     session.close();
     sf.close();
	}
}
