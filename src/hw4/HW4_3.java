package hw4;

import java.util.Scanner;

public class HW4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int Array[][] = new int[12][1];
		
		Array[0][0] = 31;
		Array[1][0] = 28;
		Array[2][0] = 31;
		Array[3][0] = 30;
		Array[4][0] = 31;
		Array[5][0] = 30;
		Array[6][0] = 31;
		Array[7][0] = 31;
		Array[8][0] = 30;
		Array[9][0] = 31;
		Array[10][0] = 30;
		Array[11][0] = 31;
		
		int y ,m , d , days;
		boolean check = false;
		do {
		
			check = false;
			
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
		days = 0;
		
		if((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0)) {
			Array[1][0] = 29;
		}
		
		if(d > Array[m-1][0]) {
			System.out.println("error"); //迴圈要繼續跑 所以boolean為true才會繼續跑
			check = true ;
		}
		
		}while(check);
		
//		if(d > Array[m-1][0]) {
//			System.out.println("error");
//		}
		
		for(int i = 0 ; i < m - 1 ; i++) {
			days = Array[i][0] + days;
		}
//		System.out.println(days);
		days = days + d;
		System.out.println("輸入的日期為該年第"+ days + "天");
		
		sc.close();
	}

}
