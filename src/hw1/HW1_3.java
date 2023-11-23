package hw1;

public class HW1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int topic = 256559;
		int day = topic / 60 / 60 / 24;
		System.out.println(day + "天");
		int hour = ( topic - day * 24 * 60 * 60 ) / 60 / 60;
		System.out.println(hour + "小時");
		int minute = ( topic - day * 24 * 60 * 60 - hour * 60 * 60 ) / 60 ;
		System.out.println(minute + "分鐘");
		int sec = topic - day * 24 * 60 * 60 - hour * 60 * 60 - minute * 60 ;
		System.out.println(sec + "秒");
		
	}

}
