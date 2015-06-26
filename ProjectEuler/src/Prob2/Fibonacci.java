package Prob2;

public class Fibonacci {
	
	public int[] fibonacciSeries(int fcount){
		
		int[] series = new int[fcount];
		series[0]=1;
		series[1]=2;
		
		for(int i=2; i<fcount; i++){
			
			series[i] = series[i-2] + series[i-1];
		}
		return series;
	}

}
