
class sol06 {
	public int solution(String pos) {
		int answer = 0;

		// 이동할 수 잇는 칸을 알아본다.

		String xTmp = pos.substring(0, 1);
		int x = 1;
		int y = Integer.parseInt(pos.substring(1, 2));
		switch (xTmp) {
		case "A":
			x = 1;
			break;
		case "B":
			x = 2;
			break;
		case "C":
			x = 3;
			break;
		case "D":
			x = 4;
			break;
		case "E":
			x = 5;
			break;
		case "F":
			x = 6;
			break;
		case "G":
			x = 7;
			break;
		case "H":
			x = 8;
			break;
		}

		int count = 0;
		// 1 7
		// 3 8
		if (x + 2 <= 8 && y + 1 <= 8)
			count++;
		if (x + 1 <= 8 && y + 2 <= 8)
			count++;
		if (x - 1 > 0 && y + 2 <= 8)
			count++;
		if (x - 2 > 0 && y + 1 <= 8)
			count++;
		if (x - 2 > 0 && y - 1 > 0)
			count++;
		if (x - 1 > 0 && y - 2 > 0)
			count++;
		if (x + 1 <= 8 && y - 2 > 0)
			count++;
		if (x + 2 <= 8 && y - 1 > 0)
			count++;
		answer = count;
		return answer;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        sol06 sol = new sol06();
        String pos = "A7";
        int ret = sol.solution(pos);
    	
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
