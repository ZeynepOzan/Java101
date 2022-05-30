import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Training Program");
		System.out.println("-----------------------------");
		String training = "Training Movements\n" + "1.Burpee\n" + "2.Pushup\n" + "3.Situp\n" + "4.Squat";
		System.out.println(training);
		System.out.println("-----------------------------");
		System.out.println("Create Your Training Program");
		System.out.print("Target Burpee Number: ");
		int burpee = scanner.nextInt();
		System.out.print("Target PushUp Number: ");
		int pushup = scanner.nextInt();
		System.out.print("Target Situp Number: ");
		int situp = scanner.nextInt();
		System.out.print("Target Squat Number: ");
		int squat = scanner.nextInt();
		scanner.nextLine();

		Training t = new Training(burpee, pushup, situp, squat);
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println("Training is starting");
		System.out.println("-----------------------------");
		while (t.isFinish() == false) {
			System.out.println("Movement Type : Burpee,Pushup,Situp,Squat");
					
			System.out.print("Enter Your Movement Type: ");
			String type = scanner.nextLine();
			System.out.println("How many of these movements are you aiming for?");
			int number = scanner.nextInt();
			scanner.nextLine();
			t.move(type, number);
		}
		System.out.println("CONGRATULATIONS!!!");
		System.out.println("You have done your training succesfully");
	}
}
