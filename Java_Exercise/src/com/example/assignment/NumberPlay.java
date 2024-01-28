package com.example.assignment;

import java.util.Scanner;

public class NumberPlay {
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
	
		if(num>50) {
			System.out.println("output:"+rev_diff(num));
    	}
		else
    	{
			System.out.println("output:"+diffOfTwo(num));
    	}
		
		sc.close();
	}
	
	public static int rev_diff(int num) {
		int rev = reverse(num);
		int rev_no_diff = diffOfTwo(rev);
		return rev_no_diff;
		
	}
	public static int reverse(int num) {
		
		int rev_no = 0;
		while(num>0) {
			rev_no = rev_no*10 + num%10;
			num = num/10;
		}
		
		return rev_no;
		
	}
	
	public static int diffOfTwo(int num) {
		
		String noStr = Integer.toString(num);
		int result = 0;
		for(int i=0;i < noStr.length() - 1;i++) {
			int digit1 = Character.getNumericValue(noStr.charAt(i));
			int digit2 = Character.getNumericValue(noStr.charAt(i+1));
			int diff = Math.abs(digit1 - digit2);
			result+=diff;
			
		}
		return result;
	}
}
