package test04;

/*
1) 1 
2) 12
3) 21

2) 213
3) 312

2) 3124
3) 4123

2) 41235
3) 53214
*/

public class sol05 {
	public String reverse(String number) {
		//reverseNumber하는 법 
		String reverseNumber = "";
		for (int i = number.length() - 1; i >= 0; i--) {
			reverseNumber += number.charAt(i); 
		}
		return reverseNumber;
	}

	public String solution(int n) {
		String answer = "";
		for (int i = 0; i < n; i++) {
			answer += Integer.toString(i % 9 + 1); //이 아이디어 
			answer = reverse(answer);
		}
		return answer;
	}
	
    public static void main(String[] args) {
    	sol05 sol = new sol05();
        int n = 5;
        String ret = sol.solution(n);
        
        System.out.println("solution 메소드의 반환 값은 \"" + ret + "\" 입니다.");
        
    }
}
