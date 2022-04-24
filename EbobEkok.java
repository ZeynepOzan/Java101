import java.util.Scanner;

public class Main {
	/*
	 * EBOK/EKOK Kullanıcıdan alınan 2 sayının Ebob ve ekok değerlerini hesaplama
	 * 
	 */

	public static void main(String[] args) {
		int ebob = 1;
		int ekok;
		int n = 1;

		Scanner scanner = new Scanner(System.in);
		System.out.print("1.Sayıyı giriniz:");
		int number1 = scanner.nextInt();
		System.out.print("2.Sayıyı giriniz:");
		int number2 = scanner.nextInt();

		int firstNumber = number1;
		int secondNumber = number2;

		if (number1 > number2) {
			while (n <= secondNumber) {
				if (number1 % n == 0 && number2 % n == 0) {
					number1 /= n;
					number2 /= n;
					ebob *= n;
				}
				n++;
			}

		} else {
			while (n <= firstNumber) {
				if (number1 % n == 0 && number2 % n == 0) {
					number1 /= n;
					number2 /= n;
					ebob *= n;
				}
				n++;
			}
		}
		System.out.println("Ebob: " + ebob);
		ekok = (firstNumber * secondNumber) / ebob;
		System.out.println("Ekok: " + ekok);
	}
}
