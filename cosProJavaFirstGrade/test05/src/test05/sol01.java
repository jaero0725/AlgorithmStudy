package test05;

//1) 10분걸림.
class sol01 {
	//등차수열이군. 
    public int solution(int n) {
        int answer = 0;

        int[] steps = new int[n+1];
        steps[1] = 1;
        steps[2] = 2;
        steps[3] = 4;
			
        for(int i = 4; i <= n; i++)
        	steps[i] = steps[i-1] + 3;
        answer = steps[n];

        return answer;
    }
}