package Day2.exam;
import java.util.Scanner;

public class Operator_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        if(num1 == num2)
        {
            System.out.println("true");
        }
        if(num1 != num2)
        {
            System.out.println("false");
        }

    }
}
