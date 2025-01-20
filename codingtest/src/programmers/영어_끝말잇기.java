package programmers;
/*
문제 설명 생략
https://school.programmers.co.kr/learn/courses/30/lessons/12981
 */

import java.util.HashSet;
import java.util.Set;

public class 영어_끝말잇기 {
    public static void main(String[] args) {
        /*
        1.중복단어 있는지 확인 -> 알고리즘 실행
        2. 끝말잇기가 맞는지 확인 -> 아니라면 위치 반환
        3. 이상 없다 -> 0,0 반환
         */
        int n = 3;
        String[] word = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        int[] answer = new int[2];

        Set<String> set = new HashSet<>();
        int count = 0;
        boolean findDuplication
        for (String s : word) {
            count++;
            // 중복 단어 발견
            if (!set.add(s)) {
            }
        }
    }
}
