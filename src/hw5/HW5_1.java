package hw5;

import java.util.Scanner;

public class HW5_1 {
//	private int width;
//	private int height;
	
	
	public static void main(String[] args) {
//		HW5_1 printStar = new HW5_1();
		System.out.println("請輸入寬與高");
		Scanner sc = new Scanner(System.in);
		int array[] = new int[2];
		String input = sc.nextLine();
		String[] str = input.split(" ");
		
		System.out.println(str[0] + " " + str[1]);
		
		for(int i = 0;i < str.length ; i++) {
			array[i] = Integer.parseInt(str[i]);
		}
		
		starSquare(array[0],array[1]);
		
		sc.close();
	}
	
	public static void starSquare(int width, int height) {
		for(int i = 0; i < height; i ++) {
			for(int j = 0; j < width; j ++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}

