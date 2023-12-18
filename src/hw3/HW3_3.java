package hw3;
import java.util.Scanner;

public class HW3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("請輸入你討厭哪個數字?");
		Scanner sc = new Scanner(System.in);
		int noNumber = sc.nextInt();
//		int noNumber = 3;
		String stringNumber = Integer.toString(noNumber);
		int countLayout = 0;
		for(int i = 1; i <= 49 ; i++) {
			
			
			String numberComparison = Integer.toString(i);
			if(numberComparison.contains(stringNumber)) {
				
			}else {
				countLayout = countLayout + 1;
				
				System.out.print(numberComparison+"\t");
				if(countLayout % 6 == 0) {
					System.out.println();
				}else {}
				

			}
		}
		System.out.println("總共有"+countLayout+"數字可選");
		
		sc.close();
	}

}
