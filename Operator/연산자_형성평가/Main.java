package Operator;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		q5();

//		String str = br.readLine();
//		String array[] = str.split(" ");
//		int a = Integer.parseInt(array[0]);
//		int b = Integer.parseInt(array[1]);
//		System.out.println(a + " " + b);
	}

	static StringTokenizer _scanf() throws IOException {
		return new StringTokenizer(br.readLine());
	}

	static String[] _strsc() throws IOException {
		String str = br.readLine();
		String strarr[] = str.split(" ");
		return strarr;
	} // 공백 단위를 구분 지을 때 String으로만 할 수 있는지 확인해봄.

	static void q1() throws IOException {
		String str[] = _strsc();

		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);
		int d = Integer.parseInt(str[3]);

		System.out.println("sum " + (a + b + c + d));
		System.out.println("avg " + ((a + b + c + d) / 4));

//		  StringTokenizer st = _scanf();
//		  
//		  int a = Integer.parseInt(st.nextToken()); 
//		  int b = Integer.parseInt(st.nextToken()); 
//		  int c = Integer.parseInt(st.nextToken());
//		  int d = Integer.parseInt(st.nextToken());
//		 

		// System.out.println("sum " + (a + b + c + d));
		// System.out.println("avg " + ((a + b + c + d) / 4));

	}

	static void q2() throws IOException {

		String str[] = _strsc();
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);

		int c = a / b;
		int d = a % b;

		System.out.printf("%d / %d = %d...%d", a, b, c, d);

		/*
		 * StringTokenizer st = _scanf();
		 * 
		 * int a = Integer.parseInt(st.nextToken()); int b =
		 * Integer.parseInt(st.nextToken()); int c = a / b; int d = a % b;
		 */

		// System.out.printf("%d / %d = %d...%d", a, b, c, d);
	}

	static void q3() throws IOException {
		String[] str = _strsc();
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);

		System.out.println("width = " + (a + 5));
		System.out.println("length = " + (b * 2));
		int area = (a + 5) * (b * 2);
		System.out.println("area = " + area);

//		  StringTokenizer st = _scanf();
//		  
//		  int a = Integer.parseInt(st.nextToken()); 
//		  int b =Integer.parseInt(st.nextToken());

//		System.out.println("width = " + (a + 5));
//		System.out.println("length = " + (b * 2));
//		int area = (a + 5) * (b * 2);
//		System.out.println("area = " + area);
	}

	static void q4() throws IOException {
		String[] str = _strsc();
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);

		System.out.println(++a + " " + b--);
		System.out.println(a + " " + b);

//		  StringTokenizer st = _scanf();
//		  
//		  int a = Integer.parseInt(st.nextToken()); 
//		  int b = Integer.parseInt(st.nextToken());
//		 
//		System.out.println(++a + " " + b--);
//		System.out.println(a + " " + b);
	}

	static void q5() throws IOException {
		String[] str = _strsc();
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);

		String[] str2 = _strsc();
		int c = Integer.parseInt(str2[0]);
		int d = Integer.parseInt(str2[1]);

		boolean bol = (a > c && b > d) ? true : false;
		System.out.println(bol);

//		StringTokenizer st = _scanf();
//
//		int a = Integer.parseInt(st.nextToken());
//		int b = Integer.parseInt(st.nextToken());
//
//		StringTokenizer st2 = _scanf();
//		int c = Integer.parseInt(st2.nextToken());
//		int d = Integer.parseInt(st2.nextToken());

//		boolean bol = (a > c && b > d) ? true : false;
//		System.out.println(bol);
	}

}
