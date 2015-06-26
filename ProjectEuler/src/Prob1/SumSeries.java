package Prob1;

public class SumSeries {
	
	public float SumAPSeries (int initialValue, int finalValue, int difference){
		
		float totalTerm = finalValue/initialValue;
		float n = (totalTerm/2);
		float sum = n*(2*initialValue + (totalTerm-1)*difference);
		return sum;
	}
}
