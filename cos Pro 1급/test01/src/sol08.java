

/*
 * do while 문 사용 
 * 알고리즘 cnt check 
 */

// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

public class sol08 {
	 public int[] solution(int N, int[] votes) {
	        
	        int voteCounter[] = new int[11];
	        for (int i = 0; i < votes.length; i++) {
	            voteCounter[votes[i]] ++;
						//voteCounter[votes[i] = voteCounter[votes[i] + 1;
						//1
	        }
	        int maxVal = 0;
	        int cnt = 0;
	        for (int i = 1; i <= N; i++) {
	            if (maxVal < voteCounter[i]) {
	                maxVal = voteCounter[i];
	                cnt = 1;
	            }
	            else if(maxVal == voteCounter[i]){
	                cnt += 1;
	            }
	        }
	        int answer[] = new int[cnt];
	        for (int i = 1, idx = 0; i <= N; i++){
	            if (voteCounter[i] == maxVal) {
	                answer[idx] = i;
	                idx += 1;
	            }
	        }
	        return answer;
	    }
}