

import java.util.*;

class sol02{
	public int func_a(String times){
        int hour = Integer.parseInt(times.substring(0, 2));
        int minute = Integer.parseInt(times.substring(3));
        return hour*60 + minute;
    }
    public int solution(String[] subwayTimes, String currentTime) {
        int currentMinute = func_a(currentTime);
        int INF = 1000000000;
        int answer = INF;
        for(int i = 0; i < subwayTimes.length; ++i){
            int subwayMinute = func_a(subwayTimes[i]);
            if(currentMinute <= subwayMinute){
                answer = subwayMinute - currentMinute;
                break;
            }
        }
        if(answer == INF)
            return -1;
        return answer;
    }

}
