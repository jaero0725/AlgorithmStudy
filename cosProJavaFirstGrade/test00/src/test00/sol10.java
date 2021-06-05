package test00;

import java.util.*;

/*
(1) 단어들을 이어붙일 문자열 str을 선언합니다.
(2) do ~ while문을 i가 words 배열의 크기와 같아질 때까지 순회합니다.
(3) str 문자열의 길이가 K로 나눈 나머지가 K-1보다 작을 경우 조건을 정합니다
(4) str의 길이와 i번째 words의 길이를 더 한 값의 K를 나눈 나머지가 K-1보다 작을때  str에  i번째 words를 추가하고, i를 증가시킵니다.
(5) K-1보다 크거나 같으면 "_"를 추가합니다.
(6) str 길이를 K로 나눈 나머지 값이 0 이거나 i가 words길이만큼 됐을 때  answer++를 합니다 
 */
class sol10 {
	public int solution(int K, String[] words) {
		int answer = 0;
		String str = "";
		int i = 0;
		do {
			if (str.length() % K < K - 1) {
				if ((str.length() + words[i].length()) % K < K - 1) {
					str += words[i];
					i++;
				} else {
					str += "_";
				}
			}

			if (str.length() % K == 0 || i == words.length)
				answer++;
		} while (i < words.length);

		return answer;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		sol10 sol = new sol10();
		int K = 10;
		String[] words = { new String("nice"), new String("happy"), new String("hello"), new String("world"),
				new String("hi") };
		int ret = sol.solution(K, words);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소의 반환 값은 " + ret + " 입니다.");
	}
}
