package Lv0;

import java.util.*;

/*
 * 프로그래머스 연습문제 Lv0
 * 대소문자 바꿔서 출력하기
 * 2024-07-23
 * https://school.programmers.co.kr/learn/courses/30/lessons/181949
 */
public class AlphabetChange {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        
        char[] charArr = str.toCharArray();
        
        for (int i = 0; i < charArr.length; i++) {
        	if (Character.isUpperCase(charArr[i])) {
        		result += Character.toLowerCase(charArr[i]);
        	} else {
        		result += Character.toUpperCase(charArr[i]);
        	}
        }
        
        System.out.print(result);
	}

}
