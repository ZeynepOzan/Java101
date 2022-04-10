
public class Numbers {
	/*
	 * Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran program
	 */

	public static void main(String[] args) {

		int i;
		for (i = 2; i < 100; i++) {
			
			if (i == 2 || i == 3 || i == 5 || i == 7) {
				System.out.println(i + "= Asal sayıdır.");

			}
			if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
				
				
			}
			else{
				System.out.println(i + "= Asal sayıdır.");
			}

		}
		//2. yol
		System.out.println("---------------------");
		
        for(int j = 2; j<100 ;j++){
           boolean isPrime = true;
           for (int n = 2; n <=j/2; n++) {
               if (j % n == 0) {
                    isPrime = false;
                  break;
                }
            }
        if (isPrime){
                System.out.println(j + " Asal Sayıdır.");
            }
        }
	}
}
