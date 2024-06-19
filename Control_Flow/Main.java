package Control_Flow;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        exam5();
    }

    static String[] _strsc() throws IOException {
        String str = br.readLine();
        String[] strs = str.split(" ");
        return strs;
    }

    static void q1() throws IOException {
        // 선택제어문 - 자가진단1
        int a = Integer.parseInt(br.readLine());
        if(a < 0){
            System.out.println(a);
            System.out.println("minus");
        }
        else
            System.out.println(a);
    }

    static void q2() throws IOException {
        // 선택제어문 - 자가진단2
        String[] str = _strsc();
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        if((b+100-a) > 0){
            System.out.println(b+100-a);
            System.out.println("Obesity");
        }
        else
            System.out.println(b+100-a);
    }

    static void q3() throws IOException {
        // 선택제어문 - 자가진단3

        int a = Integer.parseInt(br.readLine());
        if(a >= 20){
            System.out.println("adult");
        }
        else
            System.out.println((20-a) + " years later");
    }

    static void q4() throws IOException {
        // 선택제어문 - 자가진단4
        double a = Double.parseDouble(br.readLine());
        if(a <= 50.80){
            System.out.println("Flyweight");
        }
        else if(a <= 61.23){
            System.out.println("Lightweight");
        }
        else if(a <= 72.57){
            System.out.println("Middleweight");
        }
        else if(a <= 88.45){
            System.out.println("Cruiserweight");
        }
        else if(a > 88.45){
            System.out.println("Heavyweight");
        }
    }

    static void q5() throws IOException {
        // 선택제어문 - 자가진단6
        String[] str = _strsc();
        double a = Double.parseDouble(str[0]);
        double b = Double.parseDouble(str[1]);

        if(a >= 4.0 && b >= 4.0){
            System.out.println("A");
        }
        else if(a >= 3.0 && b >= 3.0)
        {
            System.out.println("B");
        }
        else
            System.out.println("C");
    }

    static void q6() throws IOException {
        // 선택제어문 - 자가진단6
        String[] str = _strsc();
        char ch = str[0].charAt(0);
        int a = Integer.parseInt(str[1]);
        if(ch == 'M' && a >= 18){
            System.out.println("MAN");
        }
        else if(ch == 'M' && a < 18){
            System.out.println("BOY");
        }
        else if(ch == 'F' && a >= 18){
            System.out.println("WOMAN");
        }
        else if(ch == 'F' && a < 18){
            System.out.println("GIRL");
        }
    }

    static void q7() throws IOException {
        // 선택제어문 - 자가진단7
        char ch = br.readLine().charAt(0);
        switch(ch){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Usually");
                break;
            case 'D':
                System.out.println("Effort");
                break;
            case 'F':
                System.out.println("Failure");
                break;
            default:
                System.out.println("error");
                break;

        }
    }

    static void q8() throws IOException {
        // 선택제어문 - 자가진단9
        double a = Double.parseDouble(br.readLine());
        switch ((int)a){
            case 4:
                System.out.println("scholarship");
            case 5:
                break;
            case 2:
                System.out.println("seasonal semester");
                break;
            case 3:
                System.out.println("next semester");
                break;
            default:
                System.out.println("retake");

        }
    }

    static void q9() throws IOException {
        // 선택제어문 - 자가진단9
        String[] str = _strsc();
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);

        if(a < b && a < c){
            System.out.println(a);
        }
        else if(b < a && b < c){
            System.out.println(b);
        }
        else if(c < a && c < b){
            System.out.println(c);
        }
    }

    static void exam1() throws IOException {
        // 선택제어문 - 형성평가1
        String[] str = _strsc();
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int temp = 0;
        if (a > b) {
            temp = a;
            System.out.println(temp - b);
        } else {
            temp = b;
            System.out.println(temp - a);
        }
    }

    static void exam2() throws IOException{
        // 선택제어문 - 형성평가2
        int a = Integer.parseInt(br.readLine());
        if(a == 0){
            System.out.println("zero");
        }
        else if(a > 0){
            System.out.println("plus");
        }
        else
            System.out.println("minus");
    }

    static void exam3() throws IOException {
        // 선택제어문 - 형성평가3
        int a = Integer.parseInt(br.readLine());
        if(a % 4 == 0 && a % 100 != 0){
            System.out.println("leap year");
        }
        else if(a % 400 == 0){
            System.out.println("leap year");
        }
        else
            System.out.println("common year");
    }

    static void exam4() throws IOException {
        // 선택제어문 - 형성평가4
        System.out.print("Number? ");
        int a = Integer.parseInt(br.readLine());
        switch(a){
            case 1:
                System.out.println("dog");
                break;
            case 2:
                System.out.println("cat");
                break;
            case 3:
                System.out.println("chick");
                break;
            default:
                System.out.println("I don't know.");
                break;
        }
    }

    static void exam5() throws IOException {
        // 선택제어문 - 형성평가5
        int a = Integer.parseInt(br.readLine());
        switch (a){
            case 1:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28");
                break;
            case 3:
                System.out.println("31");
                break;
            case 4:
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("31");
                break;
            case 11:
                System.out.println("30");
                break;
            case 12:
                System.out.println("31");
                break;

        }
    }
}
