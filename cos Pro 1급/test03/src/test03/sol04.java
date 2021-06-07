package test03;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;
/*
 문자열 자르는 거 숙지
 
 String s1 = "asdfbvbdf";
문자열 길이  : s1.length();
문자열 앞에 한칸 자르기 : String tmp = s1.substring(0,1);
문자열 앞에 에서 n칸 만큼 자르기 : tmp = s1.substring(0,n);

문자열 뒤에서 한칸 자르기 : tmp = s1.substring(s1.length() - 1, s1.length());
문자열 디에서 n칸 만큼 자르기 : tmp = s1.substring(s1.length() - n , s1.length());
  
 */
class sol04 {
	public int solution(String s1, String s2) {
		int answer = 0;
		// s1, s2 로 겹치기
		// 1. 한글자 겹치는지 판단, 두글자 겹치는지 판단, 세글자 ... n글자 겹치는지 판단.

		// 작은쪽으로 해야됨.
		int maxLength = s1.length() <= s2.length() ? s2.length() : s1.length();
		int minLength = s1.length() > s2.length() ? s2.length() : s1.length();
		//System.out.println(maxLength + ", " + minLength);

		int count1 = 0; // s1, s2 합치는 상황
		int count2 = 0; // s2. s1 합치는 상황
		
		//System.out.println(s1 + " ," + s2);
		for (int i = 1; i < minLength; i++) {
			// s1의 뒤에서 i 번 글자와, s2 앞에서 i 번 글자와의 비교
			String tmp1 = s1.substring(s1.length() - i, s1.length());
			String tmp2 = s2.substring(0, i);
			//System.out.println("s1 : " + tmp1 + "\t s2 " + tmp2);
			if (tmp1.equals(tmp2)) {
				count1 = i;
			}
		}
		
		//System.out.println();
		//System.out.println(s2 + " ," + s1);
		
		for (int i = 1; i < minLength; i++) {
			// s1의 뒤에서 i 번 글자와, s2 앞에서 i 번 글자와의 비교
			String tmp1 = s2.substring(s2.length() - i, s2.length());
			String tmp2 = s1.substring(0, i);
			//System.out.println("s2 : " + tmp1 + "\t s1 " + tmp2);
			if (tmp1.equals(tmp2)) {
				count2 = i;
			}
		}
		//System.out.println(count1 + "," + count2);
		answer = maxLength + minLength - (count1 >= count2 ? count1 : count2); 
		// 두가지 비교해서 가장 짧은 문자열의 길이 리턴
		return answer;
	}

	public static void main(String[] args) {
		sol04 sol = new sol04();
		String s1 = new String("ababc");
		String s2 = new String("abcdab");
		int ret = sol.solution(s1, s2);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}
