package debugging;
import java.io.*;
import java.util.Calendar;
public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		exam4();
	
	}
	
	static String[] _strsc() throws IOException {
		String str = br.readLine();
		String strarr[] = str.split(" ");
		return strarr;
	} // 입력 받기 위한 함수.
	
	static void q1() throws IOException{
		// 연습문제1
		String[] str = _strsc(); // 함수 호출.
		double d1 = Double.parseDouble(str[0]);
		double d2 = Double.parseDouble(str[1]);
		System.out.printf("%d %d", (int)(d1+d2), (int)d1 + (int)d2);
		// 두 수의 합을 정수로 변환.
		// 두 수를 각각 정수로 변환 후 합.
		
	}
	
	static void q2() throws IOException{
		// 자가진단1
		String[] str = _strsc();
		double d1 = Double.parseDouble(str[0]);
		double d2 = Double.parseDouble(str[1]);
		System.out.printf("%d %d", (int)(d1*d2), (int)d1 * (int)d2);
		// 두 수의 곱을 정수로 변환.
		// 두 수를 각각 정수로 변환 후 곱.
	}
	static void q3() throws IOException{
		// 연습문제2
		String[] str = _strsc();
		int x = Integer.parseInt(str[0]);
		System.out.printf("%d / 4 = %d\n", x, x / 4);
		System.out.printf("%d / 4.0 = %.2f", x, (double)x / 4.0);
	}
	static void q4() throws IOException{
		// 자가진단2
		String[] str = _strsc();
		int x = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[1]);
		System.out.printf("%d %.2f", (int)((double)x/y) ,(double)x/(double)y);
		
	}
	
	static void exam1() throws IOException{
		// 형성평가1
		String[] str = _strsc();
		int x = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[1]);
		int z = Integer.parseInt(str[2]);
		
		System.out.printf("%.1f", (double)(x+y+z) / str.length);
	}
	
	static void exam2() throws IOException{
		// 형성평가2

        String input = br.readLine();
        String[] str = input.split(" ");
        double x = Double.parseDouble(str[0]);
        double y = Double.parseDouble(str[1]);
        double z = Double.parseDouble(str[2]);
        
        int sum = (int)(x) + (int)(y) + (int)(z);
        
       
        int avg = (int)((x + y + z) / 3);
        

        System.out.printf("sum %d\n", sum);
        System.out.printf("avg %d\n", avg);
	}
	
	static void exam3() throws IOException{
		// 형성평가3

        int a = 5;
        a+=10;
        a = a-1;
        System.out.printf("%d\n", a);
	}
	static void exam4() throws IOException{
		// 형성평가4
		// 답은 따로 없는 거 같다....
		Calendar cal = Calendar.getInstance(); // 추상클래스는 객체 생성 X, 즉 new X
		int a = 0;
		a = cal.get(Calendar.YEAR)-1900;// 2024 - 1900
		System.out.printf("%d\n",a); 
		a+=cal.get(Calendar.MONTH);	// 124 + 5
		System.out.printf("%d\n",a); 
		a+=cal.get(Calendar.DATE); // 129 + 15
		System.out.printf("%d\n",a); 
		
	}
}
