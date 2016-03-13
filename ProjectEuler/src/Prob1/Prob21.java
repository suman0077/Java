package Prob1;

import java.util.ArrayList;
import java.util.List;

import Prob3.Factor;

public class Prob21 {

	public static void main(String[] args) {
		
		Factor number = new Factor();
		long factorSum1, factorSum2 ;
		
		List<Long> amicable = new ArrayList<Long>();
		
		for(int i = 4 ; i<10000000; i++){
			
			if(number.isPrime(i)==false){
				
				factorSum1 = number.findFactorsSum(i);
				factorSum2 = number.findFactorsSum(factorSum1);
				
				if (i==factorSum2&&factorSum1>i){
					
					amicable.add((long)i);
					amicable.add(factorSum1);
				}
			}
			
		}
		long SumOfAmicable = 0;
		for(Long i:amicable){
			
			SumOfAmicable = SumOfAmicable + i ;
			System.out.println(i);
		}
		System.out.println(SumOfAmicable);
		

	}

}
