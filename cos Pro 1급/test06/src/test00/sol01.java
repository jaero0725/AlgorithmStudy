package test00;

import java.util.*;
import java.util.ArrayList;

public class sol01 {
	public int solution(int n, int[][] garden) {
		int answer = 0;
		int cnt = 0;
		int check = 1;
		while (true) {
			// 모두 1이면, 끝
			for (int i = 0; i < garden.length; i++) {
				for (int j = 0; j < garden.length; j++) {
					if (garden[i][j] != 0) {
						cnt++;
					}
				}
			}
			if (cnt == garden.length * garden.length)
				break;

			for (int i = 0; i < garden.length; i++) {
				for (int j = 0; j < garden[i].length; j++) {
					if (garden[i][j] == check) {
						if (i + 1 < garden.length)
							garden[i + 1][j] = check + 1;
						if (i - 1 >= 0)
							garden[i - 1][j] = check + 1;
						if (j + 1 < garden.length)
							garden[i][j + 1] = check + 1;
						if (j - 1 >= 0)
							garden[i][j - 1] = check + 1;
					}
				}
			}
			check++;
			answer++;
			cnt = 0;
		}

		return answer;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		sol01 sol = new sol01();
		int n1 = 3;
		int[][] garden1 = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		int ret1 = sol.solution(n1, garden1);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		int n2 = 2;
		int[][] garden2 = { { 1, 1 }, { 1, 1 } };
		int ret2 = sol.solution(n2, garden2);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

	}
}