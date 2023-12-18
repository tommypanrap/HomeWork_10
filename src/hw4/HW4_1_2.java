package hw4;

public class HW4_1_2 {

	public static void main(String[] args) {
		
		String s = "Hello World";
		char tempStr[] = s.toCharArray();
		
		char newStr[] = new char[tempStr.length];
		
		for(int i = 0; i<tempStr.length ; i++) {
			int j;
			j = tempStr.length - i - 1;
			newStr[i] = tempStr[j];
			System.out.print(newStr[i]);
		}
		
	}

}
