import java.util.Scanner;

public class Numbers {
	static boolean primeNumbers(int number) {
		boolean result = true;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				result = false;
			}

		}
		return result;
	}

	public static void main(String[] args) {
		while (true) {

			Scanner scanner = new Scanner(System.in);
			System.out.print("Sayı giriniz: ");
			int n = scanner.nextInt();
			if (n == 1) {
				System.out.println("En küçük asal sayı 2'dir.\n" + "2'den büyük bir sayı giriniz!!");
				break;
			}
			primeNumbers(n);
			if (primeNumbers(n) == true) {
				System.out.println("Asal sayıdır.");
			} else {
				System.out.println("Asal sayı değildir.");
			}

		}

	}

}