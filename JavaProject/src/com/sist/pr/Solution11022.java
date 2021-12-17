package com.sist.pr;

import java.util.Scanner;

public class Solution11022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		for(int i=0;i<t;i++) {
			int a,b;
			a = scan.nextInt();
			b = scan.nextInt();
			
			System.out.println("Case #"+(i+1)+": "+a+" + "+b+" = "+(a+b));
		}
	}

}
