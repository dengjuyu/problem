package com.sist.pr;
import java.util.*;
import java.io.*;
// EOF
public class solution10951 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str;
		// br.readLine() 하나의 줄을 읽어온다.
		// 여기서 저장을 안하면 읽고나서 버려짐
		while( (str=br.readLine()) != null ) {
			st=new StringTokenizer(str," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			sb.append(a+b).append('\n');
		}
		System.out.println(sb);
	}
	/*
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(scan.nextInt()+scan.nextInt());
	}
	*/
	// 자바의 입력 방법
	/*
	 *   1. Scanner
	 *      장점 : 사용하기 편하다
	 *      단점 : 속도가 느리다
	 *      
	 *      EoF 처리 방식
	 *      hasNextLine() 메소드를 사용하여 더 이상 읽어들일 라인이 없다면 false 반환
	 *      
	 *      Scanner sc = new Scanner(System.in);
	 *      while(sc.hasNextLine()){
	 *         // 코딩
	 *      }
	 *      
	 *      
	 *      	public static void main(String[] args) {
					Scanner sc = new Scanner(System.in);
					
					while(sc.hasNext()) {
						int x = sc.nextInt();
						int y = sc.nextInt();
						
						System.out.println(x+y);
					}
					sc.close();
				}
	 *      
	 *      
	 *      
	 *   2. BufferedReader
	 *      장점 : 속도가 빠르다
	 *      
	 *      EoF 처리 방식
	 *      readLine()은 true false 같은 boolean값이 아닌 null을 반환한다
	 *      
	 *      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 *      String str="";
	 *      while( (str=br.readLine()) != null ) {
	 *         // 코딩
	 *      }
	 *        
	 */
	/*
	 *    BufferedReader
	 *    
	 *    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	 *    String s = bf.readLine();
	 *    int i = Integer.parseInt(bf.readLine());
	 *    
	 *    입력은 readLine(); 이라는 메소드를 활용하는데, 여기서 반드시 주의해야할 점은
	 *    1. 리턴값을 String으로 고정되기에 String이 아닌 다른 타입으로 입력을 받으려면 형변환 필수
	 *    2. 예외처리 필수
	 *       try ~ catch를 이용해도 되지만,
	 *       throws IOException 사용
	 *       
	 *    Read한 데이터는 Line단위로만 나뉘어지기 때문에 공백 단위로 데이터를 가공하려면 따로 작업
	 *    1. StringOkenizer에 nextToken()함수 사용 -> readLine()을 통해 입력받은 값을 공백 단위로 구분하여 순서대로 호출
	 *       StringTokenizer st = new StringTokenizer(s);
	 *       int a = Integer.parseInt(st.nextToken());
	 *       int b = Integer.parseInt(st.nextToken());
	 *    2. String.split()함수를 활용하여 배열에 공백단위로 끊어서 데이터를 넣고 사용하는 바잇ㄱ
	 *       String array[] = s.split(" "); 
	 */

	
}
