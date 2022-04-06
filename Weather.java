import java.util.Scanner;

public class Weather {
	/*Hava Sıcaklığına göre Etkinlik öneren Program
	 * Koşullar
	 * 
	 * Sıcaklık 5'den küçük ise "Kayak" yapmayı öner
	 * Sıcaklık 5 ve 15 arasında ile "Sinema" etkinliğini öner
	 * Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner
	 * Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Hava sıcaklığını giriniz: ");
		int heat = scanner.nextInt();
		if(heat < 5) {
			System.out.println("Kayak");
		}
		else if(heat >= 5 && heat <= 25) {
			
			if(heat <= 15) {
				System.out.println("Sinema");
			}
			if(heat >= 10) {
				System.out.println("Piknik");
			}
		}
		else {
			System.out.println("Yüzme");
		}
	}
}