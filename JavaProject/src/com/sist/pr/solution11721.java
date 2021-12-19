package com.sist.pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution11721 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		for(int i=0;i<word.length();i++) {
			System.out.print(word.charAt(i));
			if(i%10 == 9) {
				System.out.println();
			}
		}
	}

}
