package test00;

class Sol06 {
    public int solution(int[][] board) {
        int answer = 0;

        int[][] coins = new int[4][4];
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
            	//출발점 
                if(i == 0 && j == 0)
                    coins[i][j] = board[i][j];
                //오른쪽으로 갈경우 
                else if(i == 0 && j != 0)
                	//출발점 코인 + coins[i][j-1]가 아니고, 
                    coins[i][j] = board[i][j] + coins[i][j-1];
                //밑으로만 갈경우
                else if(i != 0 && j == 0)
                    coins[i][j] = board[i][j] + coins[i-1][j];
                //대각선 으로 갈 수 없음
                /*
					이동 방식은 i+1이거나 j+1이어야 한다.
                 */
                else
                	coins[i][j] = board[i][j] + Math.max(coins[i-1][j], coins[i][j-1]);
            }
        }

        answer = coins[3][3];
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
    public static void main(String[] args) {
    	Sol06 sol = new Sol06();
        int[][] board = {{6, 7, 1, 2}, {3, 5, 3, 9}, {6, 4, 5, 2}, {7, 3, 2, 6}};
        int ret = sol.solution(board);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
