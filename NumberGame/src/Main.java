import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		int number = rand.nextInt(100);
		// double number = (int) (Math.random() * 100);

		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int user;
		int[] wrong = new int[5];
		boolean isWin = false;
		System.out.println(number);
		while (count < 5) {
			System.out.print("Tahmininizi giriniz:");
			user = scanner.nextInt();
			if (user < 0 || user > 100) {
				System.out.println("Lütfen 0 ile 100 arasında bir sayı giriniz!!!");
				continue;
			}
			if (user == number) {
				System.out.println("Tebrikler\n" + "Doğru Tahmin :)");
				isWin = true;
				break;
			} else {

				System.out.println("Hatalı Tahmin!!!");
				if (user > number) {
					System.out.println(user + " sayısı gizli sayıdan büyüktür.");
				} else {
					System.out.println(user + " sayısı gizli sayıdan küçüktür.");
				}
				wrong[count++] = user;
				System.out.println("Kalan Hakkınız: " + (5 - count));
			}
		}
		if(isWin == false) {
			System.out.println("Kaybettiniz!!!");
			System.out.println("Tahmin Değerleriniz: " + Arrays.toString(wrong));
		}

	}
}
