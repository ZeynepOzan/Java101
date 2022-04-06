import java.util.Scanner;

public class Map {
	/*Java ile kullanıcıdan doğum tarihini alıp Çn Zodyağı hesaplayan program yazın
	 * Çin Zodyağı nedir?
	 * 4000 bin yıldır kullanılan bir astroloji çeşididir.Çin astrolojisi ve insanları 12 değişik burç ve sembollerle
	 * tanımlar.Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır
	 * ve yıldızlarla pek br ilgisi yoktur.
	 * Çin Zodyağı nasıl hesaplanır?
	 * Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünden kalana göre bulunur.
	 * Doğum Tarihi % 12 = 0 -> Maymun
	 * Doğum Tarihi % 12 = 1 -> Horoz
	 * Doğum Tarihi % 12 = 2 -> Köpek
	 * Doğum Tarihi % 12 = 3 -> Domuz
	 * Doğum Tarihi % 12 = 4 -> Fare
	 * Doğum Tarihi % 12 = 5 -> Öküz
	 * Doğum Tarihi % 12 = 6 -> Kaplan
	 * Doğum Tarihi % 12 = 7 -> Tavşan
	 * Doğum Tarihi % 12 = 8 -> Ejderha
	 * Doğum Tarihi % 12 = 9 -> Yılan
	 * Doğum Tarihi % 12 = 10 -> At
	 * Doğum Tarihi % 12 = 11 -> Koyun
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("----------------------------");
		System.out.println("ÇİN ZODYAĞI HARİTASI");
		System.out.println("----------------------------");
		System.out.print("Doğum Yılınızı Giriniz: ");
		int year = scanner.nextInt();
		int zodyak = year % 12;
	
		switch(zodyak) {
			case 0:
				System.out.println("MAYMUN");
				break;
			case 1:
				System.out.println("HOROZ");
				break;
			case 2:
				System.out.println("KÖPEK");
				break;
			case 3:
				System.out.println("DOMUZ");
				break;
			case 4:
				System.out.println("FARE");
				break;
			case 5:
				System.out.println("ÖKÜZ");
				break;
			case 6:
				System.out.println("KAPLAN");
				break;
			case 7:
				System.out.println("TAVŞAN");
				break;
			case 8:
				System.out.println("EJDERHA");
				break;
			case 9:
				System.out.println("YILAN");
				break;
			case 10:
				System.out.println("AT");
				break;
			case 11:
				System.out.println("KOYUN");
				break;
		}
	}
}
