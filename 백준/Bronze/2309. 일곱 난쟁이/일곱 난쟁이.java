import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] heights = new int[9];
        int sum = 0;  // 아홉 난쟁이 키 총합
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextInt();
            sum += heights[i];
        }

        Loop:
        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights.length; j++) {
                // 키 총합이 100이 되는 경우 탐색. 단, 중복 차는 허용하지 않음
                if (sum - heights[i] - heights[j] == 100 && i != j) {
                    heights[i] = 0;
                    heights[j] = 0;
                    break Loop;  // 이중 for문 한번에 탈출
                }
            }
        }

        Arrays.sort(heights);  // 배열 오름차순 정렬
        for (int i = 0; i < heights.length; i++){
            if(heights[i] != 0){
                System.out.println(heights[i]);
            }
        }
    }
}
