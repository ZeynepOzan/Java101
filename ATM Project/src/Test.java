
public class Test {

	public static void main(String[] args) {
		
		ATM atm = new ATM();
		Account account = new Account("Zeynep Ozan","12345",2000);
		
		atm.atmMachine(account);
		System.out.println("Thank you for using this Atm,Bye");
		
		

	}

}
