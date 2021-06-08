import java.util.*;
class sol10 {
	int solution(int[] prices){
        int inf = 1000000001;
        int tmp = inf;
        int answer = -inf;
        for(int price : prices){
            if(tmp != inf)
                answer = Math.max(answer, price-tmp);
            tmp = Math.min(tmp, price);
        }
        return answer;
    }
}
