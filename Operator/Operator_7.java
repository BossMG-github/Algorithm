package Day2.exam;
import java.util.Scanner;

public class Operator_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);

        boolean x = (a != 0);
        boolean y = (b != 0);

        boolean xy = x && y;
        boolean _xy = x || y;

        System.out.println(xy + " "+_xy);

    }

}
