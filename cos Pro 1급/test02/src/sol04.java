
//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;
class sol04 {
	public int solution(int[] arr, int K) {
		int n = arr.length;
		int count = 0;
		for (int i = 0; i < n; ++i)
			for (int j = i + 1; j < n; ++j)
				for (int k = j + 1; k < n; ++k)
					if ((arr[i] + arr[j] + arr[k]) % K == 0)
						count += 1;
		return count;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		sol04 sol = new sol04();
		int[] arr = { 1, 2, 3, 4, 5 };
		int K = 3;
		int ret = sol.solution(arr, K);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}
