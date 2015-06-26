package Prob3;

import java.util.List;

public class App {

	public static void main(String[] args) {

		Factor pF = new Factor();
		// List<Long> factors =
		// pF.findPrimeFactor(Long.valueOf("600851475143"));
		// for(Long fact: factors){
		// System.out.println(fact);
		// }

		// ............Problem 7.............//
		// int count =1;
		// int number = 3;
		// while(count <= 10000000){
		//
		// if(pF.isPrime(number)){
		//
		// System.out.println("Prime No " + count + " is = " + number);
		// count++;
		// number+=2;
		// }
		// else{
		// number+=2;
		// }
		//
		// }
		//
		// System.out.println("it is" + pF.isPrime(16381));

		// ..............Problem 8............//
		// String number =
		// "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
		// // String number =
		// "73167176531330624919225119674426574742355349194934";
		// char[] c = number.toCharArray();
		// long[] array = new long[13];
		// int j = 0;
		// long maxProduct = 1;
		// int i = 0;
		// int noArray = 1;
		// int charArrLength = c.length;
		//
		// while (i < charArrLength) {
		//
		// if (c[i] != '0') {
		// array[j] = (long)Character.getNumericValue(c[i]);
		// j++;
		// } else {
		// array = new long[13];
		// j = 0;
		// }
		// // long a =
		// 2541865800000000000000000000000000000000000000000000000000000000000000000000L;
		//
		// // array[j] = Character.getNumericValue(c[i]);
		// // j++;
		// if (j == 13) {
		// if (Product.arrayProduct(array) > maxProduct) {
		// maxProduct = Product.arrayProduct(array);
		// System.out.println("\n larger array is");
		// }
		// System.out.println("\n");
		// System.out.println("Array no is : " + noArray);
		// noArray++;
		// for (int l = 0; l < array.length; l++) {
		//
		// System.out.print(array[l]);
		// }
		// System.out.println("\n");
		//
		// System.out.println(".....................................");
		//
		// i = i-12;
		// array = new long[13];
		// j = 0;
		// }
		//
		// i++;
		//
		// }
		// // for (int i = 0; i < array.length; i++) {
		// //
		// // System.out.print(array[i]);
		// // }
		// System.out.println("\n" + maxProduct);
		// }
		//
		// ...........................Problem 10....................//

//		int number = 3;
//		long sum = 2;
//
//		while (number < 2000000) {
//
//			if (pF.isPrime(number)) {
//				sum = sum + number;
//			}
//			number+=2;
//		}
//		
//		System.out.println("The summation is : " + sum);
		
		//...................Problem 12..................................//
		long triangleNo = 0;
		int i =0;
		int noFactor = 0;
		while(noFactor<500){
			
			triangleNo = triangleNo + i;
			i+=1;
		     noFactor = pF.findFactors(triangleNo);
			System.out.println(triangleNo+ ":" + noFactor );
			
		}
	}
}
