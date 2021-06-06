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
		int answer = 0;

		//둘다 false
		List<Boolean> list = new ArrayList<Boolean>();
		list.add(false);
		list.add(false);
		
		for (int i = 2; i <= b; i++)
			list.add(true);

		//에라토스테네스의 체
		for (int i = 2; i * i <= b; i++) {
			if (list.get(i)) {
				for (int j = i * i; j <= b; j += i) {
					list.set(j, false);
				}
			}
		}

		List<Integer> primeList = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i))
				primeList.add(i);
		}

		for (int i = 0; i < primeList.size(); i++) {
			if (Math.pow(primeList.get(i), 2) <= b && Math.pow(primeList.get(i), 2) >= a)
				answer++;
			if (Math.pow(primeList.get(i), 3) <= b)
				answer++;
		}

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