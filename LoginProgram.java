import java.util.Scanner;

public class LoginProgram {
	/*
	 * Kullanıcıdan alınan şifre yalnış ise kullanıcıya şifresini sıfırlayıp
	 * sıfırlamayacağını sorun,eğer kullanıcı sıfırlamak isterse yeni girdiği 
	 * şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini
	 * kontrol edip, şifreler  aynı ise ekrana "Şifre oluşturulamadı,lütfen başka
	 * şifre giriniz" sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
	 */
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String userName,password;
		userName = "ozanzzeynep";
		password = "Java101";
		System.out.print("Kullanıcı Adını Giriniz:");
		String user = input.nextLine();
		System.out.print("Şifrenizi Giriniz:");
		String userpassword = input.nextLine();
		
		if((userName.equals(user)) && (password.equals(userpassword))) {
			System.out.println("Giriş Yapıldı");
		}
		else if(!(userName.equals(user)) || !(password.equals(userpassword))) {
			System.out.println("Yalnış sifre!!!\n"
					+ "Şifrenizi yenilemek ister misiniz?\n"
					+ "Evet ise 1'e basın\n"
					+ "Hayır ise herhangi bir tuşa basın");
			
			int response = input.nextInt();
			input.nextLine();
			
			if(response == 1) {
				System.out.print("Yeni şifrenizi giriniz:");
				
				String newPassword = input.nextLine();
				
				if(newPassword.equals("Java101")) {
					System.out.println("Yeni şifreniz eski şifreniz ile aynı olamaz.\n"
							+ "Şifre oluşturulamadı.Lütfen başka bir şifre giriniz.");
					
				}else {
					System.out.println("Şifre oluşturuldu.");	
				}
			}else {
				System.out.println("Çıkış yapıldı.");
			}
		}
	}
}
