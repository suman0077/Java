package Prob1;

public class Prob24 {

	public static void main(String[] args) {

		long limit = 1000000;
		long fact = 0;
		int i = 9;
		int[] array = {0,1,2,3,4,5,6,7,8,9};
		
		for (i = 9; i >= 0; i--) {
			
			int count = 0;
			fact = factorial(i);
//			System.out.println(i + ":" + fact);
			while (fact < limit) {
//				System.out.println(i + ":" + fact);
				limit -= fact;
				count++;
				
				
			}
			
			if(count>0){
				
				int temp = array[9-i+count];
				for(int j = 9-i+count ; j>=9-i+1; j--){
					
					array[j] = array[j-1];
				}
				array[9-i]=temp;
			}
			System.out.println(array[9-i]);
//			else{
//				j = 0;
//			}
			
		}
	}

	public static long factorial(int number) {

		long product = 1;
		for (int i = number; i >= 1; i--) {

			product = product * i;
		}

		return product;
	}

}
