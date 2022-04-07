import java.util.Scanner;

public class Numbers {
	/*
	 * 1.Java döngüler ile girilen sayıya kadar olan 2'li kuvvetlerini ekrana
	 * yazdıran programı yazınız. 
	 * 2.Girilen sayıya kadar olan 4 ve 5'in kuvvetlerini
	 * ekrana yazdıran program
	 * 
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Sınır değerini giriniz: ");
		int number = scanner.nextInt();
		/*int t = 2;
		while (t < number) {
			System.out.println(t);
			t *= 2;
		}*/
		int t = 1;
		while(t < number) {
			if(t % 4 == 0 || t % 5 == 0) {
				System.out.println("t: " + t);
			}
			t++;
			
		}
	}
}
