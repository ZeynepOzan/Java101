import java.util.Scanner;

public class RecursivePower {
	static int powerNumbers(int num1, int num2) {

		int result = 1;
		if (num2 < 1) {
			return 1;
		} else {
			return num1 * powerNumbers(num1, num2 - 1);
		}
	}

	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);

			System.out.println("Taban değeri giriniz: ");
			int num1 = scanner.nextInt();
			System.out.println("Üs değeri giriniz: ");
			int num2 = scanner.nextInt();
			if (num1 == 0) {
				System.out.println("Taban değeri 0 olamaz!!");
				break;
			} else {
				System.out.println("Sonuç: " + powerNumbers(num1, num2));
			}
		}
	}
}