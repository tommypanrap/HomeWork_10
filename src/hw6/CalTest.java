package hw6;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		boolean check = false;
		
		boolean checkFormatI = false;
		boolean checkFormatJ = false;
		
		do {
			try {
				int i= 0;
				int j = 0;
				
				do {
					System.out.println("請輸入x的值");
					String inputI = sc.next();
					try {
						i =  Integer.parseInt(inputI);
						checkFormatI = true;
					}catch(NumberFormatException se) {
						System.out.println("輸入格式不正確");
					}
				}while(!checkFormatI);

				
				do {
				
					System.out.println("請輸入y的值");
					String inputJ = sc.next();

					try {
					j =  Integer.parseInt(inputJ);
					checkFormatJ = true;
				}catch(NumberFormatException se) {
					System.out.println("輸入格式不正確");
				}
				
				}while(!checkFormatJ);
				
				Calculator calculator = new Calculator();
				calculator.powerXY(i, j);
				System.exit(0);
				
				
				

			}catch(CalException ce){
				check = true;
			}

		}while(check);
		
		sc.close();
	}

}
