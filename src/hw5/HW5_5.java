package hw5;

public class HW5_5 {
	public static String genAuthCode() {

//		ACII 65 - 90 26個 大寫英文字母A-Z
//		ACII 97 - 122 26個  小寫英文字母a-z
//		ACII 0 - 9 10個 數字0-9
		int[] array = new int[62];
		char[] arrayResult = new char[8];
		
		int j;
		
//		把A-Z的ASCII碼存進array陣列中
		j = 65;
		for(int i = 0; i < 26 ; i++) {
			array[i] = j;
			j++;
		}
		
//		把a-z的ASCII碼存進array陣列中
		j = 97;
		for(int i = 26; i < 52 ; i++) {
			array[i] = j;
			j++;
		}
		
//		把0-9的ASCII碼存進array陣列中
		j = 48;
		for(int i = 52; i < 62 ; i++) {
			array[i] = j;
			j++;
		}
		
//		0 <= Math.random*62 < 62
//		index 0 - 61
		
		
		String stringResult = new String("");
		for(int i = 0; i < 8; i++) {
			int genToArrayIndex = (int)(Math.random()*62);
			arrayResult[i] = (char)array[genToArrayIndex];
			stringResult = stringResult + arrayResult[i]  ;

		}

		System.out.print(stringResult);
		
		
		return stringResult;
	}

	public static void main(String[] args) {
		System.out.println("本次隨機產生驗證碼為:");
		String authCode = genAuthCode();
		System.out.println(authCode);
	}

}
