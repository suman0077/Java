package Prob3;

import java.util.ArrayList;
import java.util.List;

public class Factor {

	public List<Long> findPrimeFactor(long theNumber) {

		List<Long> primes = new ArrayList<Long>();

		while (theNumber % 2 == 0) {
			primes.add(Long.valueOf(2));
			theNumber = theNumber / 2;
		}

		for (int i = 3; i <= Math.sqrt(theNumber); i = i + 2) {

			while (theNumber % i == 0) {
				primes.add(Long.valueOf(i));
				theNumber = theNumber / i;
			}

		}
		if (theNumber > 2) {
			primes.add(Long.valueOf(theNumber));
		}

		return primes;
	}

	public boolean isPrime(long theNumber) {

		for (int i = 3; i <= Math.sqrt(theNumber); i = i + 2) {

			 if(theNumber % i == 0 && theNumber!= i) {
				
				return false;
			}

		}
		
		return true;
	}
	
	public int findFactors(long Number){
		
		int count = 0;
		int sqrt = (int)Math.sqrt(Number);
		for(int i=1;i<=sqrt;i++){
			
			if(Number%i==0){
				
				count+=2;
			}
		}
		if(sqrt*sqrt==Number){
			
			count --;
		}
		
		
		return count;
	}

}
