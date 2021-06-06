package test03;

import java.util.*;

class sol07 {
	public int[] solution(int k) {
		int[] kaprekarArr = new int[k];
		int count = 0;
		for (int i = 1; i <= k; i++) {
			long squareNum = i * i; // 제곱수
			long divisor = 1; // 나누는값
			while (squareNum / divisor != 0) {
				long front = squareNum / divisor; // 10의자리수
				long back = squareNum % divisor; // 1의 자리수
				divisor *= 10; // 1의자리, 10의자리 ,100의자리 ...
				if (back != 0 && front != 0)
					if (front + back == i) {
						kaprekarArr[count] = i;
						count++;
					}
			}
		}

		int[] answer = new int[count];
		for (int i = 0; i < count; i++)
			answer[i] = kaprekarArr[i];
		return answer;
	}
}
