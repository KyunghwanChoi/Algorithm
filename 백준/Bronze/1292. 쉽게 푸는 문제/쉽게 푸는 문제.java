import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        int[] arr = new int[end];
        int index = 0;
        for (int i = 1; i <= end; i++){
            for (int j = 0; j < i; j++){
                if (index >= arr.length){
                    break;
                }
                arr[index] = i;
                index++;
            }
        }

        int sum = 0;
        for (int i = start - 1; i < end; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
