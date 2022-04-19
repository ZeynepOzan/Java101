import java.util.Scanner;

public class Fibonacci {
	/*
	 * Java döngüler ile fibonacci serisi bulan program 
	 * 0 1 1 2 3 5 8 13 21 34 55 89 
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Fibonacci serinin eleman sayısını giriniz: ");
		int n = scanner.nextInt();

		int n1 = 0, n2 = 1;
		int n3 = n1 + n2;
		System.out.print(n1 + " " + n2);

		for (int i = 0; i <= 20; i++) {

			n1 = n2;
			n2 = n3;
			n3 = n1 + n2;
			System.out.print(" " + n3);

		}

	}
}
