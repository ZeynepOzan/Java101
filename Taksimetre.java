import java.util.Scanner;

public class TaksimetreHesaplama {
	/*TAKSİMETRE PROGRAMI
	 * Java ile gidilen mesafeye(KM) göre taksimetre tutarını ekrana yazdıran programı yazın
	 * 
	 * Taksimetre KM başına 2.20 TL tutmaktadır
	 * Minimum ödenecek tutar 20 TL'dir.20 TL altındaki ücretlerde yine 20 TL alınacaktır
	 * Taksimetre açılış ücreti 10 TL'dir.
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner taxi = new Scanner(System.in);
		System.out.print("Gidilen mesafeyi giriniz(KM):");
		int way = taxi.nextInt();
		int startprice = 10;
		
		double total = (way * (2.20));
		total += startprice;
		
		double price = (total < 20) ? 20 : total;
		
		System.out.println(way + "Km Mesafe Ücreti: " + price + " TL'dir.");

	}
}