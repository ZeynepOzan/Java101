import java.util.Scanner;

public class Pattern {

	static int patternSum(int temp, int number) {
		
		if (number > 0) {
			System.out.print(number + " ");
			number -= 5;
			return patternSum(temp, number);
		}
		return patternMinus(temp, number);
	}

	static int patternMinus(int temp, int number) {
		System.out.print(number + " ");
		number += 5;

		if (number == temp) {
			return number;
		}
		
		return patternMinus(temp, number);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sayı girin: ");
		int number = scanner.nextInt();
		int temp = number;
		
		if(number > 0) {
			int result = patternSum(temp,number);
			System.out.println(result);
		}
		else {
			int result = patternMinus(temp,number);
			System.out.println(result);
		}
	}
}
