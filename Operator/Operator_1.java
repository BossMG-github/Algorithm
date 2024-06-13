package Day2.exam;
import java.util.Scanner;

public class Operator_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        int _str1 = Integer.parseInt(str1);
        int _str2 = Integer.parseInt(str2);
        int _str3 = Integer.parseInt(str3);
        int sum = _str1 + _str2 + _str3;
        int avg = (int)((_str1 + _str2 + _str3) / 3);
        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);
    }
}
