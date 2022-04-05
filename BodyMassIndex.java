import java.util.Scanner;

public class body {
	/* Vücut Kitle İndeksi Hesaplama
	 * Formül = Kilo(kg) / Boy(m) * Boy(m)
	 */
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Kilonuzu giriniz(kg): ");
		double weight = s.nextDouble();
		System.out.print("Boyunuzu giriniz(m): ");
		double height = s.nextDouble();
		
		double massIndex = weight / (height * height);
		
		System.out.println("Vücut Kitle İndeksi: " + massIndex);

	}
}
