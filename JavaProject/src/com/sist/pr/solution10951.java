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
		// br.readLine() �ϳ��� ���� �о�´�.
		// ���⼭ ������ ���ϸ� �а��� ������
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
	// �ڹ��� �Է� ���
	/*
	 *   1. Scanner
	 *      ���� : ����ϱ� ���ϴ�
	 *      ���� : �ӵ��� ������
	 *      
	 *      EoF ó�� ���
	 *      hasNextLine() �޼ҵ带 ����Ͽ� �� �̻� �о���� ������ ���ٸ� false ��ȯ
	 *      
	 *      Scanner sc = new Scanner(System.in);
	 *      while(sc.hasNextLine()){
	 *         // �ڵ�
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
	 *      ���� : �ӵ��� ������
	 *      
	 *      EoF ó�� ���
	 *      readLine()�� true false ���� boolean���� �ƴ� null�� ��ȯ�Ѵ�
	 *      
	 *      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 *      String str="";
	 *      while( (str=br.readLine()) != null ) {
	 *         // �ڵ�
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
	 *    �Է��� readLine(); �̶�� �޼ҵ带 Ȱ���ϴµ�, ���⼭ �ݵ�� �����ؾ��� ����
	 *    1. ���ϰ��� String���� �����Ǳ⿡ String�� �ƴ� �ٸ� Ÿ������ �Է��� �������� ����ȯ �ʼ�
	 *    2. ����ó�� �ʼ�
	 *       try ~ catch�� �̿��ص� ������,
	 *       throws IOException ���
	 *       
	 *    Read�� �����ʹ� Line�����θ� ���������� ������ ���� ������ �����͸� �����Ϸ��� ���� �۾�
	 *    1. StringOkenizer�� nextToken()�Լ� ��� -> readLine()�� ���� �Է¹��� ���� ���� ������ �����Ͽ� ������� ȣ��
	 *       StringTokenizer st = new StringTokenizer(s);
	 *       int a = Integer.parseInt(st.nextToken());
	 *       int b = Integer.parseInt(st.nextToken());
	 *    2. String.split()�Լ��� Ȱ���Ͽ� �迭�� ��������� ��� �����͸� �ְ� ����ϴ� ���դ�
	 *       String array[] = s.split(" "); 
	 */

	
}
