package test;



public class Cal {

	public static double div(int a, int b) throws Exception{
		double result = 0.0;
		try {
		result = a/b;
		}catch(Exception e) {
			throw e;
		}
		return result;
	}// end of method
	public static double div(double a, double b) throws InfinityException {
		if (b == 0.0) {
			throw new InfinityException("B0001");
		}
		return result;
	}//overload

}// end of class
