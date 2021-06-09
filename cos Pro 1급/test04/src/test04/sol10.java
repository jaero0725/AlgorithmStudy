package test04;

import java.util.*;

/*
 제곱 구하기 
 double result = Math.pow(5, 2);
제곱근(루트) 구하기
 double result = Math.sqrt(25);
 
 System.out.println("5의 세제곱근: " + Math.pow(5, 1.0/3.0));
 */
public class sol10 {
	public int solution(int a, int b) {
		// 여기에 코드를 작성해주세요.
		int answer = 0;

		// 자연수를 제곱한 수는 제곱수, 세 제곱한 수는 세제곱수 ,
		// 소수의 제곱수, 세제곱수의 갯수
		// 6 ~ 30

		// 1) 제곱수를 구하고
		// 2) 그게 소수인지 판단해서
		// 3) 갯수를 리턴해준다.

		// 1) a부터 b까지 제곱수, 세제곱수를 판단하여 배열에 넣는다.
		int arr[] = new int[b - a + 1]; // 갯수만큼 넣는다. 아닌 것은 0으로 들어가니 조심.
		int index = 0;
		for (int i = a; i <= b; i++) {
			// 제곱수 판단하여 arr배열에 넣어준다.
			try {
				double m = Math.sqrt(i);
				arr[index] = new Integer((int) m);
				index++;
			} catch (NumberFormatException e) {
			}

			// 세제곱수 판단하여 arr배열에 넣어준다.
			try {
				// 세제곱근 찾기 알고리즘
				for (int j = 1; j <= a; j++) {
					if (j == Math.pow(a, 1.0 / 3.0)) {
						arr[index] = a; // 세제곱이 되는 놈을 넣는다.
					}
				}
			} catch (NumberFormatException e) {
			}
		}

		// 2) arr배열을 순회하여 소수를 찾는다.
		for (int i = 0; i < arr.length; i++) {
			// System.out.print(arr[i]);
		}

		ArrayList<Integer> tmpArr = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			// tmp에서 돌면서 있는지 확인.
			for (int j = 0; j < 10; j++) {
				// 만약 tmp에 있는 값이면 break한다.
				if (tmpArr.contains(arr[i])) {
					break;
				} else {
					tmpArr.add(arr[i]);
				}
			}
		}
		System.out.println(" 갯수 " + tmpArr.size());
		return answer;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		sol10 sol = new sol10();
		int a = 6;
		int b = 30;
		int ret = sol.solution(a, b);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}