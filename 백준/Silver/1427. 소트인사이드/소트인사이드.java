import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String[] arr1 = num.split("");

        int[] arr2 = new int[arr1.length];  // 각 자릿수를 요소로 갖는 배열

        for(int i = 0; i < arr1.length; i++){
            arr2[i] = Integer.parseInt(arr1[i]);
        }
        // 역순정렬을 위한 Wrapper 박싱
        Integer[] tmp = Arrays.stream(arr2).boxed().toArray(Integer[]::new);
        Arrays.sort(tmp, Collections.reverseOrder());


        String result = "";
        for(int i = 0 ; i < arr2.length; i++){
            result = result + tmp[i];
        }
        System.out.println(result);
    }
}
