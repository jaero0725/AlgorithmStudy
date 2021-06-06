package test00;

/*
 * do while 문 사용 
 * 알고리즘 cnt check 
 */

// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

public class sol08 {
	class Point {
		int x;
		int y;

		public Point(int y, int x) {
			this.y = y;
			this.x = x;
		}
	}
	public int solution(int[][] garden) {
		int answer = 0;

		List<Point> list = new ArrayList<Point>();
		int cnt = 0;

		for (int i = 0; i < garden.length; i++) {
			for (int j = 0; j < garden[i].length; j++) {
				if (garden[i][j] == 1) {
					list.add(new Point(i, j));
					cnt++;
				}
			}
		}
		do {
			answer++;
			List<Point> tempList = new ArrayList<Point>();
			for (int i = 0; i < list.size(); i++) {
				Point p = list.get(i);

				if (p.y - 1 >= 0 && garden[p.y - 1][p.x] == 0) {
					garden[p.y - 1][p.x] = 1;
					cnt++;
					tempList.add(new Point(p.y - 1, p.x));
				}

				if (p.y + 1 < garden.length && garden[p.y + 1][p.x] == 0) {
					garden[p.y + 1][p.x] = 1;
					cnt++;
					tempList.add(new Point(p.y + 1, p.x));
				}

				if (p.x - 1 >= 0 && garden[p.y][p.x - 1] == 0) {
					garden[p.y][p.x - 1] = 1;
					cnt++;
					tempList.add(new Point(p.y, p.x - 1));
				}

				if (p.x + 1 < garden.length && garden[p.y][p.x + 1] == 0) {
					garden[p.y][p.x + 1] = 1;
					cnt++;
					tempList.add(new Point(p.y, p.x + 1));
				}
			}

			list.clear();
			list = tempList;
		} while (cnt < garden.length * garden.length);

		return answer;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		sol08 sol = new sol08();
		int[][] garden1 = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		int ret1 = sol.solution(garden1);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		int[][] garden2 = { { 1, 1 }, { 1, 1 } };
		int ret2 = sol.solution(garden2);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

	}
}