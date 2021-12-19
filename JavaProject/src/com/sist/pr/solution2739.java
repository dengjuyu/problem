package com.sist.pr;

import java.util.Scanner;

public class solution2739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		for(int i=1;i<=9;i++) {
				System.out.println(n+" * "+i+" = "+(n*i));
			
		}
	}

}
