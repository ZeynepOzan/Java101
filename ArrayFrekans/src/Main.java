import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		//Dizideki elemanların kaç kez tekrar edildiğini bulan program
		
		int [] list = {-10,45,76,4,-10,-10,76,76,3,3,3,4,4,6,6};
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));
		
		for(int i = 0; i < list.length;i++) {
			int count = 0;
			
			for(int j = 0; j < list.length; j++) {
				if(list[i] == list[j]) {
					count ++;
				}
			}
			System.out.println(" " + list[i] + " sayısı " + count + " kere tekrar edildi.");
			i += count-1;
		}
		
		
		
	}

}
