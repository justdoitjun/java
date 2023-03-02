package ws0228;

public class App {
	static double sumE = 0.0;
	static double sumM = 0.0;

	public static void main(String[] args) {
		Employee arr[] = new Employee[5];
		arr[0] = new Employee("John", 400.0);
		arr[1] = new Employee("Jane", 390.0);
		arr[2] = new Employee("Mike", 350.0);
		arr[3] = new Employee("Jun", 500.0);
		arr[4] = new Employee("Jenny", 490.0);

		for (int i = 0; i < arr.length; i++) {
			arr[i].getAnnSalary();
			arr[i].getTax();
			sumE += arr[i].getAnnSalary();
			System.out.println(arr[i].toString());
			System.out.printf("%d번째 직원의 1년치 연봉은 %4.2f $이며 그(그녀)가 납세할 세금은 %4.2f $입니다.\n", i + 1, arr[i].getAnnSalary(),
					arr[i].getTax());
			System.out.println("");
		}

		System.out.println("---------------------------------------------------");

		Manager arrM[] = new Manager[5];
		arrM[0] = new Manager("Kane", 400.0, 1000.0);
		arrM[1] = new Manager("Henry", 390.0, 700.0);
		arrM[2] = new Manager("Lisa", 350.0, 600.0);
		arrM[3] = new Manager("Jun", 500.0, 999.0);
		arrM[4] = new Manager("Jenny", 490.0, 1300.0);

		for (int i = 0; i < arrM.length; i++) {
			arrM[i].getAnnSalary();
			arrM[i].getTax();
			sumM += arrM[i].getAnnSalary();
			System.out.println(arrM[i].toString());
			System.out.printf("%d번째 임원의 1년치 연봉은 %4.2f $이며 그(그녀)가 이번에 납세할 세금은 %4.2f $입니다.\n", i + 1, arrM[i].getAnnSalary(),
					arrM[i].getTax());
			System.out.println("");
		}

		System.out.println("=========================합계========================");
		System.out.printf("직원의 연봉 총합은 %4.2f $, 임원진의 연봉 총합은 %4.2f $ 입니다\n", sumE, sumM);

	}

}
