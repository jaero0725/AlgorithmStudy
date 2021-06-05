package test00;
/*
 * 
 * 수열 S가 주어질 때, 이 수열의 연속된 부분 수열 중 지그재그 수열 길이의 최댓값을 구하려 합니다.

지그재그 수열이란 첫 번째 원소부터 인접한 원소의 차이가 증가 → 감소 → 증가 → 감소 ... 혹은 감소 → 증가 → 감소 → 증가 ... 순으로 나타나는 수열을 말합니다. 단, 수열의 길이는 3 이상이어야 합니다.

예를 들어 수열이 [ 2, 5, 7, 3, 4, 6, 1, 8, 9]인 경우, 연속된 부분 수열 [5, 7, 3, 4]가 부분 수열 중 가장 긴 지그재그 수열이 됩니다.

부분 수열 중 가장 긴 지그재그 수열의 길이를 구하기 위해 다음과 같이 프로그램 구조를 작성했습니다.
 */
class Sol02 {
    final int INC = 0;
    final int DEC = 1;
    int[] func_a(int[] arr) {
        int length = arr.length;
        int[] ret = new int[length];
        ret[0] = 1;
        for(int i = 1; i < length; i++) {
            if(arr[i] != arr[i-1])
                ret[i] = ret[i-1] + 1;
            else
                ret[i] = 2;
        }
        return ret;
    }

    int[] func_b(int[] arr) {
        int length = arr.length;
        int[] ret = new int[length];
        ret[0] = -1;
        for(int i = 1; i < length; i++) {
            if(arr[i] > arr[i-1])
                ret[i] = INC;
            else if(arr[i] < arr[i-1])
                ret[i] = DEC;
        }
        return ret;
    }
    int func_c(int[] arr) {
        int length = arr.length;
        int ret = 0;
        for(int i = 0; i < length; i++)
            if(ret < arr[i])
                ret = arr[i];
        if(ret == 2)
            return 0;
        return ret;
    }

    public int solution(int[] S) {
    	//각 숫자가 바로 이전 숫자보다 증가했는지 감소했는지 표시 배열
        int[] check = func_b(S); 
        //길이 
        int[] dp = func_a(check);
        int answer = func_c(dp);
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Sol02 sol = new Sol02();
        int[] S1 = {2, 5, 7, 3, 4, 6, 1, 8, 9};
        int ret1 = sol.solution(S1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int[] S2 = {4, 3, 2, 1, 10, 6, 9, 7, 8};
        int ret2 = sol.solution(S2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

        int[] S3 = {1, 2, 3, 4, 5};
        int ret3 = sol.solution(S3);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret3 + " 입니다.");
    }
}
