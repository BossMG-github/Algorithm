package Day2.exam;
import java.util.Scanner;


public class Operator_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);

        int re1 = (a > b) ? 1 : 0;
        int re2 = (a < b) ? 1 : 0;
        int re3 = (a >= b) ? 1 : 0;
        int re4 = (a <= b) ? 1 : 0;

        System.out.println(a + " > " + b +" --- " + re1);
        System.out.println(a + " < " + b +" --- " + re2);
        System.out.println(a + " >= " + b +" --- " + re3);
        System.out.println(a + " <= " + b +" --- " + re4);
    }

}
