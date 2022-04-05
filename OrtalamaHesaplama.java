import java.util.Scanner;

public class main {
	/*Java ile Matematik,Fizik,Kimya,Türkçe,Tarih,Müzik 
	derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını
	hesaplayıp ekrana bastırılan programı yazın.*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Matematik dersinin sınav sonucunu giriniz: ");
		int math = sc.nextInt();
		
		System.out.print("Fizik dersinin sınav sonucunu giriniz: ");
		int phy = sc.nextInt();
		
		System.out.print("Kimya dersinin sınav sonucunu giriniz: ");
		int chm = sc.nextInt();
		
		System.out.print("Türkçe dersinin sınav sonucunu giriniz: ");
		int lec = sc.nextInt();
	
		System.out.print("Tarih dersinin sınav sonucunu giriniz: ");
		int hst = sc.nextInt();
		
		System.out.print("Müzik dersinin sınav sonucunu giriniz: ");
		int msc = sc.nextInt();
		
		double average = (math + phy + chm + lec + hst + msc) / 6 ;
		
		
		int pass = 60;
		
		boolean state = average >= pass;
		
		String grade = state ? "Geçtiniz" : "Kaldınız";
		
		System.out.println("Not Ortalaması: "+ average + " Sonuç: "+ grade);
		
	}

}
