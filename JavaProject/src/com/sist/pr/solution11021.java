package com.sist.pr;

import java.util.Scanner;

public class solution11021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		for(int i=0;i<t;i++)
		{
			//String s = scan.next();
			//String[] arr = s.split("\\s+");
			//System.out.println("Case #"+(i+1)+":"+(Integer.parseInt(arr[0])+Integer.parseInt(arr[1])));
			int a,b;
			a = scan.nextInt();
			b = scan.nextInt();
			System.out.println("Case #"+(i+1)+": "+(a+b));
		}
	}

}
