package hw4;

public class HW4_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		
		int sum;
		double avg;
		sum = 0;
		for(int i = 0; i<x.length ;i++) {
			sum = x[i] + sum;
		}
		avg = sum / x.length;
		System.out.println("平均值" + avg);
		
		System.out.print("大於平均值的元素");
		for(int i = 0; i<x.length ;i++) {
			if(x[i] > avg) {
				System.out.print(x[i] + " ");
			}
		}
	}

}
