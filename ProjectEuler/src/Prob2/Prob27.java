package Prob2;

import java.sql.Time;

import Prob3.Factor;

public class Prob27 {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		Factor prime = new Factor();
		int[] array = new int[168];
		int count = 0;
		for(int i = 1; i<1000 ; i+=2){
			
			if(prime.isPrime(i)){
				array[count] = i ;
				count++;
			}
			
		}
//		System.out.println(array[1]);
		int n = 0;
		int temp = 0; 
		
		for(int b = 167 ; b >0 ; b--){
			
			for(int a = -array[b]; a<1000 ; a++){
				
//				long number = n*n + a*n + array[b];
				while(prime.isPrime(n*n + a*n + array[b])){
					
					n++;
//					number = n*n + a*n + array[b];
				}
//				if(n>30){
//					System.out.println(" n :" + n + " a :" + a + " b : " + array[b]);
//				}
				
				if(n>temp){
					
					System.out.println(" n :" + n + " a :" + a + " b : " + array[b]);
					temp = n;
					n = 0;
				}
				n=0;
			}
		}
		long endtTime = System.currentTimeMillis();
		long totalTime = endtTime - startTime ;
		System.out.println(totalTime);
	}

}
