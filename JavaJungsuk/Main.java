package JavaJungsuk;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    q4_10();
  }

  static void q4_1() {
    int x = 19;

    if (x > 10 && x < 20) {
      System.out.println("true");
    }
  }

  static void q4_1_2() {
    char ch = ' ';
    if (ch != ' ' || ch != '\t') {
      System.out.println("true");
    }
  }

  static void q4_1_3() {
    char ch = 'x';
    if (ch == 'x' || ch == 'X') {
      System.out.println("true");
    }
  }

  static void q4_1_4() {
    char ch = 30;
    if (ch >= 0 && ch <= 9) {
      System.out.println("true");
    }
  }

  static void q4_1_5() {
    char ch = 'a';
    if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
      System.out.println("true");
    }
  }

  static void q4_1_6() {
    int year = 2000;
    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
      System.out.println("true");
    }
  }

  static void q4_1_7() {
    boolean powerOn = false;

    if (false) {
      System.out.println("true");
    }
  }

  static void q4_1_8() {
    String str = "yes";
    if (str.equals("yes")) {
      System.out.println("true");
    }
  }

  static void q4_2() {
    int sum = 0;
    for (int i = 1; i <= 20; i++) {
      if (i % 2 == 0 || i % 3 == 0) {

      } else {
        sum += i;
      }
    }
    System.out.println(sum);
  }

  static void q4_3() {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= i; j++) {
        sum += j;
      }
    }
    System.out.println(sum);
  }

  static void q4_4() {

    int sum = 0;
    int a = 1;
    int count = 0;

    while (sum < 100) {
      if (count % 2 == 0) {
        sum -= a;
      } else {
        sum += a;
      }
      a++;

      count++;
    }
    System.out.println(count);
  }

  static void q4_5() {
    /*for(int i = 0; i <= 10; i++){
      for(int j = 0; j <= i; j++){
        System.out.print("*");
      }
      System.out.println();
    }*/
    int i = 0;
    int j = 0;
    while (i <= 10) {
      while (j <= i) {
        System.out.print("*");
        j++;
      }
      j = 0;
      System.out.println();
      i++;
    }
  }

  static void q4_6() {
    for (int i = 1; i <= 6; i++) {
      for (int j = 1; j <= 6; j++) {
        if (i + j == 6) {
          System.out.println(i + " " + j);
        }
      }
    }
  }

  static void q4_7() {
    String str = "12345";
    int sum = 0;

    for (int i = 0; i < str.length(); i++) {
      sum += Integer.parseInt(str.charAt(i) + "");
    }

    System.out.println("sum = " + sum);
  }

  static void q4_8() {
    int value = (int) (Math.random() * 6) + 1;
    System.out.println("value : " + value);
  }

  static void q4_9() {
    int num = 12345;
    int sum = 0;
    String str = Integer.toString(num);

    for (int i = 0; i < str.length(); i++) {
      sum += Integer.parseInt(str.charAt(i) + "");
    }
    System.out.println("sum = " + sum);
  }

  static void q4_10() {
    int answer = (int) (Math.random() * 100) + 1;
    int input = 0;
    int count = 0;

    Scanner sc = new Scanner(System.in);

    do {
      count++;
      System.out.print("1과 100사이의 값을 입력하세요 : ");
      input = sc.nextInt();
      if (input == answer) {
        System.out.println("당첨입니다.");
        System.out.println(count + " 번 만에 당첨되었습니다.");
        break;
      } else if (answer < input) {
        System.out.println("더 작은 수를 입력하세요.");
      } else if (answer > input) {
        System.out.println("더 큰 수를 입력하세요.");
        System.out.println(answer);
      }
    } while (true);
  }

}
