import java.util.Scanner;

public class DikÜcgen {
	 /* Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin
	 * alanını hesaplayan programı yazın
	 * 
	 * Üçgenin çevresi : 2u
	 * u = (a+b+c)/2
	 * Alan*Alan = u*(u-kenar1)*(u-kenar2)*(u-kenar3)
	 */

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("1.Kenarın Uzunluğunu giriniz: ");
		double kenar1 = scanner.nextDouble();
		System.out.print("2.Kenarın Uzunluğunu giriniz: ");
		double kenar2 = scanner.nextDouble();
		System.out.print("3.Kenarın Uzunluğunu giriniz: ");
		double kenar3 = scanner.nextDouble();
		
		double u = (kenar1 + kenar2 + kenar3)/2;
		double cevre = 2*u;
		
		double alan = u*(u-kenar1)*(u-kenar2)*(u-kenar3);
		
		System.out.println("Üçgenin Çevresi: " + cevre);
		System.out.println("Üçgenin Alanı: " + alan);
		
	}

}
