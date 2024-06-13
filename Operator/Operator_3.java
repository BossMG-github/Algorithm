package Day2.exam;
import java.util.Scanner;

public class Operator_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();

        int num1 = Integer.parseInt(str1);

        System.out.println(num1++);
        System.out.println(++num1);
    }
}
