import java.util.Scanner;

public class Average {
	/*
	 * Dersler: Matematik,Fizik,Türkçe,Kimya,Müzik
	 * Geçme Notu:55
	 * Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
	 */

	public static void main(String[] args) {
		int math,physics,literature,chemistry,music;
		int total = 0;
		int count = 0;
		int passNote = 55;
		double average;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Matematik notunu giriniz: ");
		math = scanner.nextInt();
		if(math > 0 && math <100) {
			total +=math;
			count++;
		}else {
			System.out.println("Not 0 ile 100 arasında olmadığından ortalamaya eklenmeyecektir.");
		}
		System.out.print("Fizik notunu giriniz: ");
		physics = scanner.nextInt();
		if(physics >0 && physics <100) {
			total += physics;
			count++;
		}else {
			System.out.println("Not 0 ile 100 arasında olmadığından ortalamaya eklenmeyecektir.");
		}
		System.out.print("Türkçe notunu giriniz: ");
		literature = scanner.nextInt();
		if(literature > 0 && literature < 100) {
			total += literature;
			count++;
		}
		else {
			System.out.println("Not 0 ile 100 arasında olmadığından ortalamaya eklenmeyecektir.");
		}
		System.out.print("Kimya notunu giriniz: ");
		chemistry = scanner.nextInt();
		if(chemistry > 0 && chemistry < 100) {
			total += chemistry;
			count++;
		}
		else {
			System.out.println("Not 0 ile 100 arasında olmadığından ortalamaya eklenmeyecektir.");
		}
		System.out.print("Müzik notunu giriniz: ");
		music = scanner.nextInt();
		if(music > 0 && music < 100) {
			total += music;
			count++;
		}
		else {
			System.out.println("Not 0 ile 100 arasında olmadığından ortalamaya eklenmeyecektir.");
		}
		average = total/count;
		
		if(average > 55) {
			System.out.println("Geçtiniz.");
		}
		else {
			System.out.println("Kaldınız.");
		}
		System.out.println("Ortalama: " + average);
	}
}
