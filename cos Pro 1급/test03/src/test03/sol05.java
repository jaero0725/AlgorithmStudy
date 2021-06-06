package test03;

/*
 * 
//1. 마지막 3글자 자르기
String str = "ABCDEFG"; 
String result = str.substring(str.length()-3, str.length());
System.out.println(result)
 //결과값EFG



//2. 특정문자 이후의 문자열 제거
String str = "ABCD/DEFGH";
String result = str.substring(str.lastIndexOf("/")+1);
System.out.println(result); 
//결과값 DEFGH



//3. 특정단어(부분)만 자르기
String str = "바나나 : 1000원, 사과 : 2000원, 배 : 3000원";
String target = "사과";
int target_num = str.indexOf(target); 
String result; result = str.substring(target_num,(str.substring(target_num).indexOf("원")+target_num));
System.out.println(result+"원"); 
//결과값 : 사과 : 2000원
 * 
 */
public class sol05 {
	public String solution(String phrases, int second) {
        String answer = "";
        String display = "";
        
        //전체적으로 넣어넣고 보낸다. 
        display = "______________" + phrases;
        for(int i = 0; i < second; ++i) {
        	display = display + Character.toString(display.charAt(0));
        	//String subString 메서드
        	//String.substring(start) //문자열  start위치부터 끝까지 문자열 자르기
        	//String.substring(start,end) //문자열  start위치 부터 end전까지 문자열 발췌
        	display = display.substring(1);
        }
        answer = display.substring(0,14);
        return answer;
			
    }
	public static void main(String[] args) {
		sol05 sol = new sol05();
		String phrases = new String("happy-birthday");
		int second = 3;
		String ret = sol.solution(phrases, second);
		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 \"" + ret + "\" 입니다.");
	}
}
