import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
							 
		// Switch-case kullanılarak Atm programı
		Scanner scanner = new Scanner(System.in);
		String userName, password;
		int balance = 2000;
		int select;
		int price;
		int right = 3;

		while (right > 0) {
			System.out.print("Kullanıcı Adınızı Giriniz: ");
			userName = scanner.nextLine();
			System.out.print("Parolanızı Giriniz: ");
			password = scanner.nextLine();
			if (userName.equals("ozanzzeynep") && password.equals("123456")) {
				System.out.println("---------------------");
				System.out.println("BANKAMIZA  HOŞGELDİNİZ!!!!");
				System.out.println("---------------------");
				System.out.println("Yapmak istediğiniz işlemi seçiniz\n" + "1.Para Yatırma\n" + "2.Para Çekme\n"
						+ "3.Bakiye Sorgulama\n" + "4.Çıkış");
				select = scanner.nextInt();
				while (select != 4) {
					System.out.println();
					System.out.println("Yapmak istediğiniz işlemi seçiniz\n" + "1.Para Yatırma\n" + "2.Para Çekme\n"
							+ "3.Bakiye Sorgulama\n" + "4.Çıkış");
					select = scanner.nextInt();
					switch (select) {
					case 1:
						System.out.print("Yatırmak istediğiniz tutar: ");
						price = scanner.nextInt();
						balance += price;
						System.out.println("Güncel Bakiyeniz: " + balance);
						break;
					case 2:
						System.out.print("Çekmek istediğiniz tutar: ");
						price = scanner.nextInt();
						if (price > balance) {
							System.out.println("Yeterli bakiyeniz bulunmamaktadır.");
							System.out.println("Bakiyeniz: " + balance);
						} else {
							balance -= price;
							System.out.println("Güncel Bakiyeniz: " + balance);
						}
						break;
					case 3:
						System.out.println("Güncel Bakiyeniz: " + balance);
						break;
					case 4:
						System.out.println("Çıkış Yapılıyor...");
						break;
					}
				}System.out.println();
				break;

			}
			else {
				right--;
				System.out.println("Hatalı Kullanıcı Adı veya Şifre;!!!\n" + "Lütfen Tekrar Deneyiniz.");
				if (right == 0) {
					System.out
							.println("3 kez yanlış girdiniz.Hesabınız bloke olmuştur.Bankamız ile iletişime geçiniz.");
					break;
				}
				System.out.println("Kalan Hakkınız: " + right);
			}

		}

	}
}