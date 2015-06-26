package Prob14;

public class Collatz {

	public int getSequence(long number) {
		
		int count = 0;
		while (number != 1) {
			if (number % 2 == 0) {

				number = number / 2;
				count ++;
//				System.out.print(number + " ");
			} else {

				number = 3 * number + 1;
				count++;
//				System.out.print(number + " ");
			}
		}
		
		return count;

	}

}
