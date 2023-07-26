package com.dao;

import java.util.List;

import com.entity.SuperMarket;
import com.utility.HibernateUtilities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class ViewDetails {

	public void view()
	{
		SessionFactory sessionFactory = HibernateUtilities.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  Query<SuperMarket> query1=session.createQuery("from SuperMarket");
	         
	        List<SuperMarket> result=query1.list();
	         
	         
	       for(SuperMarket sm:result)
	      {
	       	System.out.println(sm.getName()); 
	       	System.out.println(sm.getLocation());
	       	System.out.println(sm.getMobile_no());
	       	System.out.println(sm.getEmail());

	         }
	  
		  session.getTransaction().commit();
		  session.close();
		  sessionFactory.close();

	}

}
