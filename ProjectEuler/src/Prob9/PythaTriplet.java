package Prob9;

public class PythaTriplet {
	
	public int[] findTriplet(int A){
		
		int[] array = new int[3];
		if(A%2==0){
			
			array[0] = A;
			array[1] = ((A/2)*(A/2)) - 1;
			array[2] = ((A/2)*(A/2)) + 1;
			
		}
		else{
			
			array[0] = A;
			array[1] = ((A*A) - 1)/2;
			array[2] = ((A*A) - 1)/2 + 1;
		}
		
		return array;
	}
	
	public boolean checkEquation (int A,int B){
		
		int LHS = 1000*(A+B) - (A*B);
		
		if (LHS==500000){
			return true;
		}
		else
			return false;
	}

}
