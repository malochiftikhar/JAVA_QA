package Level_1_Basic;

public class Arrays {

	public static void main(String[] args) {
		
		Conditonals2 cond = new Conditonals2(); 
		int[] listOfArrays = {4, 6, 1 , 8, 9, 2, 5, 21, 31, 17};
		
		for(int i = 0; i < listOfArrays.length; i++)
		{
			System.out.println(cond.addbol(listOfArrays[i], 10, false));
		}
		
	}
}
