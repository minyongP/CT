package datastructure.slidingwindow;

import java.util.Scanner;

public class P12891 {
    static int check = 0;  // 4개중 만족한 수
    static char[] myArr;
    static int[] checkArr;
    public static void main(String[] args) {
        /*
        * S(DNA 문자열 길이) P(부분 문자열 길이)
        * arr(DNA 배열) checkArr({‘A’, ‘C’, ‘G’, ‘T’} 검증 배열)
        * myArr(슬라이딩 윈도우)
        * check(몇개 충족했는지 검사)
        * result(비밀번호 종류 수)
        * for(i:0~4) checkArr 초기화 - if(0이면) check++
        * for(i:0~P) add(arr[i])
        * if(check == 4) result++
        * for(i:P~S)
        * {
        *   j (i - P)
        *   add(arr[i])
        *   remove(arr[j])
        *   한칸씩 이동
        *   if(check == 4) result++
        * }
        * 결과 반환
        *
        * Add(문자 추가)
        * {
        *   새로 들어온 문자 업데이트, check값 변경
        * }
        * Remove(문제 제거)
        * {
        *   제거된 문자 업데이트, check값 변경
        * }
        * */
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int P = scanner.nextInt();
        scanner.nextLine();
        int result = 0;
        char[] arr = scanner.nextLine().toCharArray();
        myArr = new char[4];
        checkArr = new int[4];

        for (int i = 0; i < 4; i++) {
            checkArr[i] = scanner.nextInt();
            if (checkArr[i] == 0) check++;
        }
        // 초기화
        for (int i = 0; i < P; i++) {
            add(arr[i]);
        }
        if (check == 4) result++;
        // 슬라이딩
        for (int i = P; i < S; i++) {
            int j = i - P;
            add(arr[i]);
            remove(arr[j]);
            if(check == 4) result++;
        }
        System.out.println(result);
    }
    private static void add(char c){
        switch (c) {
            case 'A': {
                myArr[0]++;
                if (myArr[0] == checkArr[0]) check++;
                break;
            }
            case 'C': {
                myArr[1]++;
                if (myArr[1] == checkArr[1]) check++;
                break;
            }
            case 'G': {
                myArr[2]++;
                if (myArr[2] == checkArr[2]) check++;
                break;
            }
            case 'T': {
                myArr[3]++;
                if (myArr[3] == checkArr[3]) check++;
                break;
            }
        }
    }
    private static void remove(char c){
        switch (c) {
            case 'A': {
                if (myArr[0] == checkArr[0]) check--;
                myArr[0]--;
                break;
            }
            case 'C': {
                if (myArr[1] == checkArr[1]) check--;
                myArr[1]--;
                break;
            }
            case 'G': {
                if (myArr[2] == checkArr[2]) check--;
                myArr[2]--;
                break;
            }
            case 'T': {
                if (myArr[3] == checkArr[3]) check--;
                myArr[3]--;
                break;
            }
        }
    }
}