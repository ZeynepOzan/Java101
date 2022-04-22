import java.util.Scanner;

public class RecursivePower {
	static void powerNumbers() {
		
		while (true) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Taban değeri giriniz: ");
			int num1 = scanner.nextInt();
			System.out.println("Üs değeri giriniz: ");
			int num2 = scanner.nextInt();
			int result = 1;
			if (num1 == 0) {
				System.out.println("0 dan farklı bir değer giriniz.");
				break;
			}
			if (num2 == 0) {
				System.out.println("Sonuç: " + result);
				break;
			}
			for (int i = 1; i <= num2; i++) {
				result *= num1;
			}
			System.out.println("Sonuç: " + result);
		}
	}

	public static void main(String[] args) {
			powerNumbers();
	}

}