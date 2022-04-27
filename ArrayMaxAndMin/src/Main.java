import java.util.Scanner;
import java.util.Arrays;

public class Main {
	static void num(int[] array,int number) {
		
		int [] sArray = Arrays.copyOf(array, array.length);
		Arrays.sort(sArray);
		if(number <= sArray[0] || number >= sArray[sArray.length - 1]) {
			System.out.println("Dizinin değer aralığı içerisinde bir sayı giriniz!!!");
		}
			else {
				int min = sArray[0];
				int max = sArray[array.length-1];
				for(int i : sArray) {
					if(i < number) {
						min = i;
					}
				}
				for(int j = sArray.length - 1; j >= 0; j--) {
					if(sArray[j] > number) {
						max = sArray[j];
					}
				}
				System.out.println("En yakın küçük olan sayı:\t" + min);
				System.out.println("En yakın büyük olan sayı:\t" + max);
			}
		}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayı giriniz:\t");
		int number = scanner.nextInt();
		
		int [] array = {-5,-12,0,12,54,1479,-6};
		num(array,number);
		
		
		
		
		

		
	}
}
