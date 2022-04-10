import java.util.Scanner;

public class number {
	/*
	 * Klavyeden girilen bir sayının mükemmel vsayı olup/olmadığını bulan ve
	 * mükemmel sayı ise ekrana mükemmel sayıdır değilse mükemmel sayı değildir
	 * ifadelerini ekrana yazan program
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		int number = scanner.nextInt();
		int n = 1;
		int perfectNumber = 0;

		while (n < number) {
			if (number % n == 0) {
				perfectNumber += n;
			}
			n++;
		}
		if (perfectNumber == number) {
			System.out.println(number + " Mükemmel sayıdır.");
		} else {
			System.out.println(number + " Mükemmel sayı değildir.");
		}
	}
}
