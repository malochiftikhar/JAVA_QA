package Level_1_Basic;

public class Conditonals2 {
	
	public int addbol (int a, int b, boolean tf) {
		if (a == 0) {
			return b;
		}else if(b == 0) {
			return a;
		}
		if (tf) {
			return a + b;
		}else {
			return a*b;
		}
	}
}
