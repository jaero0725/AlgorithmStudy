package test05;

public class sol06 {
	public String solution(String s1, String s2, int p, int q) {
		String answer = "";
		//1. 두수를 10진수로 변환후 더한다.
		//2. 더한값을 q진법으로 변환한다. 
		int tmp1 = 0;
		int tmp2 = 0;
		int asc = 0 ; //승
		for(int i = s1.length() - 1; i >=0; i--) {
			tmp1 += Integer.parseInt(s1.substring(i,i+1)) * Math.pow(p, asc);
			asc++;
		}
		asc = 0;
		for(int i = s2.length() - 1; i >=0; i--) {
			tmp2 += Integer.parseInt(s2.substring(i,i+1)) * Math.pow(p, asc);
			asc++;
		}
		int sum = tmp1 + tmp2; //두개의 합
		
		//sum을 q진법으로 변경
		while(sum > 0) {
			answer = String.valueOf(sum % q) + answer;
			sum = sum / q;
		}
		return answer;
	}
	public static void main(String[] args) {
		sol06 sol = new sol06();
		String s1 = new String("112001");
		String s2 = new String("12010");
		int p = 3;
		int q = 8;
		String ret = sol.solution(s1, s2, p, q);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 \"" + ret + "\" 입니다.");
	}
}
