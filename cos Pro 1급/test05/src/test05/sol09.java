package test05;

public class sol09 {
	
	//연산 1. 1더하기
	//연산 2. 1뺴기
	//연산 3. 2곱하기 
	public int solution(int number, int target) {
		int answer = 0;
		
		//number 와 타켓이 같을때 동안 계쏙한다. 
		while (number != target) {
			
			//number가 target보다 작으면 -> 1더하기 or 1빼기 
			if (number < target) {
				//number * 2 - (number - 1) 가 target보다 작으면 2를 곱한다. -> 이게 최소수를 만들 수 있기떄문
				//number * 2 - 1 이 된다면 그걸로간다. 
				if (number * 2 - (number - 1) < target)
					number *= 2;
				//1을더한다. 
				else
					number++;
			} 
			//target과 number가 같으면 break;해준다. 
			else if (target == number)
				break;
			//number가 target보다 크면 1을 뺴준다.
			else
				number--;
			answer++;
		}
		return answer;
	}

	public static void main(String[] args) {
		sol09 sol = new sol09();
		int number1 = 5;
		int target1 = 9;
		int ret1 = sol.solution(number1, target1);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		int number2 = 3;
		int target2 = 11;
		int ret2 = sol.solution(number2, target2);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	}
}
