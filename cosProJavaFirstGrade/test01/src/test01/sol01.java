package test01;

import java.util.Scanner;

/*
어느 누군가가 타임머신을 타고 과거로 가서 숫자 0이 없는 수 체계를 전파했습니다.
 역사가 바뀌어 이제 사람들의 의식 속엔 0이란 숫자가 사라졌습니다.
  따라서, 현재의 수 체계는 1, 2, 3, ..., 8, 9, 11, 12, ...와 같이 0이 없게 바뀌었습니다.
0을 포함하지 않은 자연수 num이 매개변수로 주어질 때, 이 수에 1을 더한 수를 return 하도록 solution 메소드를 완성해주세요. 

매개변수 설명
자연수 num이 solution 메소드의 매개변수로 주어집니다.

num은 1 이상 999,999,999,999,999,999 이하의 0을 포함하지 않는 자연수입니다.
 */

class Solution {
    public static long solution(long num) {
        num++;
        long digit = 1;
        while (num / digit % 10 == 0) {
            num += digit;
            digit *= 10;
        }
        return num;
    }
}

public class sol01 {
	private static Scanner sc = new Scanner(System.in);
	/* 자료형에 따른 크기 비교
	 * 1 bit : 0, 1 (2개)
	 * 2 bit : 00, 01, 10, 11 (4개)
	 * 3 bit : 000, 001, 010,011,100,101,110,111 (8개)
	 * 4 bit : 2의 4승 = 16개
	 * 8 bit : 2의 8승 = 256개
	 * 16 bit : 2의 16승, 65536 
	 * 
	 * byte : 1 byte = 8 bits  
	 * short : 2 byte = 16 bits
	 * int : 4 byte = 32 bits  : 	–2,147,483,648 ~ 2,147,483,647
	 * long : 16 byte = 64 bits
	 * 
	 * unsigned long long8없음(그러나 unsigned __int64와 동일)0 ~ 18,446,744,073,709,551,615
	 * 크면 -> double 로 가자 .
	 */
	
	public static double solution(double input) {
		input++;
		double digit = 1;
		while(input / digit % 10 == 0) {
			input += digit;
			digit *=10;
		}
		return input;
	}
	
	//test
	public static void main(String[] args) {
		//System.out.println("입력 >>");
		//double oupout = sc.nextDouble();
		//double input = 9949999;
		//double returnTmp = solution(input);
		//System.out.println(returnTmp);
		
		long tmp = Solution.solution(9949999);
		System.out.println(tmp);
	}
}
