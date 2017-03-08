package com.jeevan.samples;

//import java.util.ArrayList;
//import java.util.List;

public class MathMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mathsamples mathobj = new Mathsamples();
		mathobj.add(10, 20);
		mathobj.multipy(7, 8);
		int factorialResult = mathobj.factorial(5);
		System.out.println ("Factorial Result = " + factorialResult);
		System.out.println(mathobj.factorialwhile(6));
//List list1 = new ArrayList();
//ArrayList list2 = new ArrayList();
	}

}
