package hw3;
import java.util.Scanner;

public class HW3_1 {

	public static void main(String[] args) {

		System.out.println("請輸入三個整數:");
		HW3_1 tri = new HW3_1();

		Scanner sc = new Scanner(System.in);
		String triLength = sc.nextLine();

		String[] triArray1 = triLength.split("\\s+");
		int[] triArray = new int[3];
		for(int i = 0; i<triArray1.length; i++){
			triArray[i] = Integer.parseInt(triArray1[i]);
		}

		tri.testTriangle(triArray);
		
		sc.close();
		
	}
	public void testTriangle(int[] triangle) {
		
		int t1 = triangle[0];
		int t2 = triangle[1];
		int t3 = triangle[2];

		if(t1+t2>t3 || t1+t3>t2 || t2+t3>t1 ) {
			
			if(t1 == t2 & t2 == t3) {
				System.out.println("正三角形");
			}else {
				if(t1 == t2 || t2 == t3 || t1 == t3) {
					System.out.println("等腰三角形");
				}else {
					System.out.println("其他三角形");
				}
			}
		}else {
			System.out.print("這不是三角形");
		}
	}

}
