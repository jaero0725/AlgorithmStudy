package test05;

import java.util.Arrays;
//14분걸림
public class sol03 {
	public void swap(int[] numbers, int i, int j) {
		int tmp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = tmp;
	}

    public int[] solution(int[] numbers) {
        int[] answer = {};

        Arrays.sort(numbers);
        int mid = (numbers.length - 1) / 2;
        swap(numbers, mid, numbers.length-1);

        int left = mid + 1;
        int right = numbers.length - 2;
        while(left <= right) {
        	swap(numbers, left, right);
        	left = left + 1;
        	right = right - 1;
        }

        answer = numbers;
        return answer;
    }

}
