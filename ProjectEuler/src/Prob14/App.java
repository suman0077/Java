package Prob14;

public class App {

	public static void main(String[] args) {
		
		Collatz seq = new Collatz();
		int max = 0;
		
		for(long i = 5; i<1000000; i++){
			
			int count = seq.getSequence(i);
			
			if(count>max){
				
				max = count;
				System.out.println(i + " :" + count);
			}
		}
		System.out.println("Maximum Count " + max);

	}

}
