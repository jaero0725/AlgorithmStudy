package StackAndQueue;

import java.util.Stack;

/*

 Stack을 정렬하는 함수를 만드시오, 
 단 하나의 stack을 추가로 사용할 수 있고, Array등 다른 데이터 구조는 사용할 수 없음.
 
 */

/*
  S1 -> S2 정렬 
    가장 작은게 가장 밑에 오게 한다.
   
  큰수가 있어? 뺴서 S1으로 보낸다. 
  
 */
public class Test02 {
	
	private static void sort(Stack<Integer> s1) {
		Stack<Integer> s2 = new Stack<Integer>();
		
		//s1이 빌때까지 한다.
		while(!s1.isEmpty()) {
			//s1에서 하나뽑는다.
			int tmp = s1.pop();
			//s2가 빌떄까지 그리고 s2 가 tmp 보다 클때까지
			while(!s2.isEmpty() && s2.peek() > tmp) {
				s1.push(s2.pop());
			}
			s2.push(tmp);
		}
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}
	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<Integer>();
		s1.push(3);
		s1.push(5);
		s1.push(1);
		s1.push(6);
		sort(s1);
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
	}
}
