import java.util.Scanner;

public class Calculator {
	//Switch-case kullanılarak hesap makinesi programı

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Toplama İşlemi\n"
				+ "2.Çıkarma İşlemi\n"
				+ "3.Çarpma İşlemi\n"
				+ "4.Bölme İşlemi\n");
		System.out.print("Yapmak istediğiniz işlemi seçiniz:");
		int count = scanner.nextInt();
		System.out.print("1.sayıyı giriniz:");
		int firstNumber = scanner.nextInt();
		System.out.print("2.sayıyı giriniz:");
		int secondNumber = scanner.nextInt();
		
		switch(count) {
		case 1:
			int sum = firstNumber + secondNumber;
			System.out.println("Toplama İşleminin Sonucu: " + sum);
			break;
		case 2:
			int minus = firstNumber - secondNumber;
			System.out.println("Çıkarma İşleminin Sonucu: " + minus);
			break;
		case 3:
			int mult = firstNumber * secondNumber;
			System.out.println("Çarpma İşleminin Sonucu: " + mult);
			break;
		case 4:
			int divide = firstNumber / secondNumber;
			System.out.println("Bölme İşleminin Sonucu: " + divide);
			break;
		}
	}
}
