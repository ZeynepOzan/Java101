import java.util.Scanner;

public class Factorial {
	/*
	 * Java ile faktoriyel hesaplayan program 
	 * N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı
	 * grupların sayısı n'in  r'li kombinasyonu olarak adlandırılır.N'in
	 * r'li kombinasyonu C(n,r) şeklinde gösterilir.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*System.out.println("Sayı giriniz: ");
		int number = scanner.nextInt();
		int fact = 1;
		
		for (int i = 1;i <= number; i++) {
			
			fact *= i;
		}
		System.out.println(number + " 'ın Faktoriyeli: " + fact);*/
		//C(n,r) kombinasyonu
		System.out.print("İlk sayıyı giriniz: "); 
		int n = scanner.nextInt();
		System.out.print("İkinci sayıyı giriniz: ");
		int r = scanner.nextInt();
		int nFact = 1;
		int rFact =1;
		int nAndrFact = 1;
		int factorial = 0;
		for(int i = 1; i <= n; i++) {
			nFact *= i;
			
		}for(int k = 1; k <= r; k++) {
			rFact *= k;
		}
		for(int j = 1; j <= (n-r) ;j++) {
			nAndrFact *= j;
		}
		factorial = nFact/(rFact * nAndrFact);
		System.out.println(n + " 'n" + r + " 'li" + " Kombinasyonu: " + factorial);
		
	}
}
