package Prob2;

public class App {

	public static void main(String[] args) {
		int sumEven = 0;
		Fibonacci f = new Fibonacci();
//		int[] fSeries = f.fibonacciSeries(33);
//		for(int i=0; i<33; i++){
//			System.out.println(fSeries[i]);
//			if(fSeries[i]<4000000 && fSeries[i]%2 == 0 ){
//				sumEven = sumEven + fSeries[i];
//			}
//		}
//		System.out.println("Even Sum :" + sumEven);
		
		f.fibonacciSeries(200);
		
	}

}
