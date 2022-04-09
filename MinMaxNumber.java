import java.util.Scanner;

public class Value {
	/*
	 * Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük
	 * sayıları bulan ve bu sayıları ekrana yazan program
	 */
	public static void main(String[] args) {
		int count;
		int n = 1;
		int number;
		int min = 0;
		int max = 0;
		int temp;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Sayı adedini giriniz:");
		count = scanner.nextInt();

		while (n <= count) {
			System.out.print(n + ". sayıyı giriniz: ");
			number = scanner.nextInt();
			if (number > max) {
				max = number;

			} else if (number < max) {

				if (number < min) {
					min = number;
				}
			}
			n++;
		}

		System.out.println("Maksimum Sayı: " + max);
		System.out.println("Minimum Sayı: " + min);
	}

}