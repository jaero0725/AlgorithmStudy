package test04;

import java.util.*;

/*
 y5b9m4 - 대문자 소문자 구분 x 
*/
class sol02 {
	public String solution(String s) {
        s = s.toLowerCase();
        String answer = "";
        char previous = s.charAt(0);
        int counter = 1;
        
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == previous)
                counter++;
            else {
                answer += previous;
                answer += counter;
                counter = 1;
                previous = s.charAt(i);
            }
        }
        answer += previous;
        answer += counter;
        return answer;
    }
	
	// 아래는 테스트케이스 출력을 해보기 위한 코드입니다. 아래에는 잘못된 부분이 없으니, 위의 코드만 수정하세요.
    public static void main(String[] args) {
    	sol02 sol = new sol02();
        String s = new String("YYYYYbbbBbbBBBMmmM");
        String ret = sol.solution(s);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 \"" + ret + "\" 입니다.");
   }
}
