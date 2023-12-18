package hw5;

import hw1.Work03;

public class HW5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Work03 w = new Work03();
		
		int[][] intArray = {
		{1,6,3},
		{9,5,2}
		};

		double[][] doubleArray = {
				{1.2, 3.5, 2.2},
				{7.4, 2.1, 8.2}
		};
		
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));
	}

}
