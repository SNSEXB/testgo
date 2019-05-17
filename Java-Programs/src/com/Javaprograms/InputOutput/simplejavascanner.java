package com.Javaprograms.InputOutput;

import java.util.Scanner;

public class simplejavascanner {
	public static void main(String[] args) {	      
	        int[] a = new int[3];
	        Scanner scan = new Scanner(System.in);
	        for(int i =0; i<3;i++)
	        {
	         a[i] = scan.nextInt();
	        }
	      
	        for(int i =0; i<3;i++)
	        {
	        System.out.println(a[i]);
	        }
	        scan.close();
	    }

}
