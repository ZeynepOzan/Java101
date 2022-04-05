import java.util.Scanner;

public class Cash {
	/*Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram
	 * değerlerine göre toplam tutarını ekrana yazdıran program
	 * 
	 * Meyveler ve Kg Fiyatları
	 * 
	 * Armut:2.14 TL
	 * Elma:3.67 TL
	 * Domates:1.11 TL
	 * Muz:0.95 TL
	 * Patlıcan:5,00 TL 
	 */

	public static void main(String[] args) {
		
		double aPrice = 2.14;
		double ePrice = 3.67;
		double dPrice = 1.11;
		double mPrice = 0.95;
		double pPrice = 5.00;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Armut kaç kilogram: ");
		double a = scanner.nextDouble();
		System.out.print("Elma kaç kilogram: ");
		double e = scanner.nextDouble();
		System.out.print("Domates kaç kilogram: ");
		double d = scanner.nextDouble();
		System.out.print("Muz kaç kilogram: ");
		double m = scanner.nextDouble();
		System.out.print("Patlıcan kaç kilogram: ");
		double p = scanner.nextDouble();
		
		double total = (aPrice * a) + (ePrice * e) + (dPrice * d) + (mPrice * m) + (pPrice * p);
		
		System.out.println("Toplam Tutar: " + total);
	}
}
