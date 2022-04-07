import java.util.Scanner;

public class Number {
	/*
	 * 1.Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan
	 * program(While ile) 2.Bu programı for döngüsü ile yapma
	 */
	public static void main(String[] args) {
		/*
		 * int exponential = 1; int count = 0; Scanner scanner = new Scanner(System.in);
		 * System.out.print("1.Sayıyı giriniz: "); int firstNumber = scanner.nextInt();
		 * System.out.print("2.Sayıyı giriniz: "); int secondNumber = scanner.nextInt();
		 * 
		 * while(!(count == secondNumber)) {
		 * 
		 * exponential *= firstNumber; count++; } System.out.println(firstNumber +
		 * " 'nın " + secondNumber + ".kuvveti: " + exponential);
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("1.Sayıyı giriniz: ");
		int firstNumber = scanner.nextInt();
		System.out.print("2.Sayıyı giriniz: ");
		int secondNumber = scanner.nextInt();
		int exponential = 1;
		for (int i = 1; i <= secondNumber; i++) {
			exponential *= firstNumber;

		}
		System.out.println(firstNumber + " 'ın " + secondNumber + ".Kuvveti: " + exponential);

	}

}
