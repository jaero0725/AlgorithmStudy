package test00;

import java.util.*;
import java.util.ArrayList;
/*
 * 
 * 문제 설명
스택 두개를 이용해 Queue 자료구조를 만들었을 때, Queue 자료 구조의 pop(또는 dequeue) 메소드를 구현하려합니다. Queue란 먼저 삽입한 데이터를 먼저 빼내는 자료구조를 뜻합니다. pop 메소드를 만들기 위해 다음과 같이 프로그램 구조를 작성했습니다.

1. 스택2가 비었다면 스택1에 아무것도 남지 않을때까지 스택1에서 pop한 값을 스택2에 push 한다.
2. 스택2에서 pop한 값을 리턴한다.
두 어레이리스트 stack1, stack2가 매개변수로 주어질 때, 두 어레이리스트를 스택으로 이용해 Queue 자료 구조의 pop 메소드를 구현하려합니다. 위 구조를 참고하여 코드가 올바르게 동작할 수 있도록 빈칸에 주어진 func_a, func_b, func_c 메소드와 매개변수를 알맞게 채워주세요.

※ 어레이리스트 index가 0인 부분을 스택의 bottom으로 생각합니다.

매개변수 설명
두 어레이리스트 stack1와 stack2가 solution 메소드의 매개변수로 주어집니다.

stack1과 stack2는 길이가 0 이상 10 이하입니다.
stack1과 stack2의 길이가 모두 0인 경우는 주어지지 않습니다.
stack1과 stack2의 원소는 100 이하인 정수입니다.
return 값 설명
stack1과 stack2로 구현한 큐에서 pop(또는 dequeue)한 값을 return 해주세요.

예제
stack1	stack2	result
[1,2]	[3,4]	4
[1,2,3]	[]	1
예제 설명
예제 #1
stack2가 비지 않았으므로 stack2에서 pop 한 결과인 4를 리턴합니다.

예제 #2

stack2가 비었으므로 stack1의 원소를 전부 pop해 stack2로 넣습니다. 이 결과 stack2에는 [3,2,1]이 들어갑니다.
stack2에서 pop한 결과인 1을 리턴합니다.
 */

class Sol01 {
	Integer func_a(ArrayList<Integer> stack) {
		Integer item = stack.remove(stack.size() - 1);
		return item;
	}

	void func_b(ArrayList<Integer> stack1, ArrayList<Integer> stack2) {
        while(!func_c(stack1)) {
            Integer item = func_a(stack1);
            stack2.add(item);
        }
    }

	boolean func_c(ArrayList<Integer> stack) {
		return (stack.size() == 0);
	}

	public int solution(ArrayList<Integer> stack1, ArrayList<Integer> stack2) {
        if(func_c(stack2)) {
            func_b(stack1, stack2);
        }
        Integer answer = (int)func_a(stack2);
        return answer;
    }

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
//	public static void main(String[] args) {
//		Sol01 sol = new Sol01();
//
//		ArrayList<Integer> stack1_1 = new ArrayList<Integer>();
//		ArrayList<Integer> stack2_1 = new ArrayList<Integer>();
//		stack1_1.add(1);
//		stack1_1.add(2);
//		stack2_1.add(3);
//		stack2_1.add(4);
//		int ret1 = sol.solution(stack1_1, stack2_1);
//		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
//
//		ArrayList<Integer> stack1_2 = new ArrayList<Integer>();
//		ArrayList<Integer> stack2_2 = new ArrayList<Integer>();
//		stack1_2.add(1);
//		stack1_2.add(2);
//		stack1_2.add(3);
//		int ret2 = sol.solution(stack1_2, stack2_2);
//		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
//	}
}