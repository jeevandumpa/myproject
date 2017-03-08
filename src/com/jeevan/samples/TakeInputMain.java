package com.jeevan.samples;

import java.util.Scanner;

public class TakeInputMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String f_name;
		String l_name;
		String fullName;
		
		Scanner inp;
		inp = new Scanner(System.in);
		
		System.out.println("Enter your first name: \n");
		f_name = inp.next();
		
		System.out.println("Enter your last name: \n");
		l_name = inp.next();		

		fullName = f_name + " " + l_name;		
		System.out.println("Full Name: " + fullName);
		
	}
}
