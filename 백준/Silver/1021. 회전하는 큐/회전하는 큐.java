import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Deque<Integer> queue = new ArrayDeque<>();
        int [] aim = new int [m]; // 뽑기 위한 숫자 배열

        for(int i=1; i<=n; i++){
            queue.add(i);
        }
        for(int i=0; i<m; i++){
            aim[i] = sc.nextInt();
        }
        int count = 0;

        for (int i = 0; i < m; i++) {
            int aimIndex = getIndex(queue, aim[i]);
            if (aimIndex == 0) {
                queue.pollFirst(); // 뽑아내려는 원소가 현재 큐의 맨 앞에 있으면 그냥 뽑아냄
            } else {
                // 큐를 왼쪽 또는 오른쪽으로 회전시켜서 뽑아내기
                if (aimIndex <= queue.size() / 2) {
                    // 왼쪽으로 회전
                    while (aimIndex-- > 0) {
                        int front = queue.pollFirst();
                        queue.addLast(front);
                        count++;
                    }
                } else {
                    // 오른쪽으로 회전
                    aimIndex = queue.size() - aimIndex;
                    while (aimIndex-- > 0) {
                        int rear = queue.pollLast();
                        queue.addFirst(rear);
                        count++;
                    }
                }
                // 뽑아낸 후 맨 앞의 원소 제거
                queue.pollFirst();
            }
        }

        System.out.print(count);
    }

    private static int getIndex(Deque<Integer> queue, int i) {
        int index = 0;
        for(int num : queue){
            if(num == i){
                break;
            }
            index++;
        }
        return index;
    }
}
