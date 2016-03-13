package Prob1;

public class NameScore {

	public long findNameScore(String Name, int index) {

		char[] array = Name.toCharArray();
		int temp_integer = 64; // for upper case
		long sum = 0;
		for (char c : array) {
			int temp = (int) c;
			if (temp <= 90 & temp >= 65)
				
 				sum = sum + (temp - temp_integer);
		}
		
		return sum*(index+1);
	}
}
