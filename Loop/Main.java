package Loop;

import java.io.*;
import java.util.Scanner;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Main mi = new Main();
        mi.q11();

    }

    static String[] _strsc() throws IOException {
        String str = br.readLine();
        String[] strs = str.split(" ");
        return strs;
    }

    static void q1() {
        // 반복제어문1 - 자가진단 1
        for (int i = 1; i <= 15; i++) {
            System.out.print(i + " ");
        }
    }

    static void q2() throws IOException {
        String str = br.readLine();
        int a = Integer.parseInt(str);
        int sum = 0;
        int i = 0;
        while (i < a) {
            i++;
            sum += i;

        }
        System.out.println(sum);
    }

    static void q3() throws IOException {

        while (true) {
            System.out.print("number? ");
            String str = br.readLine();
            int a = Integer.parseInt(str);
            if (a == 0) {
                break;
            } else if (a > 0) {
                System.out.println("positive integer");
            } else if (a < 0) {
                System.out.println("negative number");
            }

        }
    }

    static void q4() throws IOException {

        String[] str = _strsc();
        int i = 0;
        int sum = 0;
        while(true){
            int a = Integer.parseInt(str[i]);
            sum+=a;
            if(a>=100){
                break;
            }



            i++;
        }
        System.out.println(sum);
        System.out.printf("%.1f", sum/(double)str.length);

       /* Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        while (true) {
            i++;
            int a = sc.nextInt();
            sum += a;
            if(a >= 100){
                break;
            }



        }
        System.out.println(sum);
        System.out.printf("%.1f", sum/(double)i);*/
    }

    static void q5() throws IOException {

        while(true){
            System.out.print("(입력)");
            String str = br.readLine();
            int a = Integer.parseInt(str);
            if(a % 3 == 0){
                System.out.print("(출력)");
                System.out.println(a / 3);
            }
            else if(a == -1){
                break;
            }
        }
    }


    static void q6() throws IOException {
        String[] str = {"Korea", "USA", "Japan", "China"};
        String[] _str = {"Seoul", "Washington", "Tokyo", "Beijing"};

        while(true){
            for(int i=0;i<str.length;i++)
            {
                System.out.println(i+1 + ". " + str[i]);
            }
            System.out.print("number? ");
            String str2 = br.readLine();
            if(str2 == null){
                break;
            }
            System.out.println();
            switch(Integer.parseInt(str2)) {
                case 1:
                    System.out.println(_str[0]);
                    System.out.println();
                    break;
                case 2:
                    System.out.println(_str[1]);
                    System.out.println();
                    break;
                case 3:
                    System.out.println(_str[2]);
                    System.out.println();
                    break;
                case 4:
                    System.out.println(_str[3]);
                    System.out.println();
                    break;
                default:
                    System.out.println("none");
                    break;
            }
            if(Integer.parseInt(str2) > 4 || Integer.parseInt(str2) <= 0)
            {
                break;
            }
        }
    }

    void q7() throws IOException {
        // 반복제어문1 - 형성평가1
        String str = br.readLine();
        int a = Integer.parseInt(str);

        for(int i = 0; i<a;i++){
            System.out.print((i+1) + " ");
        }

    }

    void q8() throws IOException {
        // 반복제어문1 - 형성평가2
        String[] str = _strsc();
        int i = 0;
        int x = 0;
        int y = 0;

        while(i < str.length){
            int a = Integer.parseInt(str[i]);
            i++;
            if(a == 0)
                break;

            if(a%2 == 0)
                x++;
            else
                y++;

        }
        System.out.println("odd : "+y );
        System.out.println("even : "+x);
    }

    void q9() throws IOException {
        // 반복제어문1 - 형성평가3
        String[] str = _strsc();
        int sum = 0;
        int i = 0;

        while(true)
        {
            int a = Integer.parseInt(str[i]);
            i++;
            if(a > 100 || a < 0)
                break;
            sum+=a;

        }
        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f", sum/(double)(str.length-1));
    }
    void q10() throws IOException {
        // 반복제어문1 - 형성평가5
        String[] str = _strsc();
        int i = 0;
        int x = 0;
        while(true){
            int a = Integer.parseInt(str[i]);
            i++;
            if(a == 0)
                break;

            if(a%3!=0 && a%5!=0)
                x++;

        }
        System.out.println(x);
    }
    void q11() throws IOException {
        // 반복제어문1 - 형성평가5
        Scanner scanner = new Scanner(System.in);
        char ch = ' ';

        do {
            System.out.print("Base = ");
            double base = scanner.nextDouble();

            System.out.print("Height = ");
            double height = scanner.nextDouble();

            double area = (base * height) / 2;
            System.out.printf("Triangle width = %.1f\n", area);

            System.out.print("Continue? ");
            ch = scanner.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');

    }
}

