import java.util.Scanner;

public class Calculater {

	static void addition() {
		Scanner scanner = new Scanner(System.in);
		int result = 0;

		while (true) {
			System.out.println("Sayı giriniz: ");

			int number = scanner.nextInt();
			if (number == 0) {
				break;
			}
			result += number;
			System.out.println("Sonuç: " + result);
		}

	}

	static void subtraction() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sayı giriniz: ");
		int result = 0;

		while (true) {
			int number = scanner.nextInt();
			if (number == 0) {
				break;
			}
			result -= number;
			System.out.println("Sonuç: " + result);
		}
	}

	static void multiplation() {
		Scanner scanner = new Scanner(System.in);
		int result = 1;
		while (true) {
			System.out.print("Sayı giriniz: ");
			int number = scanner.nextInt();
			if (number == 1) {
				break;
			}
			result *= number;
			System.out.println("Sonuç: " + result);
		}
	}

	static void division() {
		Scanner scanner = new Scanner(System.in);
		double result = 1;
		while (true) {
			System.out.print("Bölünen değer: ");
			int number1 = scanner.nextInt();
			System.out.print("Bölen değer: ");
			int number2 = scanner.nextInt();
			if (number1 == 0 || number2 == 0) {
				System.out.println("Bölünen veya bölen değeri 0 olamaz!!!");
				break;
			}
			result = number1 / number2;
			System.out.println("Sonuç: " + result);
		}
	}

	static void power() {
		Scanner scanner = new Scanner(System.in);
		int result = 1;

		while (true) {
			System.out.print("Taban değeri:");
			int number1 = scanner.nextInt();
			System.out.print("Üs değeri:");
			int number2 = scanner.nextInt();
			if (number1 == 0) {
				System.out.println("Sonuç: 0");
				break;
			}
			if (number2 == 0) {
				System.out.println("Sonuç: " + result);
				break;
			}
			for (int i = 1; i <= number2; i++) {
				result *= number1;
			}
			System.out.println("Sonuç: " + result);
		}
	}

	static void factorial() {
		Scanner scanner = new Scanner(System.in);
		int result = 1;

		System.out.println("Sayı giriniz: ");
		int number = scanner.nextInt();
		for(int i = 1; i <= number; i++) {
			if (number == 1) {
				System.out.println("Sonuç: " + number);
			}
			result *= i;
		}
		System.out.println("Sonuç: " + result);
	}

	static void mod() {
		Scanner scanner = new Scanner(System.in);
		int result = 1;
		while (true) {
			System.out.print("Bölünen değer: ");
			int number1 = scanner.nextInt();
			System.out.print("Bölen değer:");
			int number2 = scanner.nextInt();
			if (number2 == 0) {
				System.out.println("Bölen değer 0 olamaz!!");
				break;
			}
			result = number1 % number2;
			System.out.println("Sonuç: " + result);
		}
	}

	static void rectangle() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Uzun kenarı giriniz: ");
		int lSide = scanner.nextInt();
		System.out.print("Kısa kenarı giriniz: ");
		int sSide = scanner.nextInt();

		if (lSide == 0 || sSide == 0) {
			System.out.println("Kenarların uzunluğu 0 olamaz!!");
		}
		int area = lSide * sSide;
		int circle = 2 * (lSide + sSide);
		System.out.println("Dikdörtgenin Alanı: " + area);
		System.out.println("Dikdörtgenin Çevresi: " + circle);

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int option;
		
		System.out.println("1.Toplama İşlemi\n" + "2.Çıkarma İşlemi\n" + "3.Çarpma İşlemi\n" + "4.Bölme İşlemi\n"
				+ "5.Üslü Sayı Hesaplama\n" + "6.Faktoriyel Hesaplama\n" + "7.Mod Alma\n"
				+ "8.Dikdörgen Alan ve Çevre Hesabı\n");

		do {
			System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
			option = scanner.nextInt();
			switch (option) {
			case 1:
				addition();
				break;
			case 2:
				subtraction();
				break;
			case 3:
				multiplation();
				break;
			case 4:
				division();
				break;
			case 5:
				power();
				break;
			case 6:
				factorial();
				break;
			case 7:
				mod();
				break;
			case 8:
				rectangle();
				break;
			case 0:
				break;
			default:
				System.out.println("Geçersiz bir tuşa bastınız!!!");
				break;
			}
			
		}
		while (option != 0);
		
	}

}

