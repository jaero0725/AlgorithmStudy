package test05;

// 6분걸림
public class sol02 {
	public int solution(int[][] walls) {
		int answer = 0;
		for (int i = 0; i < walls.length; i++) {
			for (int j = i + 1; j < walls.length; j++) {
				int area = 0;
				if (walls[i][1] > walls[j][1])
					area = walls[i][1] * (walls[j][0] - walls[i][0]) / 2;
				else
					area = walls[j][1] * (walls[j][0] - walls[i][0]);

				if (answer < area)
					answer = area;
			}
		}

		return answer;
	}
}
