package day9.section5;


import java.util.Random;

public class Prob1 {

  public static void main(String[] args) {

    int[] ia = new int[]{3,7,1,8,10,2,15,2,10};
    int[] ib = new int[]{1,2,3,4,5};
    System.out.println("배열 ia");
    arr(ia);
    System.out.println("배열 ib");
    arr(ib);

    arr2();
  }

  static void arr(int[] arr){
    int evenSum = 0;
    int oddSum = 0;
    for(int i = 0; i<arr.length; i++){
      if(arr[i]%2 == 0){
        evenSum += arr[i];
      }
      else{
        oddSum += arr[i];
      }
    }
    System.out.println("홀수의 합 : " + oddSum);
    System.out.println("짝수의 합 : " + evenSum);
  }

  static void arr2(){
    System.out.println("문제 2번입니다.");
    Random ran = new Random();
    int[] ar = new int[5];
    for(int i = 0; i<ar.length; i++){
      ar[i] = (ran.nextInt(101)+1);
    }
    for(int i : ar){
      System.out.print(i + " ");
    }
  }


}

