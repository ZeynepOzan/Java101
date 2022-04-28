import java.util.Arrays;

public class Transpose {
	static int[][] aTranspose(int[][] matris) {
		int[][] transpose = new int[matris[0].length][matris.length];

		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				transpose[j][i] = matris[i][j];
			}

		}
		return transpose;
	}

	public static void main(String[] args) {
		int[][] matris1 = { { 1, 2 }, { 5, 6 }, { 3, 4 } };
		int[][] matris2 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

		System.out.println(Arrays.deepToString(aTranspose(matris1)));
		System.out.println("*******************");
		System.out.println(Arrays.deepToString(aTranspose(matris2)));

	}

}
