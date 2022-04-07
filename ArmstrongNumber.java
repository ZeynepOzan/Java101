import java.util.Scanner;

public class ArmstrongNumber {
	/*
	 * 1.Java döngüler ile sayının armstrong sayı olup olmadığını bulan program
	 * Armstrong Sayı: N haneli bir sayının basamaklarının n'inci üstlerinin
	 * toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir
	 * Örneğin 407 sayısı (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 Bu da 407 sayısının
	 * armstrong bir sayı olduğunu gösterir. 1342 sayısına da bakalım.
	 * (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için
	 * armstrong sayı olmaz. 2.Bir sayının basamak sayılarının toplamını hesaplayan
	 * program yazınız.
	 * 
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");

		int number = scanner.nextInt();
		/*int count = 0;
		int pow;
		int value;
		int newNumber = number;
		int result = 0;

		while (newNumber != 0) {
			newNumber /= 10;
			count++;

		}
		newNumber = number;
		while (newNumber != 0) {
			value = newNumber % 10;    // 1*1*1*1 = 1^4
			pow = 1;

				for (int i = 1; i <= count; i++) {
						pow *= value;
			}
			result += pow;
			newNumber /= 10;
		}
		if (result == number) {
			System.out.println(number + " sayısı bir Armstrong Sayısıdır.");
		} else {
			System.out.println(number + " sayısı Armstrong Sayısı değildir.");
		}
*/			//Bir sayının basamak sayılarını toplayan program
	
		int newNumber = number;
		int sum;
		int result = 0;
		
		while(number != 0) {
			result += (number%10);
			number /= 10;

		}
		System.out.println(newNumber + " sayısının basamak değerleri toplamı: " + result);
	}

}
