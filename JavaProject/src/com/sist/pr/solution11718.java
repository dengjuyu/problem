package com.sist.pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class solution11718 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		ArrayList<String> strList = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<100;i++) {
			String str = br.readLine();
			if(str == null) {
				break;
			}else {
				strList.add(str);
			}
		}
		for(int i=0;i<strList.size();i++) {
			System.out.println(strList.get(i));
		}
	}

}
