
public class sol05 {

	public int solution(int n) {
		int[][] arr = new int[n][n];
		int i = 0, j = 0;
		int dir = 0; // dir : 0 -> → , dir : 1 -> ↓, dir : 2 -> ←, dir : 3 -> ↑
		int num = 1;

		while (true) {
			arr[i][j] = num;

			if (dir == 0 && (j == n - 1 || (j < n - 1 && arr[i][j + 1] != 0)))
				dir++;
			else if (dir == 1 && (i == n - 1 || (i < n - 1 && arr[i + 1][j] != 0)))
				dir++;
			else if (dir == 2 && (j == 0 || (j > 0 && arr[i][j - 1] != 0)))
				dir++;
			else if (dir == 3 && (i == 0 || (i > 0 && arr[i - 1][j] != 0)))
				dir = 0;

			if (dir == 0)
				j++;
			else if (dir == 1)
				i++;
			else if (dir == 2)
				j--;
			else if (dir == 3)
				i--;

			if (num == (int) Math.pow(n, 2))
				break;
			num++;
		}

		int answer = 0;
		i = 0;

		while (i <= n - 1) {
			answer += arr[i][i];
			i++;
		}

		return answer;
	}
}
