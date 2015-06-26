package prob11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		//.....................Problem 11............................//
	/*	long maxProduct = 0;
		FindProduct fP = new FindProduct();
		File data = new File("E:\\daily\\data.txt");
		int[][] array = new int[20][20];

		try {

			Scanner sc = new Scanner(data);

			while (sc.hasNext()) {

				for (int i = 0; i < 20; i++) {
					for (int j = 0; j < 20; j++) {
						array[i][j] = sc.nextInt();
//						System.out.print(array[i][j] + " ");
					}
//					System.out.println("\n");
				}

			}

			sc.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i<17; i++){
			for(int j = 0; j<17; j++){
				
				int[][] smallArray = new int[4][4];
				System.out.println("Start");
				for(int a=i,x=0; a<i+4; a++){
					for(int b=j,y=0; b<j+4; b++){
						
						smallArray[x][y] = array[a][b];
						System.out.print(smallArray[x][y] + " ");
						y++;
					}
					x++;
					System.out.println("\n");
				}
				long product = fP.findGreatestProduct(smallArray);
				if(product>maxProduct){
					
					maxProduct = product;
				}
			}
		}
		
		System.out.println(maxProduct); */
		
		//....................................Probs 13...................................//
		
		int[][] array = new int[100][50];
		FindProduct fP = new FindProduct();
		File data = new File("E:\\daily\\data1.txt");
		try {

			Scanner sc = new Scanner(data);

			while (sc.hasNext()) {

				for (int i = 0; i < 100; i++) {
					for (int j = 0; j < 50; j++) {
						array[i][j] = sc.nextInt();
					System.out.print(array[i][j] + " ");
					}
					System.out.println("\n");
				}

			}

			sc.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int sum = 0;
		
		for (int i = 49; i >=0; i--){
			for (int j = 0; j <100; j++){
				
				sum = sum + array[j][i] ;
			}
			 
		   System.out.print(" " + sum%10);
		   sum = sum/10;
		}
		System.out.println(sum);

	}

}
