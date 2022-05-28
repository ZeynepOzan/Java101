import java.util.Scanner;

public class ATM {

	public void atmMachine(Account account) {

		Login login = new Login();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the ATM Project");
		System.out.println();
		System.out.println("**************************");

		int entree = 3;

		while (true) {
			if (login.login(account)) {
				System.out.println("Correct Customer Name and Password");
				break;
			} else {
				System.out.println("Wrong Customer Number or Pin Number");
				entree--;
				System.out.println("Entree: " + entree);
			}
			if (entree == 0) {
				System.out.println("Entree: " + entree);
				return; // Döngüyü sonlandırmak için return kullandık
			}

		}
		System.out.println("**********************");
		String operations = "1 - View Balance\n" + "2 - Deposit Funds\n" + "3 - Withdraw Funds\n" + "4 - Exit";
		System.out.println(operations);
		System.out.println("**********************");

		while (true) {
			System.out.print("Choise: ");
			String selection = scanner.nextLine();

			if (selection.equals("4")) {
				break;
			} else if (selection.equals("1")) {
				System.out.println("Your Balance: " + account.getBalance());

			} else if (selection.equals("2")) {
				System.out.print("Amount you want to deposit from account: ");
				int amount = scanner.nextInt();
				scanner.nextLine();
				account.deposit(amount);
			} else if (selection.equals("3")) {
				System.out.print("Amount you want to withdraw from account: ");
				int amount = scanner.nextInt();
				scanner.nextLine();
				account.withDraw(amount);
			}
			else {
				System.out.println("Invalid Choise!!");
			}

		}

	}

}
