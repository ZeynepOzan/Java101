import java.util.Scanner;

public class Triangle {
	/*
	 * Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak,
	 * yıldızlar(*) ile ekrana ters üçgen çizen program
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number = input.nextInt();
        int num = 1;
        for (int i = number-1 ; i>0;i--){
            for (int j = 0; j < num;j++)
                System.out.print(" ");
            num += 1;
            for (int k = 0 ;k < (i*2)-1;k++)
                System.out.print("*");
                System.out.println();
        }

	}

}
