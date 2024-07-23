package Lv2;

import java.util.*;

/*
 * 프로그래머스 연습문제 Lv2
 * 귤 고르기
 * 2024-07-22
 * https://school.programmers.co.kr/learn/courses/30/lessons/138476?language=java
 */
public class SelectTangerine {
	
	static int[] tangerineArr = {1, 1, 1, 1, 2, 2, 2, 3}; // 수확한 귤
	static int pickCount = 2; // 한 상자에 담으려는 개수 
	
	
	public static void main (String[] args) {
		System.out.println(solution(pickCount, tangerineArr));
	}
	
	public static int solution(int k, int[] tangerine) {
		int answer = 0;
		
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		
		// Hash map getOrDefault() Key 에 있는 값 반환 없으면 Default Value 반환
		for (int size : tangerine) {
			map.put(size, map.getOrDefault(size, 0) + 1);
		}
		
		List<Integer> keySet = new ArrayList<>(map.keySet());
		keySet.sort((size1, size2) -> map.get(size2) - map.get(size1));
		
		
		for (int i = 0; i < keySet.size(); i++) {
			System.out.print(keySet.get(i) + ",");
		}
		
		for (Integer size : keySet) {
			k -= map.get(size);
			answer++;
			
			if (k <= 0) {
				break;
			}
		}
		
		return answer;
	}
	
	
}
