import java.util.Scanner;

public class Horoscope {
	/*
	 * Koç Burcu: 21 Mart - 20 Nisan
	 * Boğa Burcu: 21 Nisan - 21 Mayıs
	 * İkizler Burcu: 22 Mayıs - 22 Haziran
	 * Yengeç Burcu: 23 Haziran - 22 Temmuz
	 * Aslan Burcu: 23 Temmuz - 22 Ağustos
	 * Başak Burcu: 23 Ağustos - 22 Eylül
	 * Terazi Burcu: 23 Eylül - 22 Ekim
	 * Akrep Burcu: 23 Ekim - 21 Kasım
	 * Yay Burcu: 22 Kasım - 21 Aralık
	 * Oğlak Burcu: 22 Aralık - 21 Ocak
	 * Kova Burcu: 22 Ocak - 19 Şubat
	 * Balık Burcu: 20 Şubat -20 Mart
	 */

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Doğduğunuz Ay:");
		String month = scanner.nextLine();
		System.out.print("Doğduğunuz Gün:");
		int day = scanner.nextInt();
		/*Switch-Case yapısıyla
		switch(month) {
		case "Ocak":
			if(day >= 1 && day <= 21) {
				System.out.println("Oğlak Burcu");
			}
			else {
				System.out.println("Kova Burcu");
			}break;
		case "Şubat":
			if(day >= 1 && day <= 19) {
				System.out.println("Kova Burcu");
			}
			else {
				System.out.println("Balık Burcu");
			}break;
		case "Mart":
			if(day >= 1 && day <= 20) {
				System.out.println("Balık Burcu");
			}
			else {
				System.out.println("Koç Burcu");
			}break;
		case "Nisan":
			if(day >=1 && day <= 20) {
				System.out.println("Koç Burcu");
			}
			else {
				System.out.println("Boğa Burcu");
			}break;
		case "Mayıs":
			if(day >= 1 && day <= 21) {
				System.out.println("Boğa Burcu");
			}
			else {
				System.out.println("İkizler Burcu");
			}break;
		case "Haziran":
			if(day >= 1 && day <=22) {
				System.out.println("İkizler Burcu");
			}
			else {
				System.out.println("Yengeç Burcu");
			}break;
		case "Temmuz":
			if(day >= 1 && day <=23) {
				System.out.println("Yengeç Burcu");
			}
			else {
				System.out.println("Aslan Burcu");
			}break;
		case "Ağustos":
			if(day >= 1 && day <= 23) {
				System.out.println("Aslan Burcu");
			}
			else {
				System.out.println("Başak Burcu");
			}break;
		case "Eylül":
			if(day >= 1 && day <= 22) {
				System.out.println("Başak Burcu");
			}
			else {
				System.out.println("Terazi Burcu");
			}break;
		case "Ekim":
			if(day >= 1 && day <= 22) {
				System.out.println("Terazi Burcu");
			}
			else {
				System.out.println("Akrep Burcu");
			}break;
		case "Kasım":
			if(day >= 1 && day <= 21) {
				System.out.println("Akrep Burcu");
			}
			else {
				System.out.println("Yay Burcu");
			}break;
		case "Aralık":
			if(day >= 1 && day <= 21) {
				System.out.println("Yay Burcu");
			}
			else {
				System.out.println("Oğlak Burcu");
			}break;
		}*/
		//If/else yapısıyla
		if(month.equals("Ocak")) {
			if(day >= 1 && day <= 21) {
				System.out.println("Oğlak Burcu");
			}
			else {
				System.out.println("Kova Burcu");
			}
		}
		if(month.equals("Şubat")) {
			if(day >= 1 && day <= 19) {
				System.out.println("Kova Burcu");
			}
			else {
				System.out.println("Balık Burcu");
			}
		}
		if(month.equals("Mart")) {
			if(day >= 1 && day <= 20) {
				System.out.println("Balık Burcu");
			}
			else {
				System.out.println("Koç Burcu");
			}
		}
		if(month.equals("Nisan")) {
			if(day >=1 && day <= 20) {
				System.out.println("Koç Burcu");
			}
			else {
				System.out.println("Boğa Burcu");
			}
		}
		if(month.equals("Mayıs")){
			if(day >= 1 && day <= 21) {
				System.out.println("Boğa Burcu");
			}
			else {
				System.out.println("İkizler Burcu");
			}
		}
		if(month.equals("Haziran")) {
			if(day >= 1 && day <=22) {
				System.out.println("İkizler Burcu");
			}
			else {
				System.out.println("Yengeç Burcu");
			}
		}
		if(month.equals("Temmuz")) {
			if(day >= 1 && day <=23) {
				System.out.println("Yengeç Burcu");
			}
			else {
				System.out.println("Aslan Burcu");
			}
		}
		if(month.equals("Ağustos")) {
			if(day >= 1 && day <= 23) {
				System.out.println("Aslan Burcu");
			}
			else {
				System.out.println("Başak Burcu");
			}
		}
		if(month.equals("Eylül")) {
			if(day >= 1 && day <= 22) {
				System.out.println("Başak Burcu");
			}
			else {
				System.out.println("Terazi Burcu");
			}
		}
		if(month.equals("Ekim")) {
			if(day >= 1 && day <= 22) {
				System.out.println("Terazi Burcu");
			}
			else {
				System.out.println("Akrep Burcu");
			}
		}
		if(month.equals("Kasım")) {
			if(day >= 1 && day <= 21) {
				System.out.println("Akrep Burcu");
			}
			else {
				System.out.println("Yay Burcu");
			}
		}
		if(month.equals("Aralık")) {
			if(day >= 1 && day <= 21) {
				System.out.println("Yay Burcu");
			}
			else {
				System.out.println("Oğlak Burcu");
			}
		}
	}
}
