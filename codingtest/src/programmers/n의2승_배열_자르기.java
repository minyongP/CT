package programmers;
/*
정수 n, left, right가 주어집니다. 다음 과정을 거쳐서 1차원 배열을 만들고자 합니다.

n행 n열 크기의 비어있는 2차원 배열을 만듭니다.
i = 1, 2, 3, ..., n에 대해서, 다음 과정을 반복합니다.
1행 1열부터 i행 i열까지의 영역 내의 모든 빈 칸을 숫자 i로 채웁니다.
1행, 2행, ..., n행을 잘라내어 모두 이어붙인 새로운 1차원 배열을 만듭니다.
새로운 1차원 배열을 arr이라 할 때, arr[left], arr[left+1], ..., arr[right]만 남기고 나머지는 지웁니다.
정수 n, left, right가 매개변수로 주어집니다. 주어진 과정대로 만들어진 1차원 배열을 return 하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ n ≤ 107
0 ≤ left ≤ right < n2
right - left < 105
 */
import java.util.*;
public class n의2승_배열_자르기 {
    public static void main(String[] args) {
        n의2승_배열_자르기 solution = new n의2승_배열_자르기();
        System.out.println(Arrays.toString(solution(3, 2, 5)));
        System.out.println(Arrays.toString(solution(4, 7, 14)));
    }

    private static int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left + 1)];
//      배열 생성시 메모리과 초과된다!
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                array[i][j] = ((i+1) * (j+1)) / Math.min(j+1, i+1);
//            }
//        }

        for (int i = 0; i < answer.length; i++) {
            long index = left + i;
            int row = (int) (index / n);
            int col = (int) (index % n);

            answer[i] = Math.max(row + 1, col + 1);
        }

        return answer;
    }
}
