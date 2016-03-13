package Prob2;

public class Fibonacci {
	
	public int[] fibonacciSeries(int fcount){
		
		int[] series = new int[fcount];
		series[0]=1;
		series[1]=2;
		
		for(int i=2; i<fcount; i++){
			
			series[i] = series[i-2] + series[i-1];
			System.out.print(" " + series[i]);
		}
		return series;
	}
	
	double phi = (1 + Math.sqrt(5))/2;
	public double fibonacciOfIndex (int Index){
		
		double phi = (1 + Math.sqrt(5))/2;
		double phiC = (1 - Math.sqrt(5))/2;
		
		double number = (Math.pow(phi , Index))/Math.sqrt(5);
		
		return number;
	}
	
	public double IndexOfFibonacciByDigit(int base){
		
		double number = (base*Math.log(10) + Math.log(Math.sqrt(5)))/Math.log(phi);
		return number;
	}

}
