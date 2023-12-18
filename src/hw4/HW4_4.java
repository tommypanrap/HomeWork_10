package hw4;

public class HW4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = 
			{
			{10,37,100,77,98,90},
			{35,75,70,95,70,80},
			{40,77,79,70,89,100},
			{100,89,90,89,90,75},
			{90,64,75,60,75,50},
			{85,75,70,75,90,20},
			{75,70,79,85,89,99},
			{70,95,90,89,90,75}
			};
		

		
		int temp[] = new int[8];

		
		int tempCompare[] = new int[6] ;
		int tempIndex[] = new int[6];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				temp[i] = array[i][j];
				if(temp[i] > tempCompare[j]) {
					tempCompare[j] = temp[i];
					tempIndex[j] = i + 1;
				}
			}

		}
		

		
		int student[] = new int[8];

		
			for(int j = 0; j < array[0].length; j++) {
//				System.out.println("第"+ (j+1) + "次小考" +"最高分"+tempCompare[j]);
//				System.out.println("號碼是" + tempIndex[j]);
				
				int studentIndex = tempIndex[j] - 1;
				switch(tempIndex[j]) {
	
					case 1 :
						student[studentIndex] = student[studentIndex] + 1;
						break;
					case 2 :
						student[studentIndex] = student[studentIndex] + 1;
						break;
					case 3 :
						student[studentIndex] = student[studentIndex] + 1;
						break;
					case 4 :
						student[studentIndex] = student[studentIndex] + 1;
						break;
					case 5 :
						student[studentIndex] = student[studentIndex] + 1;
						break;
					case 6 :
						student[studentIndex] = student[studentIndex] + 1;
						break;
					case 7 :
						student[studentIndex] = student[studentIndex] + 1;
						break;
					case 8 :
						student[studentIndex] = student[studentIndex] + 1;
						break;
				}
				
				
				
			}
			
			for(int i = 0; i < student.length ; i++) {
				System.out.println("號碼"+ (i+1)+ "有" +student[i]+ "次");
			}
			
			
//		}
	}

}
