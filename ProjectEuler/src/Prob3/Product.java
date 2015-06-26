package Prob3;

public class Product {

	public static long arrayProduct(long[] array) {

		Product.arraySum(array);
		long product = 1;
		for (int i = 0; i < array.length; i++) {

			product = product * array[i];
		}
		System.out.println("The Product is : " + product);

		return product;
	}

	public static void arraySum(long[] array) {

		long Sum = 0;
		for (int i = 0; i < array.length; i++) {

			Sum = Sum + array[i];
		}
		System.out.println("..................................");
		System.out.println("Sum of the digits: " + Sum);
	}
	public static int arraySum(int[] array) {

		int Sum = 0;
		for (int i = 0; i < array.length; i++) {

			Sum = Sum + array[i];
		}
		return Sum;
	}
}
