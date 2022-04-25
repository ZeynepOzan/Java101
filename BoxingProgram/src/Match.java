
public class Match {

	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;

	Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
		this.f1 = f1;
		this.f2 = f2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;

	}

	void run() {
		if (isCheck()) {
			while (this.f1.health > 0 && this.f2.health > 0) {
				System.out.println("=======YENİ ROUND=======");
				if (isFirst1() > isFirst2()) {

					System.out.println(this.f1.name + " ilk vurmaya başladı.");
					this.f2.health = this.f1.hit(this.f2);

					if (isWin()) {
						break;
					}
					System.out.println(this.f1.name + " = " + this.f1.health);
					System.out.println(this.f2.name + " = " + this.f2.health);
				} else {

					System.out.println(this.f2.name + " ilk vurmaya başladı.");
					this.f1.health = this.f2.hit(f1);
					if (isWin()) {
						break;
					}
					System.out.println(this.f1.name + " = " + this.f1.health);
					System.out.println(this.f2.name + " = " + this.f2.health);
				} 
			}
		}else {

			System.out.println("Sporcuların siklekleri uymuyor!");
		}
	}

	boolean isCheck() {
		return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight)
				&& (this.f2.health >= minWeight && this.f2.health <= maxWeight);
	}

	boolean isWin() {
		if (this.f1.health == 0) {
			System.out.println(this.f2.name + " kazandı.");
			return true;
		}
		if (this.f2.health == 0) {
			System.out.println(this.f1.name + " kazandı.");
			return true;
		}
		return false; // her iki durumda sağlanmadığından false döndürür ve maç devam eder.
	}

	double isFirst1() {
		double randomFirst1 = Math.random() * 100;
		return randomFirst1;
	}

	double isFirst2() {
		double randomFirst2 = Math.random() * 100;
		return randomFirst2;
	}
}
