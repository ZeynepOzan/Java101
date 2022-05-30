
public class Training {
	private int burpee;
	private int pushUp;
	private int sitUp;
	private int squat;

	public Training(int burpee, int pushup, int situp, int squat) {

		this.burpee = burpee;
		this.pushUp = pushup;
		this.sitUp = situp;
		this.squat = squat;

	}

	public int getBurpee() {
		return burpee;
	}

	public void setBurpee(int burpee) {
		this.burpee = burpee;
	}

	public int getPushup() {
		return pushUp;
	}

	public void setPushup(int pushup) {
		this.pushUp = pushup;
	}

	public int getSitup() {
		return sitUp;
	}

	public void setSitup(int situp) {
		this.sitUp = situp;
	}

	public int getSquat() {
		return squat;
	}

	public void setSquat(int squat) {
		this.squat = squat;
	}

	public void move(String moveType, int number) {
		if (moveType.equalsIgnoreCase("Burpee")) {

			doBurpee(number);
		} else if (moveType.equalsIgnoreCase("Pushup")) {
			doPushup(number);

		} else if (moveType.equalsIgnoreCase("Situp")) {
			doSitup(number);
		} else if (moveType.equalsIgnoreCase("Squat")) {
			doSquat(number);
		} else {
			System.out.println("Invalid Movement");
		}
	}

	public void doBurpee(int number) {
		if (burpee == 0) {
			System.out.println("You have no more burpees to do.");
		}
		if (burpee - number < 0) {
			System.out.println("You've exceeded your target number of burpee\n" + "Congratulations!");
			burpee = 0;
			System.out.println("Remainder Burpee: " + burpee);

		} else {
			burpee -= number;
			System.out.println("Remainder Burpee: " + burpee);
		}
	}

	public void doPushup(int number) {
		if (pushUp == 0) {
			System.out.println("You have no more pushup to do.");
		}
		if (pushUp - number < 0) {
			System.out.println("You've exceeded your target number of pushup\n" + "Congratulations!");
			pushUp = 0;
			System.out.println("Remainder pushup: " + pushUp);

		} else {
			pushUp -= number;
			System.out.println("Remainder pushup: " + pushUp);
		}
	}

	public void doSitup(int number) {
		if (sitUp == 0) {
			System.out.println("You have no more situp to do.");
		}
		if (sitUp - number < 0) {
			System.out.println("You've exceeded your target number of situp\n" + "Congratulations!");
			sitUp = 0;
			System.out.println("Remainder situp: " + sitUp);

		} else {
			sitUp -= number;
			System.out.println("Remainder situp: " + sitUp);
		}
	}

	public void doSquat(int number) {
		if (squat == 0) {
			System.out.println("You have no more squat to do.");
		}
		if (squat - number < 0) {
			System.out.println("You've exceeded your target number of squat\n" + "Congratulations!");
			squat = 0;
			System.out.println("Remainder pushup: " + squat);

		} else {
			squat -= number;
			System.out.println("Remainder squat: " + squat);
		}
	}

	public boolean isFinish() {

		return (burpee == 0) && (pushUp == 0) && (sitUp == 0) && (squat == 0);
	}
	

}
