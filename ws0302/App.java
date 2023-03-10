package ws0302;

public class App {

	public static void main(String[] args) {
		System.out.println("Following lines are answers to question number 1 and number2");
		Account array[] = new Account[6];
		array[0] = new Account("james1", 10000, 0.35, "VIP");
		array[1] = new Account("james2", 10000, 0.45, "GOLD");
		array[2] = new Account("james3", 10000, 0.55, "SIVER");
		array[3] = new Account("james4", 10000, 0.15, "GOLD");
		array[4] = new Account("james5", 10000, 0.28, "SIVER");
		array[5] = new Account("james6", 10000, 0.31, "VIP");
		
		for(Account i : array) {
			System.out.println(i);
		}//End of for statement
		System.out.println("==========================");
		System.out.println("Following lines are answers to question number 3");
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d 번째 사람의 잔액은 %4.2f, 이자금액은 %4.2f입니다.\n"
			,i+1, array[i].getBalance(), array[i].getInterest());
		}//End of for statement
		
		System.out.println("==========================");
		System.out.println("Following lines are answers to question number 4");
		double sumM = 0.00;
		int cnt = 0;
		for (int i = 0; i < array.length; i++) {
		if(array[i].getGrade() == "VIP") {
			sumM += array[i].getBalance();
			cnt ++;
		}else{
			continue;
		}//End of if
		}//End of for statement
		double avr = sumM / cnt;
		System.out.printf("%d명의 VIP고객의 잔액 합계는 %4.2f이고, 평균은 %4.2f입니다.", cnt, sumM, avr);
		
	}

}
