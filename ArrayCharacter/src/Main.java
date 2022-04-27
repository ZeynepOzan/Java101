
public class Main {

	public static void main(String[] args) {
		// A harfi yazma
		String[][] a = new String[6][4];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == 0 || i == 2) {
					System.out.print(" * ");
				} else if (j == 0 || j == 3) {
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();

		}
		System.out.println("=====================");
		//B harfi yazma
		
		String [][] b = new String [7][3];
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length;j++) {
				if(i == 0 || i == 3 || i == 6) {
					System.out.print(" * ");
				}
				else if(j == 0 || j == 2) {
					System.out.print(" * ");
				}
				else {
					System.out.print("    ");
				}
			}
			System.out.println();
		}
		System.out.println("=====================");
		// C harfi 
		String [][] c = new String [6][3];
		
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c[i].length; j++) {
				if(i == 0 || i == 5) {
					System.out.print(" * ");
				}
				else if(j == 0) {
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println("=====================");
		// D harfi
		String [][] d = new String [6][3];
		for(int i = 0; i < d.length; i++) {
			for(int j = 0; j < d[i].length; j++) {
				if(i == 0 || i == 5) {
					System.out.print(" * ");
				}
				else if(j == 0 || j == 2) {
					System.out.print(" * ");
				}
				else {
					System.out.print("    ");
				}
			}
			System.out.println();
		}
	
	}

}
