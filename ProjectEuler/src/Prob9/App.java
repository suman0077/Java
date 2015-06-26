package Prob9;


public class App {

	public static void main(String[] args) {

		PythaTriplet pT = new PythaTriplet();
		for (int A = 1; A < 332; A++) {
			
			for(int B = 665-A; B > 500-A; B--){
				
				if(pT.checkEquation(A, B)){
					System.out.println("A = " + A + "B = " + B);
					break;
				}
			}
			
		}

	}
}
