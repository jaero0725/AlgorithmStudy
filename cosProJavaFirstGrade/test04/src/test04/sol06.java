package test04;

import java.util.Arrays;

public class sol06 {
	public int power(int base, int exponent) {
		int val = 1;
		for (int i = 0; i < exponent; i++)
			val *= base;
		return val;
	}

	public int[] solution(int k) {
        int range = power(10, k);
        int[] answer = new int[range];
        int count = 0;
        for (int i = range / 10; i < range; i++) {
            int current = i;
            int calculated = 0;
            while (current != 0) {
            	calculated += power(current % 10, k);
				current = current / 10;
            }
            if (calculated == i)
                answer[count++] = i;
        }

        int[] ret = new int[count];
        for (int i = 0; i < count; i++)
            ret[i] = answer[i];
        return ret;
    }
	
	public static void main(String[] args) {
		sol06 sol = new sol06();
        int k = 3;
        int[] ret = sol.solution(k);

        System.out.printf("solution 메소드의 반환 값은 ");
        System.out.printf(Arrays.toString(ret));
        System.out.printf(" 입니다.\n");
        
		//자릿수 처리 
		//첫쨰자리는 자릿수만큼 나누기
		//둘쨰자리는 자릿수 -한자리수 만큼 나누고 10의 나머지
		//...
		//마지막 자리는 10의 나머지 
		int ret01 = 2434 / 1000;
		int ret02 = (2434 / 100) % 10;
		int ret03 = (2434 / 10)  % 10;
		int ret04 = (2434 / 1)  % 10;
		
		System.out.println(ret01+ ", " 
		+ ret02+ ", " +ret03 + " ," + ret04);
    }   
}
