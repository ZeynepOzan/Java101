import java.util.Scanner;

public class Ticket {
	/*
	 * Uçak Bileti Fiyatı Hesaplama Java ile mesafeye ve şartlara göre uçak bileti
	 * fiyatı hesaplayan program Kullanıcıdan mesafe(Km),yaşı ve yolculuk tipi(Tek
	 * Yön,Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0.10 TL/km olarak
	 * alın.İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara
	 * göre müşteriye aşağıdaki indirimleri uygulayın.
	 * 
	 * - Kullanıcıdan alınan değerler geçerli(mesafe ve yaş değerleri pozitif
	 * sayı,yolculuk tipi ise 1 veya 2) olmalıdır.Aksi takdirde kullanıcıya
	 * "Hatalı Veri Girdiniz!" şeklinde bir uyarı verilmelidir.
	 * 
	 * - Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır
	 * 
	 * - Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim
	 * uygulanır.
	 * 
	 * - Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır
	 * 
	 * - Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20
	 * indirim uygulanır
	 */

	public static void main(String[] args) {
		double distance;
		int age;
		String typeOfTrip;
		double discount = 0;

		double total = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Gitmek istediğiniz uzaklık kaç km'dir: ");
		distance = scanner.nextDouble();

		System.out.print("Yaşınızı giriniz: ");
		age = scanner.nextInt();
		scanner.nextLine();

		if (distance > 0 && age > 0) {
			System.out.print("Yolculuk tipini seçiniz" + "(Tek Yön/Çift Yön):");
			typeOfTrip = scanner.nextLine();

			if (typeOfTrip.equals("Tek Yön") || typeOfTrip.equals("Çift Yön")) {
				switch (typeOfTrip) {
				case ("Tek Yön"):
					total = 0.10 * distance;
					System.out.println("Tek Yön Uçuş Fiyatı: " + total);

					break;
				case ("Çift Yön"):
					total = 2 * (0.10 * distance);
					System.out.println("Çift Yön Uçuş Fiyatı: " + total);
					break;
				}
				if (age < 12) {
					discount = (total * 0.5);
					total -= discount;
					System.out.println("12 yaş altı Çocuk İndirim Tutarı: " + discount);
					System.out.println("İndirimli Bilet Fiyatı: " + total);
				} else if (age > 12 && age < 24) {
					discount = (total * 0.1);
					total -= discount;
					System.out.println("12-24 yaş arası Öğrenci indirim Tutarı: " + discount);
					System.out.println("İndirimli Bilet Fiyatı: " + total);
				} else if (age >= 65) {
					discount = (total * 0.3);
					total -= discount;
					System.out.println("65 yaş üstü İndrim Tutarı: " + discount);
					System.out.println("İndirimli Bilet Fiyatı: " + total);
				} else if (typeOfTrip.equals("Çift Yön")) {
					discount = total * 0.2;
					total -= discount;
					System.out.println("Gidiş Dönüş İndirim Tutarı: " + discount);
					System.out.println("İndirimli Bilet Fiyatı: " + total);
				} else {
					System.out.println("Herhangi bir indirim uygulanmamıştır.Bilet Fiyatı:" + total);
				}
			}

		} else {
			System.out.println("Hatalı veri girdiniz.");
		}

	}
}
