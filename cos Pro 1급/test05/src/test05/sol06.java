package test05;

public class sol06 {
	public String solution(String s1, String s2, int p, int q) {
		String answer = "";

		// p진법으로 나타난 s1, s2를 더해서, q진법으로 나타낸다.
		int arr1[] = { -1, -1, -1, -1, -1, -1, -1, -1, -1 }; // 없는 자리는 -1로 채운다.
		int arr2[] = { -1, -1, -1, -1, -1, -1, -1, -1, -1 };
		int sum[] = { -1, -1, -1, -1, -1, -1, -1, -1, -1 };

		// 0의 자리 부터.
		for (int i = 0; i < s1.length(); i++) {
			arr1[i] = Integer.parseInt(s1.substring(i, i + 1));
		}
		for (int i = 0; i < s2.length(); i++) {
			arr2[i] = Integer.parseInt(s2.substring(i, i + 1));
		}

		// 두개 더하기
		int length = arr1.length > arr2.length ? arr1.length : arr2.length;
		for (int i = 0; i < length; i++) {
			for (int j = i; j < length; j++) {
				// 자릿수 넘어가는 경우
				if (arr1[j] + arr2[j] > p) {
					sum[j + 1] += sum[j + 1] + 1;
				}
				// 자릿수 안넘어가는경우
				else if (arr1[j] + arr2[j] < p) {
					sum[j] = arr1[j] + arr2[j];
				}
			}
		}
		for (int i = 0; i < s1.length(); i++) {
			System.out.print(arr1[i]);
		}
		System.out.println();
		for (int i = 0; i < s2.length(); i++) {
			System.out.print(arr2[i]);
		}
		System.out.println();
		for (int i = 0; i < length; i++) {
			System.out.print(sum[i]);
		}
		System.out.println();
		// System.out.println();
		return answer;
	}

}
