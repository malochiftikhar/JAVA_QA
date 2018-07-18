package Level_2_Intermediate;

public class UniqueSum {
	
	public int sum (int one, int two, int three) {
		
		if(one != two && two != three && one != three) {
			int total = one + two + three;
			return total;
		}
			
		if(one == two && two == three) {
			return 0;
		}
		if(one == two && two != three) {
			return three;
		}
		
		if(one != two && two == three) {
			return one;
		}
		if(one == three && two != three) {
			return two;
		}
		else
			return 0;
	}
}
