
public class Average {
	/*
	 * 1- Dizideki elemanların ortalamasını bulma 
	 * 2- Dizideki sayıların harmonik ortalamasını hesaplayan program
	 */

	public static void main(String[] args) {
		int [] list = {15,6,7,12,7,9,3};
		
		double sum = 0.0;
		for(int i = 0; i< list.length; i++){
			
			sum+= list[i];
		}
		
		
		double average = sum/list.length;
		System.out.println("Dizinin Ortalaması:\t" + average);
		
		
		double harmonic = 0.0;
		double sum2 = 1.0;
		for(int i = 0; i < list.length ; i++) {
			
			sum += 1 / list[i];
		}
		
		harmonic = list.length / sum;
		System.out.println("Harmonik Ortalama:\t" + harmonic);

	}

}
