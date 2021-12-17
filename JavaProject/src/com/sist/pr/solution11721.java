package com.sist.pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution11721 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		int length = word.length();
		int a = 0;
		
		for(int i=1;i<=length;i++) {
			if(i % 10 == 0) {
				System.out.println(word.substring(i-10,i));
				a = (i%10) + 10 ;
				//System.out.println(word.charAt(i));
			}
			if(a != (i%10)) {
				System.out.println(word.substring(a));
			}
			//System.out.println(word.charAt(i));
			
		}
	}

}
