package com.bridgelabz.logicalproblems;

import java.util.Scanner;

public class PrimeNumbersUc3 {

	public static void main(String[] args) {
		int i, count=0;
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("Enter a Number: ");
	     int num = sc.nextInt();
	      
	      for(i = 2; i <= num/2 ; i++)
	      {
	         if(num % i == 0)
	         {
	            count++;
	            break;
	         }
	      }
	      
	      if(count==0 && num!=1)
	         System.out.println("\nIt is a Prime Number.");
	      else
	         System.out.println("\nIt is not a Prime Number.");
	}

}
