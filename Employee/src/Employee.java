
public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;

	Employee(String name, int salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	double tax() {
		if (this.salary < 1000) {
			return 0;
		}
		return this.salary * 0.03;
	}

	double bonus() {
		if (this.workHours > 40) {

			return (this.workHours - 40) * 30;
		}
		return 0;
	}

	double raiseSalary() {
		if (2021 - this.hireYear < 10) {
			return (this.salary * 0.05);
		}
		if ((2021 - this.hireYear) > 9 && (2021 - this.hireYear) < 20) {
			return (this.salary * 0.10);
		}
		return this.salary * 0.15;
	}

	double result() {
		return bonus() + tax() + this.salary;
	}

	void tooString() {
		System.out.println("------------------------");
		System.out.println("Adı:\t" + this.name);
		System.out.println("Maaşı:\t" + this.salary);
		System.out.println("Çalışma Saati:\t" + this.workHours);
		System.out.println("Başlangıç Yılı:\t" + this.hireYear);
		System.out.println("Vergi:\t" + tax());
		System.out.println("Bonus:\t" + bonus());
		System.out.println("Maaş Artışı:\t" + raiseSalary());
		System.out.println("Vergi ve Bonuslar ile birlikte maaş:\t" + result());
		System.out.println("Toplam Maaş:\t" + (result() + raiseSalary()));
	}

}
