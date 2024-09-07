import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 10){
            n = 10 * n;
        }

        int originalNum = n;
        int count = 0;  // 사이클 수 세기


        while (true){
            int a = n % 10;  // 새로운 수의 10의 자릿수
            int b = a + n/10;
            int c = b % 10;  // 새로운 수의 1의 자릿수
            int newNum = (10 * a) + c;  // 새로운 수
            count++;
            if (newNum == originalNum){
                break;
            }
            n = newNum;
        }
        System.out.println(count);
    }
}
