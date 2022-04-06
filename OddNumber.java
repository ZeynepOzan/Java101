import java.util.Scanner;

public class Numbers {
	/*
	 * 1.Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri
	 * kabul eden ve girilen değerlerden tek sayıları toplayıp ekrana basan program
	 * 2.Girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana
	 * bastıran program
	 */

	public static void main(String[] args) {
		int number;
		int total = 0;
		Scanner scanner = new Scanner(System.in);
		
		/*do {
			System.out.print("Bir sayı giriniz: ");
			number = scanner.nextInt();
			if (number % 2 != 0) {
				total += number;
			}
		} while (number > 0);
		
		System.out.println("Tek Sayıların Toplamı: " + total);*/
		do {
			System.out.print("Bir Sayı Giriniz: ");
			number = scanner.nextInt();
			if(number % 2 == 0 && number % 4 == 0) {
				System.out.println(number);
				total += number; 
			}
		}while(number > 0);
		System.out.println("Sayıların Toplamı: " + total);
	}
}
