package org.git.java;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number :");
		int t = s.nextInt();
		
			if(t%2==0) {
				System.out.println("Its a Even Number");
			}
			else {
				System.out.println("Its a Odd Number");
			}
			
		}
	}

