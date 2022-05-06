import java.util.Random;
import java.util.Scanner;

public class Minesweeper {
	int row;
	int column;
	String test[][];
	String game[][];

	Minesweeper(int row, int column) {
		this.row = row;
		this.column = column;
		mineScreen();
	}

	public void mineScreen() {

		int mine = (row * column) / 4;
		Random rand = new Random();

		game = new String[row][column];
		while (mine > 0) {

			int randRow = rand.nextInt(row);
			int randColumn = rand.nextInt(column);
			if (game[randRow][randColumn] == null) {
				game[randRow][randColumn] = "*";
				mine--;
			}
		}
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[i].length; j++) {
				if (game[i][j] != "*") {
					game[i][j] = "-";
				}
			}
		}

		test = new String[row][column];
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				test[i][j] = "-";
			}
		}
	}

	public void gameScreen() {

		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				System.out.print(" " + test[i][j]);
			}
			System.out.println();
		}

	}

	boolean userCheck(int x, int y) {
		return (x >= 0 && y >= 0) && (x < row && y < row);
	}

	int mineControl(int x, int y) {
		int count = 0;
		if (x - 1 > 0 && y - 1 >= 0) {
			if (game[x - 1][y - 1].equals("*")) {
				count++;
			}
		}
		if (y - 1 >= 0) {
			if (game[x][y - 1].equals("*")) {
				count++;
			}
		}
		if (x < row - 1 && y - 1 >= 0) {
			if (game[x + 1][y - 1].equals("*")) {
				count++;
			}
		}
		if (x - 1 >= 0) {
			if (game[x - 1][y].equals("*")) {
				count++;
			}
		}
		if (x < row - 1) {
			if (game[x + 1][y].equals("*")) {
				count++;
			}
		}
		if (x - 1 >= 0 && y < column - 1) {
			if (game[x - 1][y + 1].equals("*")) {
				count++;
			}
		}
		if (y < column - 1) {
			if (game[x][y + 1].equals("*")) {
				count++;
			}
		}
		if (x < row - 1 && y < column - 1) {
			if (game[x + 1][y + 1].equals("*")) {
				count++;
			}
		}
		return count;
	}

	boolean isWin() {

		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[i].length; j++) {
				if (!(game[i][j].equals("*"))) {
					if (game[i][j].equals(test[i][j])) {
						return false;
					}
				}
			}
		}
		return true;
	}

	boolean mineCheck(int x, int y) {

		return game[x][y].equals("*");
	}

	public void run() {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[i].length; j++) {
				System.out.print(" " + game[i][j]);
			}
			System.out.println();
		}
		System.out.println("==================");
		System.out.println("MAYIN TARLASI OYUNU");
		System.out.println("==================");

		while (true) {
			gameScreen();
			System.out.print("Satır Giriniz: ");
			int userRow = scanner.nextInt();
			System.out.print("Sütun Giriniz: ");
			int userColumn = scanner.nextInt();
			if (!(userCheck(userRow, userColumn))) {
				System.out.println("Yanlış koordinat girdiniz!!!");
				continue;
			}
			if (mineCheck(userRow, userColumn)) {
				System.out.println("OYUNU KAYBETTİNİZ!!!");
				break;
			}
			test[userRow][userColumn] = String.valueOf(mineControl(userRow, userColumn));
			if (isWin()) {
				System.out.println("OYUNU KAZANDINIZ!!!");
				break;
			}
		}
	}

}
