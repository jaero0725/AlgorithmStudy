

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sol09 {
	public int solution(int[] recordA, int[] recordB){
        //보 2 가위 0 바위 1 
	      //보 0 가위 1 바위 2 
				//보 2 가위 0  win 보 
	      //012
				//0 1(2)  -> 1 
	   		//0 2(0)  -> 0 
				//1 2(0)  -> 2

        int cnt = 0;
        for(int i = 0; i < recordA.length; i++){
            if(recordA[i] == recordB[i]) //비기면
                continue;
            else if(recordA[i] == func(recordB[i])) //이기면
                cnt = cnt + 3;
            else
                cnt =  Math.max(0, cnt - 1);; //지면
        }
        return cnt;
    }
}