import java.util.Scanner;

public class main {
	/* 1.Dairenin Alanını ve Çevresini hesaplayan program
	 * 
	 * Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini
	 * hesaplayan programı yazın
	 * 
	 * Alan Formülü = π * r * r;
	 * Çevre Formülü = 2 * π * r;
	 * 
	 * 
	 * 2. Yarıçapı r, merkez açısının ölçüsü a olan daire diliminin alanını
	 * bulan programı yazın
	 * 
	 * π sayısı = 3.14;
	 * Formül = (π * (r * r) * a) / 360;
	 * 
	 */

	public static void main(String[] args) {
		
		//Dairenin Alanını ve Çevresini hesaplayan program
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Yarıçapı değerinin giriniz: ");
		
		double pi = 3.14;
		double yarıcap = sc.nextDouble();
		double alan = pi * yarıcap * yarıcap;
		double cevre = 2 * pi * yarıcap;
		
		System.out.println("Yarıçapı " + yarıcap + " olan dairenin alanı: " + alan);
		System.out.println("Yarıçapı " + yarıcap + " olan dairenin çevresi: " + cevre);
		
		//Yarıçapı r, merkez açısının ölçüsü a olan daire diliminin alanını  bulan program
		
		
		System.out.print("Merkez açının değerini giriniz: ");
		double a = sc.nextDouble();
		
		double dilimAlan = (pi  * (yarıcap * yarıcap) * a) / 360;
		System.out.println("Yarıçapı " + yarıcap + " olan dairenin diliminin alanı: " + dilimAlan);
		
	}
}
