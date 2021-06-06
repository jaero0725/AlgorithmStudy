package test04;

public class sol09 {
	public String solution(int hour, int minute) {
		String answer = "";
		//시계의 각도 계산 : 30 * 시간 - 5.5 분
		double angle = (30 * hour) - (5.5*minute);  
		answer = Double.toString(angle);
		return answer;
	}

	public static void main(String[] args) {
		sol09 sol = new sol09();
		int hour = 3;
		int minute = 0;
		String ret = sol.solution(hour, minute);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 \"" + ret + "\" 입니다.");
	}
}
