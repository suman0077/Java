package Prob4;

public class FindPalindrome {
	
	public boolean isPalindrome(int Number){
		
		int actualNumber = Number;
		int reverseNumber = 0;
		int reminder = 0;
		
		while(Number>0){
			reminder = Number%10;
			reverseNumber = reverseNumber*10 + reminder;
			Number = Number/10;
		}
		
		if(actualNumber == reverseNumber){
			return true;
		}
		else{
			return false;
		}
	}

}
