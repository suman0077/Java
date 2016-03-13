package Prob1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Prob22 {

	public static void main(String[] args) throws FileNotFoundException {

		String[] array = new String[5163];
		
		
		File data = new File("E:\\daily\\p022_names.txt");
		Scanner sc = new Scanner(data);
		while (sc.hasNext()) {

			for(int i = 0; i<array.length; i++){
				
				array[i] = sc.nextLine();
				
			}

		}

		sc.close();
		
		Arrays.sort(array);
		
		NameScore nameScore = new NameScore();
//		System.out.println(nameScore.findNameScore(array[937], 937));
		long sum = 0;
		for(int i = 0; i<array.length; i++){
			
			sum = sum + nameScore.findNameScore(array[i], i);
			
		}
		
		System.out.println(sum);
	}

}
