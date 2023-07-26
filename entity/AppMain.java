package com.entity;

import java.util.Scanner;

import com.dao.CreateDetails;
import com.dao.DeleteDetails;
import com.dao.UpdateDetails;
import com.dao.ViewDetails;

public class AppMain {

	public static void main(String[] args) 
	{
		
		String s;
		do
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("HotelReservation");
		System.out.println("\n 1.Create and Insert");
		System.out.println("\n 2.Delete");
		System.out.println("\n 3.Update");
		System.out.println("\n 4.Select");
		System.out.println("enter the choice");
		
		int choice =sc.nextInt();
		
			switch(choice)
			{
				case 1:
					new CreateDetails().create();
					break;
				case 2:
					new DeleteDetails().delete();
					break;
				case 3:
					new UpdateDetails().update();
					break;
				case 4:
					
					new ViewDetails().view();
					break;
			}
			System.out.println("do u want to continue");
			s=sc.next();
		}
		while(s.equals("yes"));

	}

}
