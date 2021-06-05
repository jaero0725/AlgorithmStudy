package test00;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sol09 {
	public int solution(int[] arr, int K) {

		int answer = 0;
		if (arr.length <= K) {
			int max = arr[0];
			int min = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (max < arr[i]) {
					max = arr[i];
				}
				if (min > arr[i]) {
					min = arr[i];
				}
			}
			answer = max - min;
		} else {
			Arrays.sort(arr);
			answer = arr[arr.length - 1]; // 배열에서 가장 큰수로 초기화
			int checkLen = arr.length - K;
			for (int i = 0; i <= checkLen; i++) {
				if (answer > arr[i + K - 1] - arr[i])
					answer = arr[i + K - 1] - arr[i];
			}
		}
		return answer;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		sol09 sol = new sol09();
		int[] arr = { 9, 11, 9, 6, 4, 19 };
		int K = 4;
		int ret = sol.solution(arr, K);
		System.out.println("solution 메소드의 반환 값은 " + ret + "입니다.");
	}
}