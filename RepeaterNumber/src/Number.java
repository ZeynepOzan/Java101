
public class Number {

	public static void main(String[] args) {
		// dizide tekrar eden sayıyı bulma
		int[] number = { 3, 2, 2, 1, 0, 0, -4, -5, 1, -8,-8, -10, 9, -10, 12, 12, 3 };
		int temp = 0;
		System.out.print("[ ");
		for (int i = 0; i < number.length; i++) {
			temp = number[i];
			for (int j = 0; j < number.length; j++) {
				if (i != j && temp == number[j]) {
					if (temp == 0 || temp % 2 == 0) {
						System.out.print(temp + " ");

					}
				}
			}
		}
		System.out.print(" ]");
	}
}
