package com.jeevan.samples;

public class Mathsamples {

	public void add(int i, int j) {
		System.out.println("Sum: " + (i + j));
	}

	public void multipy(int i, int j) {
		System.out.println("Product: " + i * j);
	}

	public int factorial(int n) {
		int result = 1;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	public int factorialwhile(int n){
		int i = 1; int result = 1;
		while (true){
			if (i<=n){
				result = result * i++;				
			} else {
				return result;
			}
			
		}			
	}
	
}
