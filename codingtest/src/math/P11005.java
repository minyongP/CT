package math;

import java.util.*;

/*
N(10진법 수) B(변경할 진법)
A(변경된 진법 수 배열)
while(나머지 값이 B보다 작을때 까지)
    A에 나머지 값을 저장
A를 뒤집는다
for(A 크기만큼 반복)
    10 이상 수들을 문자로 변경하기
A 출력
*/

public class P11005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int B = scanner.nextInt();
        ArrayList<Character> A = new ArrayList<>();
        while (N > B) {
            A.add((char) (N % B));
            N = N / B;
        }
        A.add((char) N);
        Collections.reverse(A);
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) > 9) A.set(i, (char) (A.get(i) + 55));
        }
        for (char i : A) System.out.print(i);
    }
}
