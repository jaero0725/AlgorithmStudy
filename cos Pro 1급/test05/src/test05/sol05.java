package test05;

import java.util.*;

//여기선 while문을 쓰는게 어울린다. 
public class sol05 {
//	public int solution2(int[] enemies, int[] armies) {
//		int answer = 0;
//
//		// 최대 몇마리를 이길 수 있나요?
//		// 가장 공결력쌘걸로, 가장 높은 걸 죽이는게 가장 좋은방법
//		Arrays.sort(armies);
//		Arrays.sort(enemies);
//
//		int win = 0;
//		for (int i = 0; i < armies.length; i++) {
//			// 첫번째 몬스터를 누가이길 수 있을까?
//			for (int j = 0; j < enemies.length; j++) {
//				// i번째 캐릭터가 j번쨰의 몬스터를 이길 수 있나요?
//				// 이기는 상황
//				if (armies[i] >= enemies[j]) {
//					answer++;
//					break;
//				}
//			}
//		}
//		answer = win;
//		return answer;
//	}

	public int solution(int[] enemies, int[] armies) {
		int answer = 0;

		// 정렬을 해버리고.
		Arrays.sort(armies);
		Arrays.sort(enemies);

		int i = 0, j = 0;

		// 반복문을 돌면서,
		while (i < enemies.length && j < armies.length) {
			// armies가 enemies를 죽일 수 있을떄 +1;
			if (enemies[i] <= armies[j]) {
				answer++;
				i++;
				j++;
			}
			// 못죽일때, 다음으로 넘어간다.
			else {
				j++;
			}
		}

		return answer;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		sol05 sol = new sol05();
		int[] enemies1 = { 1, 4, 3 };
		int[] armies1 = { 1, 3 };
		int ret1 = sol.solution(enemies1, armies1);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		int[] enemies2 = { 1, 1, 1 };
		int[] armies2 = { 1, 2, 3, 4 };
		int ret2 = sol.solution(enemies2, armies2);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	}
}
