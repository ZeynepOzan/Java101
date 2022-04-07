
public class Stars {
	/*
	 * Javada döngüleri kullanarak yıldız oluşurma
	 *Yıldızlar ile elmas
	 
	 */

	public static void main(String[] args) {
		/*for(int i = 0;i < 9; i++) {
			for(int j = i; j < 9; j++) {
				System.out.print(" ");
				}for(int k=0; k <= i; k++) {
					System.out.print(" *");
			}System.out.println();
		}*/
		int n=9;
		 for (int i = 0; i < n; i++) {
	            for (int j = 1; j < (n - i); j++) {
	                System.out.print(" ");
	            }
	            for (int k = 0; k < (i * 2 + 1); k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        for (int i = n; i > 1; i--) {
	            for (int l = 1; l < (n - i + 2); l++) {
	                System.out.print(" ");
	            }
	            for (int m = 0; m < (i * 2 - 3); m++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	}
}
