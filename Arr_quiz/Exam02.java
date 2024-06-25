package day9.section5;

import java.util.Scanner;

public class Exam02 {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {

    int[] n = new int[5];
    int sum = 0;
    for(int i = 0; i < n.length; i++) {
      n[i] = sc.nextInt();
      sum += n[i];
    }
    double avg = 0.0;
    for(int i = 0; i < n.length; i++) {
      avg = ((double)n[i]/sum)*100;
      for(int j = 0; j < (int)avg; j++){
        System.out.print("*");
      }
      System.out.printf("%f%n", avg);
    }


    System.out.println("문제 2번.");
    char[][] alphabet = new char[5][5];
    char start = 'A';

    //1.배열에 알파벳 입력
    for(int i = 0; i < alphabet.length; i++) {
      for(int j = 0; j < alphabet[i].length; j++) {
        alphabet[i][j] = start;
        start++;
      }
    }
    //2.원본 배열 출력
    for(int i = 0; i < alphabet.length; i++) {
      for(int j = 0; j < alphabet[i].length; j++) {
        System.out.print(alphabet[i][j] + "\t\t\t");
      }
      System.out.println();
    }
    //3. 배열 수정
    start = 'A';
    for(int i = 0; i < alphabet.length; i++) {
      for(int j = 0; j < alphabet[i].length; j++) {
        alphabet[i][j] = start;
        start++;
      }
    }
    System.out.println();
    //4. 수정된 배열 출력
    System.out.println("수정한 배열입니다.");
    System.out.println("=======================================");
    start = 'A';
    for(int i = 0; i < alphabet.length; i++) {
      for(int j = 0; j < alphabet[i].length; j++) {
        if(alphabet[i][j] == 'A' || alphabet[i][j] % start == 0) {
          start+=6;
          System.out.print("*\t\t");
          continue;
        }
        System.out.print(alphabet[i][j] + "\t\t");
      }
      System.out.println();
    }
  }

}
