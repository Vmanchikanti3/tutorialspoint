package helloworld;

import java.util.Scanner;

public class ifStatement {
	
	public static void main(String[] args) {
		
		int n;
		
		System.out.println("Please enter a number ");
		
		Scanner sc = new Scanner(System.in);
		
		n= sc.nextInt();
		if(n%2 ==0)
		System.out.println("given number is even");
	else
		System.out.println("given number is odd");
		 

			
		  
		

	}

}
