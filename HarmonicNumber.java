import java.util.Scanner;

public class HarmonicNumbers {
	/*
	 * Java ile girilen sayının harmonik serisini bulan program
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("A sayısını giriniz: ");
		int number = scanner.nextInt();
		double harmonic = 0;

		for (int i = 1; i <= number; i++) {
			harmonic += (1.0 / i);
		}
		System.out.println("Harmonik Seri: " + harmonic);

	}

}
