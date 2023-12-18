package hw4;

public class HW4_1_3 {

	public static void main(String[] args) {
		String planet[] = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		int other = 0;
		

		
		int totalLength = 0;
		
		for(int k = 0; k < planet.length ; k++) {
			totalLength = totalLength + planet[k].toCharArray().length;
		}
		
		System.out.println("總共有"+totalLength+"個字母");
//		
//		char planetNew[] = new char[totalLength];
		
		char planetTemp[][] = new char[planet.length][];
		
		//把二維陣列的長度都宣告完成
		for(int k = 0; k < planet.length ; k++) {
			char temp[] = planet[k].toCharArray();
			planetTemp[k] = new char[temp.length];
//			planet[k].toCharArray()			
		}
		
		for(int l = 0; l < planet.length ; l++) {
			planetTemp[l] = planet[l].toCharArray();
			for(int j = 0; j < planetTemp[l].length; j++) {
				switch(planetTemp[l][j]) {
					
					case 'a':
						a = a + 1;
						break;
					case 'e':
						e = e + 1;
						break;
					case 'i':
						i = i + 1;
						break;
					case 'o':
						o = o + 1;
						break;
					case 'u':
						u = u + 1;
						break;
					default:
						other = other + 1;
				}
			}
		}
		
		
		
		
		System.out.println("有"+ a + "個a");
		System.out.println("有"+ e + "個e");
		System.out.println("有"+ i + "個i");
		System.out.println("有"+ o + "個o");
		System.out.println("有"+ u + "個u");
		System.out.println("有"+ other + "個其他字母");
	}
}
