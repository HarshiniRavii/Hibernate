package com.dao;

import java.util.Scanner;

import com.entity.SuperMarket;
import com.utility.HibernateUtilities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DeleteDetails {

	public void delete() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the ID number");
		int id_no=sc.nextInt();
		SessionFactory sessionFactory = HibernateUtilities.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		SuperMarket sm = (SuperMarket)session.load(SuperMarket.class, id_no);
		session.delete(sm);
		
		  System.out.println("Deleted Successfully");
		  session.getTransaction().commit();
		     sessionFactory.close();

	}

}

