package Level_2_Intermediate;

public class TooHot {
	public boolean isSummer (int temperature, boolean isSummer) {
		if(isSummer) {
			if (temperature >= 60 && temperature <= 100) {
				 return true;
			}
				 else {
					 return false;
				 }
		}else {
			if (temperature >= 60 && temperature <= 90) {
				 return true;
			}
			else return false;
		}	
	}
}
