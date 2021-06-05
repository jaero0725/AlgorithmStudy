package test00;
/*
	디버깅(Debugging) 문제 안내
	디버깅(Debugging)은 이미 완성된 코드에서 버그를 찾아 수정하는 문제 타입입니다.
	1줄만 수정하여 버그를 고치세요.
	2줄 이상 수정할 경우, 실행 결과에 에러 메시지가 표시됩니다
	
	
	Q
	
	4 x 4 크기인 정사각형 종이가 1 x 1 크기인 격자 칸으로 나누어져 있습니다. 
	이 종이를 가로축 혹은 세로축에 평행한 격자 선을 따라 한 번 접었을 때, 
	만나는 격자 칸에 적힌 숫자의 합이 최대가 되도록 하려 합니다. 
	종이를 접을 때는 만나는 격자 칸이 정확히 일치하도록 해야 합니다.

	예를 들어 다음과 같이 4 x 4 크기인 종이가 있을 때,

	종이는 점선 중 하나를 따라서 접을 수 있습니다.
	 이때, 붉은색 점선을 따라 종이를 접으면 36과 19가 적힌 칸이 정확히 만납니다.
	  두 숫자의 합은 55이며, 이때가 최댓값입니다.

	4 x 4 크기인 정사각형 종이의 각 격자 칸에 적힌 숫자가 담긴 배열 grid가 매개변수로 주어질 때, 
	종이를 접었을 때 만나게 되는 격자 칸에 적힌 숫자의 합 중 최댓값을 return 하도록 solution 메소드를 작성했습니다.
	 그러나, 코드 일부분이 잘못되어있기 때문에, 몇몇 입력에 대해서는 올바르게 동작하지 않습니다. 
	 주어진 코드에서 한 줄만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정하세요.
	 
*/
public class sol05 {
	class Solution {
	    public int solution(int[][] grid) {
	        int answer = 0;
	        for(int i = 0; i < 4; i++)
	            for(int j = 0; j < 4; j++)
	                for(int k = j + 1; k < 4; k += 2)
	                   answer = Math.max(answer, Math.max(grid[i][j] + grid[i][k], grid[j][i] + grid[k][i]));
	        return answer;
	    }

	    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
//	    public static void main(String[] args) {
//	        Solution sol = new Solution();
//	        int[][] grid = {{1, 4, 16, 1}, {20, 5, 15, 8}, {6, 13, 36, 14}, {20, 7, 19, 15}};
//	        int ret = sol.solution(grid);
//
//	        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
//	        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
//	    }
	}
}
