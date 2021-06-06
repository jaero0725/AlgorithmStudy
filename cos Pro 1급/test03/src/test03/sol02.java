//package test03;
//
//import java.util.*;
//
//class sol02 {
//	public int solution(int n) {
//	        int answer = 0;
//	        ArrayList<Integer> primes = new ArrayList<Integer>();
//	        primes.add(2);
//	        for (int i = 3; i <= n; i += 2) {
//	            boolean isPrime = true;
//	            for (int j = 2; j < i; j++)
//	                if (i % j == 0){
//	                    isPrime = false;
//	                    break;
//	                }
//	            if (@@@)
//	                primes.add(i);
//	        }
//	        
//	        int primeLen = primes.size();
//	        for (int i = 0; i < primeLen - 2; i++)
//	            for (int j = i + 1; j < primeLen - 1; j++)
//	                for (int k = j + 1; k < primeLen; k++)
//	                    if (@@@)
//	                        answer++;
//	        return answer;
//	    }
//
//	public static void main(String[] args) {
//		Main sol = new Main();
//		int n1 = 33;
//		int ret1 = sol.solution(n1);
//
//		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
//		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
//
//		int n2 = 9;
//		int ret2 = sol.solution(n2);
//
//		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
//		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
//	}
//}
