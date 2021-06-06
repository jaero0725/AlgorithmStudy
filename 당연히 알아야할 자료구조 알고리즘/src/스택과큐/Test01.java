package 스택과큐;

import java.util.Stack;

//두개의 스택으로 하나의 큐 만들기 
/*
 알고리즘
 new 스택
 old 스택 
 
 new 스택에 있는걸 pop해서 old 스택에 모두 push 한다. 
  그 값들은 old스택에서 pop해가면 QUEUE가 구현이 된다.
  
 다 가져가고, old스택이 비어있으면, 그때, new 스택에서 old스택에 모두 넣어주는 작업을 한다.
 
 */
class MyQueue<T>{
	Stack <T> stackNewest, stackOldest;
	public MyQueue() {
		stackNewest = new Stack<T>();
		stackOldest = new Stack<T>();
	}
	
	//현재 데이터가 얼마나 쌓여있는지 반환하는 메서드
	public int size() {
		return stackNewest.size() + stackOldest.size();
	}
	//데이터를 add하는 메서드 단순히 newest 스택에 넣어주면된다.
	public void add(T value) {
		stackNewest.push(value);
	}
	
	//
	private void shiftStacks() {
		//old스택이 비어있으면? => 다 옮겨줘야함.
		if(stackOldest.isEmpty()) {
			//new스택이 빌떄까지 모두 넣어준다.
			while(!stackNewest.isEmpty()) {
				stackOldest.push(stackNewest.pop());
			}
		}
	}
	
	public T peek() {
		shiftStacks();
		return stackOldest.peek();
	}
	public T remove() {
		shiftStacks();
		return stackOldest.pop();
	}
}
public class Test01 {
	public static void main(String[] args) {
		MyQueue<Integer> q = new MyQueue<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
	}
}
