package Prob4;

public class App {

	public static void main(String[] args) {
		
		FindPalindrome fP = new FindPalindrome();
		System.out.println(fP.isPalindrome(900));
		
		for(int i = 999; i>910; i--){
			for(int j=i; j>909; j--){
				int Number = i*j;
//				System.out.println(i + "*" + j + "=" + Number);
				if(fP.isPalindrome(Number)){
					System.out.println("Palindrome:" + Number);
					break;
				}
			}
		}
		
		//..........Problem 6............//
		int a=0;
		int b=0;
		for(int i = 1; i<=100; i++){
			 a= a +i;
			 b= b + i*i;
		}
		System.out.println("sum =" + (a*a - b));

	}

}
