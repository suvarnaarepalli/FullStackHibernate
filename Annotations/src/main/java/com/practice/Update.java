package com.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure();
	     SessionFactory sf=cfg.buildSessionFactory();
	     Session session=sf.openSession();
	     Transaction tx=session.beginTransaction();
	     Manager obj=(Manager)session.load(Manager.class,6);
	     obj.setDept("Finance");
	     session.update(obj);
	     //System.out.println(obj);
	     tx.commit();
	     session.close();
	     sf.close();

	}

}
