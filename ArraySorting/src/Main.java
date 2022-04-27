import java.util.Scanner;
import java.util.Arrays;

public class Main {
	static void Sorting() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dizinin eleman sayısını giriniz:\t");
		int[] sortingArray = new int[scanner.nextInt()];

		System.out.println("Dizinin elemanlarını giriniz:\t");
		

		for (int i = 0; i < sortingArray.length; i++) {

			System.out.print((i + 1) + ".eleman:\t");
			sortingArray[i] = scanner.nextInt();

		}

		Arrays.sort(sortingArray);
		System.out.println(Arrays.toString(sortingArray));
	}

	public static void main(String[] args) {

		Sorting();

	}

}
