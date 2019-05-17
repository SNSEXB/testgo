package com.Javaprograms.InputOutput;

import java.util.Scanner;

public class Simplescanner2 {
	public static void main(String[] args) {	
    //int[] a = new int[3];
		int i = 0;
		String s = "";
		Double d = 0.0;
    Scanner scan = new Scanner(System.in); 
   
     i = scan.nextInt();
     d = scan.nextDouble();
     scan.nextLine();
     s = scan.nextLine();
    
     
    
    
    // Write your code here.
    System.out.println("String: " + s);
    System.out.println("Double: " + d);
    System.out.println("Int: " + i);
	}
    
}

