package test03;

public class sol03 {

	public int solution(String[] bishops) {
		int answer = 0;

		// 위치값 0으로 고정
		// 0이면, 안전한곳, 1이면 안전하지 않은 곳
		int arr[][] = new int[8][8];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = 0;
				System.out.print(" [" + arr[i][j] + "] " );
			}
			System.out.println();
		}

		for (int i = 0; i < bishops.length; i++) {
			// 위치값을 받음.
			// 위치값은 0부터 시작한다.
			String loc = bishops[i];
			int cols = loc.charAt(0) - 64 - 1; // 가로
			int rows = loc.charAt(1) - 48 - 1; // 세로
			arr[cols][rows] = 2; // 위치값에 넣는다.

			System.out.println(cols + ", " + rows);
			// 대각선으로 공격
			// 1) 왼쪽 위로
			int n = 1;
			while (true) {
				System.out.println("왼쪽 위로 공격 " + (cols + n) + ", " + (rows - n));
				if (cols - n < 0 || rows + n >= 7)
					break;
				arr[cols - n][rows + n] = 1; // 1로 변경
				n++;
			}
			// 2) 오른쪽 위로
			n = 1;
			while (true) {
				System.out.println("오른쪽 위로 공격 " + (cols + n) + ", " + (rows + n));
				if (cols + n >= 7 || rows + n >= 7)
					break;
				arr[cols + n][rows + n] = 1; // 1로 변경
				n++;
			}
			// 3) 왼쪽 아래로
			n = 1;
			while (true) {
				System.out.println("왼쪽 아래로 공격 " + (cols - n) + ", " + (rows - n));
				if (cols - n <= 0 || rows - n <= 0)
					break;
				arr[cols - n][rows - n] = 1; // 1로 변경
				n++;
			}
			// 4) 오른쪽 아래로
			n = 1;
			while (true) {
				System.out.println("오른쪽 아래로 공격 " + (cols - n) + ", " + (rows + n));
				if (cols - n < 0 || rows + n >= 7)
					break;
				arr[cols - n][rows + n] = 1; // 1로 변경
				n++;
			}
		}

		// 다 넣엇으므로, 갯수 파악 하면된다.
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i][j] == 0)
					answer++;
			}
		}

		// 다 넣엇으므로, 갯수 파악 하면된다.
		System.out.println("----------- 배치표 -------------- ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(" [" + arr[i][j] + "] " );
			}
			System.out.println();
		}
		return answer;
	}

	public static void main(String[] args) {

		sol03 sol = new sol03();
		String[] bishops1 = { new String("D5") };
		int ret1 = sol.solution(bishops1);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		String[] bishops2 = { new String("D5"), new String("E8"), new String("G2") };
		int ret2 = sol.solution(bishops2);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	}
}
