package Programmers;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {


    }

    private static void q1() {
        // 주석문 - 실습
        // 이 부분을 주석처리 해서 프로그램이 정상적으로 실행되도록 만들어 보세요.
        System.out.println("HelloWorld"); // 출력
    }

    private static void q2() {
        // 변수 - 실습
        // 정수형 변수, number를 선언하고 3을 저장해보세요.

        int number = 3;

        System.out.println(number);
    }

    private static void q3() {
        // 상수 - 실습
        // 상수 PI를 만들어보세요.

        final double PI = 3.14159;

        int radius = 5;
        double result = radius * 2 * PI;
        System.out.println(result);
    }

    private static void q4() {
        // 기본형타입 - 실습

        boolean isFun = false;

        char charValue = 'a';

        int intValue = 20;

        long longValue = 2147483648L;

        System.out.println(isFun);
        System.out.println(charValue);
        System.out.println(intValue);
        System.out.println(longValue);
    }

    private static void q5() {
        // 기본형 타입 변환 - 실습1
        int intValue = 200;
        //빈칸에 long타입 변수 longValue를 선언하고 변수를 intValue를 이용해 초기화해보세요.

        long longValue = intValue;

        System.out.println(longValue);
    }

    private static void q6() {
        // 기본형 타입 변환 - 실습2
        long longValue = 20;
        //이 아래줄에 int형 변수 intValue를 선언하고 longValue에 들어있는 값을 담아보세요.

        int intValue = (int) longValue;

        System.out.println(intValue);
    }


    public int[] q7() {
        // 산술연산자 - 실습

        int a = 7;
        int b = 3;

        //c는 a와 b의 합
        int c =
                a + b;

        //d는 a와 b의 차
        int d =
                a - b;

        //e는 a와 b의 곱
        int e =
                a * b;

        //f는 a를 b로 나눈 나머지
        int f =
                a % b;


        System.out.printf("c는: %d\n", c);
        System.out.printf("d는: %d\n", d);
        System.out.printf("e는: %d\n", e);
        System.out.printf("f는: %d\n", f);

        int ret[] = {c, d, e, f};
        return ret;
    }

    public boolean[] q8(int a, int b) {
        // 비교연산자 - 실습

        //변수 a와 b는 int형 변수입니다. 각각 어떤 값을 가지고 있는지는 비교해 보기 전에는 모릅니다.
        //a와 b가 주어져 있다고 가정하고 아래 지시에 따라 문제를 풀어 보세요.

        //a가 b보다 큰 지 비교한 결과(true 또는 false)를 c에 저장하세요.
        boolean c =
                a > b;


        //a와 b가 같은지 비교한 결과를 d에 저장하세요.
        boolean d =
                a == b;


        //a와 b가 다른지 비교한 결과를 e에 저장하세요.
        boolean e =
                a != b;


        //이 아래 코드는 결과 테스트를 위한 코드입니다.
        boolean ret[] = {c, d, e};
        return ret;
    }

    private void q9() {
        // if문 - 실습1
        int value =
                3;
        ;
        if (value % 3 == 0) {
            System.out.println("value는 3의 배수입니다.");
        }
    }

    public int q10(int value) {
        // if문 - 실습2
        // 변수 value가 선언되어 있다고 가정하고 아래에 코드를 작성하세요.
        int ret = 0;
        if (value % 3 == 0) {
            ret = 3;
        }// 이 아래 줄에 else 구문을 추가해서 코드를 완성하세요.
        else if (value % 4 == 0) {
            ret = 4;
        }
        // 결과 체크를 위한 코드입니다.
        return ret;
    }

    public boolean q11(int age) {
        // 논리연산자 - 실습1

        boolean isDiscount = false;
        // 아래 빈칸을 채워 코드를 완성하세요.
        if(
                age <= 19
        ) {
            isDiscount = true;
        }
        else {
            isDiscount = false;
        }
        return isDiscount;
    }

    public boolean q12(int age) {
        // 논리연산자 - 실습2

        boolean isTwenties = false;
        //아래 빈칸을 채워 코드를 완성하세요.
        if(
                age <= 29 && age >= 20
        ) {
            isTwenties = true;
        }
        else {
            isTwenties = false;
        }
        return isTwenties;
    }

    private void q13() {
        // 삼항연산자 - 실습

        // hour에는 현재 시간이 24시간 단위로 들어 있습니다.
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        String ampm;
        // 삼항연산자를 이용해서 ampm의 값을 "오전" 또는 "오후"로 만들어보세요.
        ampm =
                (hour < 12) ? "오전" : "오후";

        System.out.println("지금시간은 " + hour + "시이고, " + ampm + "입니다.");
    }

    private static void q14() {
        // switch문 - 실습1

        // month에는 오늘이 몇 월인지 들어 있습니다.
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        String season = "";
        // switch문을 이용해서 season이 오늘은 어떤 계절인지 나타내게 만들어보세요.
        switch(month){
            case 12:
                season = "겨울";
            case 1:
            case 2:
                break;
            case 3:
                season = "봄";
            case 4:
            case 5:
                break;
            case 6:
                season = "여름";
            case 7:
            case 8:
                break;
            case 9:
                season = "겨울";
            case 11:
                break;
        }

        System.out.println("지금은 " + month + "월이고, " + season + "입니다.");
    }

    private void q15() {
        // switch문 - 실습2

        // 오늘이 몇 월인지 month에 저장합니다.
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        String season = "";

        // 다음과 같이 case문을 한번에 사용하면 더 짧게 코드를 짤 수 있습니다.
        switch(month) {
            case 1:
            case 2:
            case 12:
                season = "겨울";
                break;
            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
        }
        System.out.println("지금은 " + month + "월이고, " + season + "입니다.");
    }

    private static void q16() {
        // while문 - 실습1

        int i = 1;
        // while 문을 써서 1부터 10까지 숫자를 출력해보세요.
        while(i<11)
        {
            System.out.println(i);
            i++;
        }
    }

    private static void q17() {
        // while문 - 실습2

        int i = 1;
        while(i < 11){
            // if 문을 추가해, i가 짝수일때만 i를 출력하는 코드를 짜보세요.
            if(i % 2 == 0)
            {
                System.out.println(i);
            }
            i++;
        }
    }

    private static void q18() {
        // for문 - 실습

        //for문을 이용해서 1부터 100까지 숫자 중 짝수만 출력해 보세요
        for(int i = 1; i <= 100; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i);
            }
        }
    }

    public int[] q19() {
        // 배열만들기 - 실습

        // 길이가 5인 정수형 배열 array를 만들어보세요.
        // array의 원소는 차례로 1, 2, 3, 4, 5 여야합니다.
        int[] array = {1,2,3,4,5};

        // 아래는 결과 평가를 위한 코드입니다. 수정하지 마세요.
        return array;
    }

    public int[] q20() {
        // 배열 사용하기 - 실습1

        int[] array = new int[100];
        // array에 순서대로 1부터 100까지 정수를 넣어보세요.
        for(int i =0; i<100; i++){
            array[i] = i+1;
        }
        // 아래는 결과 평가를 위한 코드입니다. 수정하지 마세요.
        return array;
    }

    public int q21(int[] array) {
        // 배열 사용하기 - 실습2

        int sum = 0;
        // array는 길이를 알 수 없는 int형 배열입니다.
        // 변수 sum에 array의 모든 값을 더해보세요.
        for(int i =0; i<array.length;i++){
            sum += array[i];
        }
        // 아래는 결과 평가를 위한 코드입니다. 수정하지 마세요.
        return sum;
    }

    private static void q22(){
        // 2차원배열 - 실습

        int [][] array = {{1}, {1, 2}, {1, 2, 3}, {1, 2, 3, 4}};

        // 2차원 배열 array를 출력합니다.
        for(int i = 0 ; i < array.length; i++) {
            System.out.print( (i+1) + "번째 줄을 출력합니다>");
            for(int j = 0; j< array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
    }

    private static void q23() {
        // for each - 실습
        
        int [] array = {1, 5, 3, 6, 7};
        //for each문을 이용해서 array의 값을 한 줄씩 출력하세요
        for(int value : array){
            System.out.println(value);
        }
    }
}

