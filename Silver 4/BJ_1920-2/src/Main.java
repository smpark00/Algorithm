import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] n_num = new int[n];
        for(int i = 0; i < n; i++) {
            n_num[i] = sc.nextInt();
        }

        Arrays.sort(n_num); // 배열을 정렬

        int m = sc.nextInt();
        for(int i = 0; i < m; i++) {
            int target = sc.nextInt();
            int result = binarySearch(n_num, target);
            System.out.println(result);
        }
    }

    // 이분탐색을 통한 검색 메서드(알고리즘때 배운 것)
    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;

            if(arr[mid] == target) {
                return 1;
            } else if(arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return 0;
    }
}
