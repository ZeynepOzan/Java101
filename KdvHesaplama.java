import java.util.Scanner;

public class kdv {
	/* Java ile kullanıcıdan alınan para değerinin KDV'li 
	 * fiyatını ve KDV tutarını hesaplayıp ekrana bastıran 
	 * program yazın.
	 *	Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , 
	 *	tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan program
	 */

	public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				System.out.print("Para değerini giriniz: ");
				double product = sc.nextDouble();
				double kdv = (product < 1000) ? 0.18 : 0.08;
				
				double kdvTutar = product * kdv;
				System.out.println("KDV'siz Fiyatı: " + product + " TLdir.");
				System.out.println("KDV Oranı: " + kdv + " TLdir.");
				System.out.println("KDV Fiyatı: "+ (product + kdvTutar) + " TLdir.");

	}

}
