package com.dao;

import com.entity.SuperMarket;
import com.entity.Item;
import com.utility.HibernateUtilities;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CreateDetails 
{
	public  void create()
	{
		  SessionFactory sessionFactory = HibernateUtilities.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  SuperMarket sm = new SuperMarket("sss","Coimbatore","9999999999","sss@gmail.com");
		  SuperMarket sm1 = new SuperMarket("Ganesh","Hyderabad","67584689l","ganesh@gmail.com");
		  SuperMarket sm2 = new SuperMarket("Lulu","Chennai","906579087l","lulu@gmail.com");
		  SuperMarket sm3 = new SuperMarket("Reliance","Mumbai","98765432l","reliance@gmail.com");
         
         
      
		  Item item1=new Item("Groceries","25kg",2500); 
	        Item item2=new Item("Vegetables","20kg",3000);
	       Item item3=new Item("Fruits","30kg",4000);
	          List<Item> items=new ArrayList<Item>(); 
	          items.add(item1);
	          items.add(item2);
	         items.add(item3);
         
         
         
	         sm.setItems(items);
	         sm1.setItems(items);
	         sm2.setItems(items);
	         sm3.setItems(items);
	          
	          item1.setSuperMarket(sm); 
	          item2.setSuperMarket(sm1);
	         item3.setSuperMarket(sm2);
	         item3.setSuperMarket(sm3);
	          
	          
	          session.save(sm);
	          session.save(sm1);
	          session.save(sm2);
	          session.save(sm3);
	         
	          session.save(item1);
	          
	          session.save(item2);
	          session.save(item3);
		  System.out.println("Inserted Successfully");
		  session.getTransaction().commit();
		  session.close();
		  sessionFactory.close();

         }
}


