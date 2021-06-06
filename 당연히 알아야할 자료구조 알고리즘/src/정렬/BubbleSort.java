package 정렬;
/*
 * 
( 앞에서 부터 두개씩 바로 옆에 있는 것을 비교한다. 
 작은걸 앞으로 보낸다. ) 을 돌림 

  마지막남은건 안해도됨.
  
 O(n*n) 
 
 */
public class BubbleSort {
	
	public static void swap(int[] arr, int source, int target) {
		int tmp = arr[source];
		arr[source] = arr[target];
		arr[target] = tmp;
	}
	
	//재귀 호출을 할거다.
	public static void bubbleSort(int[] arr) {
		bubbleSort(arr, arr.length-1);
	}
	
	public static void bubbleSort(int[] arr, int last) {
		if(last > 0 ) {
			for(int i = 1; i <= last; i++) {
				//내 앞쪽에 있는 것이 나보다 큰가?, 크면 바꿔준다.
				if(arr[i - 1] > arr[i]) {
					swap(arr, i-1, i);
				}
			}
			//정렬된곳 뺴고 정렬
			bubbleSort(arr, last -1);
		}
	}

	public static void printArray(int [] arr) {
		for(int data:arr) {
			System.out.print(data + ",");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr = {3,5,4,2,1};
		printArray(arr);
		bubbleSort(arr);
		printArray(arr);
	}
}
