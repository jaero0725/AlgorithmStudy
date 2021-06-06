package test03;

class sol08 {
	public int solution(int k, int[] student) {
		int answer = 0;
		for (int i = 0; i < student.length; i++) {
			student[i] -= 4 * k;
			if (student[i] <= 0)
				continue;
			answer += (student[i] + k - 1) / k;
		}
		return answer;
	}
}
