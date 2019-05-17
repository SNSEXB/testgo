package com.Javaprograms.MathPackage;

import java.util.Scanner;

public class MathMultiplication {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) 
	{		
		int N = scanner.nextInt();		
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i=1;i<=10;i++)
        {         
          System.out.printf("%d * %d = %d%n",N,i,(N*i));
        }
        scanner.close();
	}

}
