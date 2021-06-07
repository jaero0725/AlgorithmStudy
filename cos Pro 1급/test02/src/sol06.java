import java.util.Arrays;

public class sol06 {
	public int[] solution(String commands) {
		// 여기에 코드를 작성해주세요.
		int[] answer = { 0, 0 };

		// commands
		int x = 0;
		int y = 0;
		for (int i = 0; i < commands.length(); i++) {
			String input = commands.substring(i, i + 1);

			// L R U D
			switch (input) {
			case "L":
				x = x - 1;
				break; // x축 방향으로 -1
			case "R":
				x = x + 1;
				break; // x축 방향으로 +1
			case "U":
				y = y + 1;
				break; // y축 방향으로 +1
			case "D":
				y = y - 1;
				break; // y축 방향으로 -1
			}
			answer[0] = x;
			answer[1] = y;
		}

		return answer;
	}
	
    public static void main(String[] args) {
        sol06 sol = new sol06();
        String commands = "URDDL";
        int[] ret = sol.solution(commands);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
    }
}
