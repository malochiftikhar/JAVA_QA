package Level_1_Basic;

import java.util.Random;

public class ITERATIONARRAYS2 {
	
	public static void main(String[] args)
	{
		int[] listOfArrays = new int[10];
		
		for(int i = 0; i < listOfArrays.length; i++) {
			
			listOfArrays[i] = i;
			System.out.println(listOfArrays[i]);
		}
		
		for (int i = 0; i < listOfArrays.length; i++) {
			listOfArrays[i] = listOfArrays[i] * 10;
			System.out.println(listOfArrays[i]);
		}
	}
}