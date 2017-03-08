package com.jeevan.samples;

/*
 * List of all retail functions
 */

//import java.util.Calendar;
import java.util.*;

	
public class RetailFunctions {

//	Scanner userinput = new Scanner(System.in);
	
	public void profit (float cost, float price) {
		float profit;
		profit = price - cost;
		System.out.println("Profit = " + profit);
	};
	
	public void margin (float cost, float price) {
		float margin;
		margin = (price - cost)*100/cost;
		System.out.println("Margin = " + margin + "%");
	};
	
	//System.out.print("Enter the name: \n");
	
	
	
	/*
	 * 
	 */
	//private class loss {
	//	
	//}
}
