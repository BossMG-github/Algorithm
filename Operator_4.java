package Day2.exam;
import java.util.Scanner;
public class Operator_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        --num2;
        int result1 = num1 * num2;
        num1++;

        System.out.print(num1 + " " + num2 + " " + result1);
    }
}
