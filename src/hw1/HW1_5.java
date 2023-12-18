package hw1;

public class HW1_5 {

	public static void main(String[] args) {
//		double benefit = 0.02;
		int year = 10;
		double temp = 1;
		for(int x = 1 ; x <= year ; x++) {
			temp = temp * (1 + 0.02);
		}
		int principal = 150;
		double result = principal * temp;
		System.out.println(result);
	}

}
