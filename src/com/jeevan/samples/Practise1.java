package com.jeevan.samples;
import java.util.Scanner;


public class Practise1 {

	static void main(String[] args){
		
		String strI,strJ;
		String intZ;
		
		Scanner input;
		input = new Scanner(System.in);
		System.out.println("Enter the value, i : ");
		strI = input.next();

		System.out.println("Enter the value, j : ");
		strJ = input.next();
		
		intZ = strI + strJ;
		
		System.out.println("value, I+J : " + intZ);
		
		input.close();
		
		
	}
}
