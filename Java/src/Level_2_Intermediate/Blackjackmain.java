package Level_2_Intermediate;

public class Blackjackmain {
	
public int blackjack(int in1, int in2) {
	
	if(in1 > 21 && in2 > 21)
		return 0;
	if(in1 < 1 && in2 < 1)
		return 0;
	if(in1 > 21 && in2 <= 21 && in2 > 0)
		return in2;
	if(in1 > 21 && in2 <= 21 && in2 > 0)
		return in1;
	if(in1 > in2 && in2 <= 21 && in2 > 0)
		return in1;
	if(in1 > in1 && in2 <= 21 && in2 > 0)
		return in2;

	return 0;

}
}