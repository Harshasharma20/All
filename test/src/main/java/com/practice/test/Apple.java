package com.practice.test;

public class Apple {
	
	/*
	 * @Override public String toString() { return "a"; }
	 * 
	 * public static void main(String[] args) { Apple apple = new Apple();
	 * System.out.println(apple.toString()); }
	 */

	public static void main(String[] args) {
		//Trianle
		/*
		 * int a = 30; int b = 20; int c = 0;
		 * 
		 * if(a==b || b==c && c==a) { System.out.println("1"); } else if(a==b || b==c ||
		 * c==a) { System.out.println("0"); } else { System.out.println("-1"); }
		 */
		
		//Sum
		/*
		 * int a = 1; int b = 20; int sum=0; for(a=1;a<=b;a++) { if(a%2==0) { sum=sum+a;
		 * 
		 * }
		 * 
		 * } System.out.println(sum);
		 */
		
		//GCD
		int a = 30,b=20;
		System.out.println(gcd(a,b));
		
		
	}
	
	public static int gcd(int a, int b) {
		if(b==0) 
			return a;
		else 
			return gcd(b, a%b);
		
	}
}
