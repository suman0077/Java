package Prob1;

import java.math.BigInteger;

public class Prob20 {

	public static void main(String[] args) {

		long factorial = 1;
		BigInteger bigF = new BigInteger("1");
		for (int j = 20; j >= 1; j--) {
			for (int i = j * 5; i > (j - 1) * 5; i--) {

				factorial = factorial * i;
			}
			BigInteger big = new BigInteger(String.valueOf(factorial));
			bigF = bigF.multiply(big);
			System.out.println(factorial);
			System.out.println(bigF);
			factorial = 1;
		}
		
		String number = bigF.toString();
		System.out.println(number);
		
		char[] array = new char[number.length()];
		array = number.toCharArray();
		int sum =0;
		for(int i =0; i<number.length(); i++){
			
			sum = sum + Character.getNumericValue(array[i]);
		}
		
		System.out.println(sum);
	}

}
