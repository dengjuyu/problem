package com.sist.pr;

import java.util.Scanner;

public class solution10953 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		int t=scan.nextInt();
		//int a,b;
		for(int i=0;i<t;i++) {
			//scan = new Scanner(scan.next()).useDelimiter("\\s*,\\s*");
			//a=scan.nextInt();
			//b=scan.nextInt();
			//System.out.println(a+b);
			String s=scan.next();
			String[] arr = s.split(",");
			System.out.println(Integer.parseInt(arr[0])+Integer.parseInt(arr[1]));
		}

	}
}
