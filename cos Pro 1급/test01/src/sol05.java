
public class sol05 {

	public int solution(int n) {
		int answer = 0;
		
		int arr[][] = new int[n][n];
	
		int dir = 0; //0 왼쪽, 1 아래, 2 위로, 3 아래로 가 반복
		int num = 1; //첫수
		
		int i = 0 ; 
		int j = 0;
		while(true){
			arr[i][j] = num;		
			
			//숫자가 끝나면 끝낸다. 
			if(num == n*n) break;
			
			//방향이 끝나면, dir이 변경될 수 있도록 구현
			//첫번쨰 끝일경우와 한바퀴더돌고 끝인 경우도 구분해야됨. --갈려는쪽이 0이 아니면 막혔으니깐 그만해야됨.
			// 방향을 체크 하고, 끝인지 판단  || 끝이 아니고, 다음방향이  0이 아니면 방향변경, 0이면 그냥 가면되니깐. 
			if (dir == 0 && (j == n - 1 || (j < n - 1 && arr[i][j + 1] != 0)))
				dir++;
			else if (dir == 1 && (i == n - 1 || (i < n - 1 && arr[i + 1][j] != 0)))
				dir++;
			else if (dir == 2 && (j == 0 || (j > 0 && arr[i][j - 1] != 0)))
				dir++;
			else if (dir == 3 && (i == 0 || (i > 0 && arr[i - 1][j] != 0)))
				dir = 0;
			
			//방향에 따라 변경 
			if(dir == 0) j++;
			else if(dir == 1) i++;
			else if(dir == 2) j--;
			else if(dir == 3) i--;
			
			num++;
		}
		for(int k = 0 ; k < n ; k++){
			answer += arr[k][k];
		}
		return answer;
	}
}
