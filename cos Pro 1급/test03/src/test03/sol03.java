package test03;

public class sol03 {

	public int solution(String[] bishops) {
		int answer = 0;
		int[][] arr = new int[8][8];
		
		int i = 0;
		while(i < bishops.length) {
			String str = bishops[i];
			String[] temp = str.split("");
			//x 와 y로 두자.
			int y = Integer.parseInt(temp[1]) - 1;
			int x = 0;
			switch(temp[0]) {
				case "A" : x = 0; break;
				case "B" : x = 1; break;
				case "C" : x = 2; break;
				case "D" : x = 3; break;
				case "E" : x = 4; break;
				case "F" : x = 5; break;
				case "G" : x = 6; break;
				case "H" : x = 7; break;
			}
			
			arr[y][x] = 1;
			int initX = x, initY = y;
			int dir = 0;
			while(dir < 4) {
				x = initX; y = initY;
				while(dir == 0 && x > 0 && y > 0) arr[--y][--x] = 1;
				while(dir == 1 && x > 0 && y < 7) arr[++y][--x] = 1;
				while(dir == 2 && x < 7 && y > 0) arr[--y][++x] = 1;
				while(dir == 3 && x < 7 && y < 7) arr[++y][++x] = 1;
				dir++;
			}
			
			i++;
		}
		
		answer = arr.length * arr[0].length;
		for (int j = 0; j < arr.length; j++) {
			for (int k = 0; k < arr.length; k++) {
				if(arr[j][k] == 1) answer--;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {

		sol03 sol = new sol03();
		String[] bishops1 = { new String("D5") };
		int ret1 = sol.solution(bishops1);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		String[] bishops2 = { new String("D5"), new String("E8"), new String("G2") };
		int ret2 = sol.solution(bishops2);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	}
}
