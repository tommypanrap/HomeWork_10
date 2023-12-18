package hw5;

public class HW5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		randAvg();
		
	}
	
	public static void randAvg() {
		int array[] = new int[10];
		int sum = 0;
		
		for(int i = 0; i < 10; i ++) {
			array[i] = (int)(Math.random() * 100);
			sum = sum + array[i]; 
		};
		
		System.out.println("本次亂數結果 : ");
		
		for(int i = 0; i < array.length ; i++) {
			System.out.print(array[i] + " ");
		};
		System.out.println();
		int avg = sum / array.length;
		System.out.println(avg);
		
	}

}
