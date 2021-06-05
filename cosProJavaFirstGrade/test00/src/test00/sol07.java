package test00;

class Sol07 {
	
	//n개의 카드, mix번 섞어서, k번째 나오는 숫자는?
    public int solution(int n, int mix, int k) {
        int answer = 0;

        int[] card = new int[n];
        
        //카드 1,2,3,...n (n개) 
        for(int i = 0; i < n; i++)
            card[i] = i+1;

        //mix 갯수 만큼 섞기
        while((mix--) != 0) {
        	
        	//1) 카드 뭉치를 정확히 반으로 나눔
        	//왼쪽 카드 
            int[] cardA = new int[n/2]; //크기지정
            //오른쪽 카드
            int[] cardB = new int[n/2]; //크기지정

            //cardA 먼저 하나, cardB 하나 이렇게 넣자.
            
            //card[] 에서 반반씩 나눠서 만들어 놓음. 
            /*
             
            (1) 일단 cardA, cardB 배열 사이즈가 맞지 않는다. 크기가 n/2 인데 i는 n까지 커져버린다.
			(2) cardB는 i를 n/2로 나눈 나머지 값을 인덱스로 넣어야 한다. 
             
             */
            for(int i = 0; i < n; i++) {
                if(i < n/2)
                    cardA[i] = card[i];
                else
                    cardB[i%(n/2)] = card[i];
            }

            //섞어놓은거 차곡차곡 넣기 
            for(int i = 0; i < n; i++) {
            	//0
                if(i % 2 == 0)
                    card[i] = cardA[i/2];
                //1 
                else
                    card[i] = cardB[i/2];
            }
        }
        //k 번째에 있는거 뭔지 answer
        answer = card[k-1];
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
    public static void main(String[] args) {
    	Sol07 sol = new Sol07();
        int n = 6;
        int mix = 3;
        int k = 3;
        int ret = sol.solution(n, mix, k);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소의 반환 값은 " + ret + " 입니다.");
    }
}
