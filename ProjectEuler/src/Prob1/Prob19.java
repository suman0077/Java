package Prob1;

public class Prob19 {

	public static void main(String[] args) {

		int[] firstDay = new int[1212];

		firstDay[0] = 31;
		firstDay[1] = 28;
		firstDay[2] = 31;
		firstDay[3] = 30;
		firstDay[4] = 31;
		firstDay[5] = 30;
		firstDay[6] = 31;
		firstDay[7] = 31;
		firstDay[8] = 30;
		firstDay[9] = 31;
		firstDay[10] = 30;
		firstDay[11] = 31;

		int year;
		int month = 12;

		for (year = 1901; year <= 2000; year++) {

			if (year % 4 == 0) {
				for (int i = 0; i < 12; i++) {

					if (i == 1) {
						firstDay[month] = firstDay[i] + 1;
						month++;
					} else {
						firstDay[month] = firstDay[i];
						month++;
					}

				}
			} else {

				for (int i = 0; i < 12; i++) {

					firstDay[month] = firstDay[i];
					month++;

				}
			}
		}

		for (int i = 0; i < firstDay.length; i++) {

			System.out.print(" " + firstDay[i]);
		}
		
		System.out.println("\n");
		int count =0;
		firstDay[0] = 32;
		for (int i = 1; i < firstDay.length; i++) {

			firstDay[i] = firstDay[i] + firstDay[i - 1];
			if(firstDay[i]%7==0){
				
				count++;
			}
		}
		for (int i = 0; i < 1212; i++) {

			System.out.print(" " + firstDay[i]);
		}
		
		System.out.println("\n");
		
		System.out.println(count);
		

	}

}
