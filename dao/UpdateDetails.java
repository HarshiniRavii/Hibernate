package com.dao;

import java.util.Scanner;

import com.entity.SuperMarket;
import com.utility.HibernateUtilities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UpdateDetails {

	public void update()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the ID number");
		int id_no=sc.nextInt();
		
		SessionFactory sessionFactory = HibernateUtilities.getSessionFactory();	
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  SuperMarket sm = (SuperMarket)session.get(SuperMarket.class,id_no);
		  sm.setName("DMart");
		  sm.setLocation("Guragon ");
		  sm.setMobile_no("1009866009");
		  sm.setEmail("dmart@gmail.com");
		  
		  
		  System.out.println("Updated Successfully");
		  session.getTransaction().commit();
		  sessionFactory.close();

	}

}

