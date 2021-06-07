

public class sol03 {

	 public int func_a(int n){
	        int ret = 1;
	        while(n > 0){
	            ret *= 10;
	            n--;
	        }
	        return ret;
	    }

	    int func_b(int n){
	        int ret = 0;
	        while(n > 0){
	            ret++;
	            n /= 10;
	        }
	        return ret;
	    }
	    
	    int func_c(int n){
	        int ret = 0;
	        while(n > 0){
	            ret += n%10;
	            n /= 10;
	        }
	        return ret;
	    }
	    
		public int solution(int num) {
	        int nextNum = num;
	        while(true){
	            nextNum++;
	            int length = func_b(nextNum);
	            if(length % 2 != 0)
	                continue;

	            int divisor = func_a(length/2);
	            int front = nextNum / divisor;
	            int back = nextNum % divisor;
	            
	            int frontSum = func_c(front);
	            int backSum = func_c(back);
	            if(frontSum == backSum)
	                break;
	        }
	        return nextNum - num;
	}
}
