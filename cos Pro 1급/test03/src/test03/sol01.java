package test03;

class Main {
	int[] func_a(int[] arr) {
		int length = arr.length;
		int[] ret = new int[length * 2];
		for (int i = 0; i < length; i++)
			ret[i + length] = ret[i] = arr[i];
		return ret;
	}

	boolean func_b(int[] first, int[] second) {
		int[] counter = new int[1001];
		for (int i = 0; i < first.length; i++) {
			counter[first[i]]++;
			counter[second[i]]--;
		}
		for (int i = 0; i < 1001; i++)
			if (counter[i] != 0)
				return false;
		return true;
	}

	boolean func_c(int[] first, int[] second) {
		int length = second.length;
		for (int i = 0; i < length; i++) {
			int j;
			for (j = 0; j < length; j++)
				if (first[i + j] != second[j])
					break;
			if (j == length)
				return true;
		}
		return false;
	}

	public boolean solution(int[] arrA, int[] arrB) {
		if (arrA.length != arrB.length) // 1) 길이가 다르면 false
			return false;
		if (func_b(arrA, arrB)) { // 2) 두 배열의 구성성분이 달라 같아질 가능성이 없으면 flase
			int[] arrAtemp = func_a(arrA); // 3) arrA두번 이어 붙여 2배인 배열 만든다.
			if (func_c(arrAtemp, arrB)) // 4) arrA의 부분 배열 중 arrB와 같은 배열이 잇으며 true 없으면 false
				return true;
		}
		return false;
	}
}

public class sol01 {

}
