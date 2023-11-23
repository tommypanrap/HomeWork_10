package hw1;
import java.util.Scanner;

public class HW3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("開始猜數字吧!");
		int i;
		i = (int)(Math.random()*10);
		System.out.println("答案是"+ i);
		
		Scanner sc = new Scanner(System.in);
		
		int answer;
		do {
			 answer = sc.nextInt();
			 if(i != answer) {
				 System.out.println("猜錯囉");
			 }
			 
		}while( i != answer);
		System.out.println("答對了!"+"答案就是"+i);
	}

}
