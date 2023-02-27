package array;

public class P103 {

	public static void main(String[] args) {

		//int arr[] = new int[];
		//error
		int a = 100;
		
		int arr[] = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		System.out.println(arr);
		
		//arr 안에 있는 int값을 하나씩 하나씩 꺼낼 수 있는 방법.
		//최근에는 for(int i = 1....)이것보다 더 많이 쓴다. 
		//다만 단점은 이 경우에는 각 data값에 일련번호를 달기가 어렵다는 단점이 있다 
		System.out.println("Type2");
		for(int data:arr) {
			System.out.printf("%d \t", data);
		}
		
		
		
		
		
	}

}
