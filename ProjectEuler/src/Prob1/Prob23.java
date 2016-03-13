package Prob1;

import java.util.ArrayList;
import java.util.List;

import Prob3.Factor;

public class Prob23 {

	public static void main(String[] args) {
		
		List<Integer> abundantNumber = new ArrayList<Integer>();
		
		Factor number = new Factor();
		for(int i = 12 ; i < 28123 ; i ++){
			
			if(i < number.findFactorsSum(i)){
				
				abundantNumber.add(i);
//				System.out.println(i);
			}
		}
		
		boolean isSumOfAbundant[] = new boolean[28123];
		
		for(int i = 0 ; i < abundantNumber.size(); i++){
			for(int j = i; j < abundantNumber.size(); j++){
				
				int abundantSum = abundantNumber.get(i) + abundantNumber.get(j);
				
				if(abundantSum < 28123){
					
					isSumOfAbundant[abundantSum] = true;
				}
			}
		}
		
		int nonAbundantSum = 0;
		for(int i = 0 ; i < 28123 ; i ++){
			
			if(!isSumOfAbundant[i]){
				
				nonAbundantSum += i;
			}
		}
		
		System.out.println(nonAbundantSum);

	}

}
