package prob3;

public class CurrencyConverter {

	static double rate;
	
	public static void setRate(double d) {
		rate =d;
		
	}

	public static double toDollar(int i) {
		// TODO Auto-generated method stub
		return i/rate;
	}

	public static double toKRW(int i) {
		// TODO Auto-generated method stub
		return i*rate;
	}
	
}
