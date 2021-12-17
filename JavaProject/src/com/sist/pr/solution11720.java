package com.sist.pr;

import java.io.IOException;

public class solution11720 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = 0;
        int tmp = 0;
        while ( (tmp = System.in.read()) != '\n' ) {
            n *= 10;
            n += tmp-'0';
        }
        int count = 0;

        for(int i = 0; i < n; i++) {
            int x = System.in.read() - '0';
            count += x;
        }

        System.out.println(count);

	}

}
