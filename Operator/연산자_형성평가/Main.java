package Operator;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		q5();
	}

	static StringTokenizer _scanf() throws IOException {
		return new StringTokenizer(br.readLine());
	}

	static void q1() throws IOException {
		StringTokenizer st = _scanf();

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());

		System.out.println("sum " + (a + b + c + d));
		System.out.println("avg " + ((a + b + c + d) / 4));

	}

	static void q2() throws IOException {
		StringTokenizer st = _scanf();

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = a / b;
		int d = a % b;

		System.out.printf("%d / %d = %d...%d", a, b, c, d);
	}

	static void q3() throws IOException {
		StringTokenizer st = _scanf();

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		System.out.println("width = " + (a + 5));
		System.out.println("length = " + (b * 2));
		int area = (a + 5) * (b * 2);
		System.out.println("area = " + area);
	}

	static void q4() throws IOException {
		StringTokenizer st = _scanf();

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		System.out.println(++a + " " + b--);
		System.out.println(a + " " + b);
	}

	static void q5() throws IOException {
		StringTokenizer st = _scanf();

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		StringTokenizer st2 = _scanf();
		int c =	Integer.parseInt(st2.nextToken());
		int d = Integer.parseInt(st2.nextToken());
		
		boolean bol = (a > c && b > d) ? true : false;
		System.out.println(bol);
	}

}
