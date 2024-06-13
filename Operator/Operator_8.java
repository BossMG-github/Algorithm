package Day2.exam;
import java.util.Scanner;

public class Operator_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        int c = Integer.parseInt(str3);

        if(a > b && a > c)
        {
            System.out.print("1 ");
        }
        else
        {
            System.out.print("0 ");
        }

        if(a == b && a == c)
        {
            System.out.print("1 ");
        }
        else
        {
            System.out.print("0 ");
        }
    }
}
