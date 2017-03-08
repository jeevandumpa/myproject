package com.jeevan.samples;

import java.util.*;
//import java.util.Scanner;

public class RetailMain {
private double cost;
private double price;
private double profitorloss;

public static void main(String[] args) {
		// TODO Auto-generated method stub
		float fcost;
		float fprice;
		
		Scanner inp;
		inp = new Scanner(System.in);
		
		System.out.println("Enter cost price: \n");
		fcost =  Float.parseFloat(inp.next());
				
		System.out.println("Enter Sale Price: \n");
		fprice = Float.parseFloat(inp.next());
		
//		float fcost = 100;
//		float fprice = 200; 
		
		RetailFunctions myrfunction = new RetailFunctions();
		myrfunction.profit(fcost,fprice);
		
		if (fcost!= 0) {
		myrfunction.margin(fcost,fprice);
		}
		else {
			System.out.println("Cost is invalid less than zero");
		}
		
	}

}
