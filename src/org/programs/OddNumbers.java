package org.programs;

import java.util.Scanner;

public class OddNumbers {
	private static Scanner a;

	public static void main(String[] args) {
	System.out.println("Enter the number");
	a = new Scanner(System.in);
	int i=a.nextInt();
	if(i%2==0)
	{
		System.out.println("Even no");
	}
	else
	{
		System.out.println("Odd no");
	}
	
	
	


	}
}

