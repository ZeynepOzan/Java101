import java.util.Scanner;

public class Numbers {
	/* 1.Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan program
	 * 2.Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen
	 * sayıların ortalamasını hesaplayan program 
	 */

	public static void main(String[] args) {
		int number;
		double total = 0;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		number = scanner.nextInt();
		
		/*for(int i = 0; i < number ; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}*/
		for(int i = 0; i < number; i++) {
			if(i % 3 == 0 || i % 4 == 0) {
				total += i;
				count++;
				System.out.println(i);
			}
		
		}System.out.println("Sayıların Ortalaması: " + (total/count));
	}
}
