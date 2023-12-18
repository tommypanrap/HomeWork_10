package hw4;

import java.util.Scanner;

public class HW4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int lentMoney= sc.nextInt();
//		int lentMoney;
//		lentMoney = 1000;
		int count = 0;
		
		int[][] borrowArray = {{25,2500},{32,80},{8,500},{19,1000},{27,1200}};
//		System.out.println(borrowArray[1][1]);
		System.out.print("員工編號:");
		for(int i = 0;i < borrowArray.length;i++) {
			if(borrowArray[i][1] >= lentMoney) {
				System.out.print(borrowArray[i][0]+" ");
				count = count+1;
			}
		}
		System.out.println("共" + count + "人!");
		
		sc.close();
	}

}
