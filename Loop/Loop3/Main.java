import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        exam10();
    }

    static String[] _strsc() throws IOException {
        String str = br.readLine();
        return str.split(" ");
    }

    static void exam1() throws IOException {
        // 반복제어문3 - 형성평가1
        String[] str = _strsc();
        int sum = 0;
        int count = 0;

        for (int i = 0; i < str.length; i++) {
            int num = Integer.parseInt(str[i]);
            if (num == 0) {
                break;
            }
            sum += num;
            count++;
        }

        double avg = (count > 0) ? (double) sum / count : 0;
        System.out.printf("%d %d", sum, (int) avg);
    }

    static void exam2() throws IOException {
        // 반복제어문3 - 형성평가2.
        int n = Integer.parseInt(br.readLine());
        for (int i = n; i < 100; i = i + n) {
            System.out.print(i + " ");
            if (i % 10 == 0) {
                break;
            }
        }
    }

    static void exam3() throws IOException {
        // 반복제어문3 - 형성평가3
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            if(i == n-1){
                for(int x = 0; x < n-1; x++){
                    for(int y = i; y > x; y--){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
    }

    static void exam4() throws IOException {
        // 반복제어문3 - 형성평가4
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (n - i) - 1; j++) { // 5 3 1
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void exam5() throws IOException{
        // 반복제어문3 - 형성평가5
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            for (int x = i*2; x < n+1; x++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (2*i+1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void exam6() throws IOException{
        // 반복제어문3 - 형성평가6
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){

            for(int x = 0; x < n-1-i; x++){
                System.out.print("  ");
            }

            for(int j = 0; j <= i; j++){
                System.out.print((j+1) + " ");

            }

            System.out.println();

        }
    }

    static void exam7() throws IOException{
        // 반복제어문3 - 형성평가7
        int n = Integer.parseInt(br.readLine());
        char ch = 'A';
        int num = 0;
        for(int i = 0; i < n; i++){
            for(int x = 0; x <= n-1-i; x++){
                System.out.print(ch++ + " ");
            }
            for(int j = 0; j < i; j++){
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

    static void exam8() throws IOException{
        // 반복제어문3 - 형성평가8
        int n = Integer.parseInt(br.readLine());
        int num = 1;
        for(int i = 0; i < n; i++){
            for(int x = 0; x < i; x++){
                System.out.print("  ");
            }
            for(int j = 0; j <= n-i-1; j++){
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

    static void exam9() throws IOException{
        // 반복제어문3 - 형성평가9
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print("# ");
            }
            System.out.println();
        }

        for(int i = 0; i < n-1; i++){
            for(int x = 0; x < i+1; x++){
                System.out.print("  ");
            }
            for(int j = i+1; j < n; j++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    static void exam10() throws IOException{
        // 반복제어문3 - 형성평가10
        int n = Integer.parseInt(br.readLine());
        int num = 0; // 홀수 담을 변수.
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print((num*2)+1 + " ");
                num++;
                if(num == 5) // 위에서 2를 곱해주면서 홀수를 찾기 때문에 5 이상이 되면 10을 넘어감.
                {
                    num = 0;
                }
            }
            System.out.println();
        }
    }
}
