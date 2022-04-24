
public class Student {
	Course c1;
	Course c2;
	Course c3;
	Course quiz1;
	Course quiz2;
	Course quiz3;
	String name;
	String stuNo;
	String classes;
	double average;
	boolean isPass;

	Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3,Course quiz1,Course quiz2,Course quiz3) {
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.quiz1 = quiz1;
		this.quiz2 = quiz2;
		this.quiz3 = quiz3;
		this.average = 0.0;
		this.isPass = false;
	}

	void addBulkExamNote(int note1, int note2, int note3,int quiz1,int quiz2,int quiz3) {
		if (note1 >= 0 && note1 <= 100) {
			this.c1.note = note1;
		}
		if (note2 >= 0 && note2 <= 100) {
			this.c2.note = note2;
		}
		if (note3 >= 0 && note3 <= 100) {
			this.c3.note = note3;
		}
		if(quiz1 >= 0 && quiz1 <= 100) {
			this.quiz1.quiz = quiz1;
		}
		if(quiz2 >= 0 && quiz2 <= 100) {
			this.quiz2.quiz = quiz2;
		}
		if(quiz3 >= 0 && quiz3 <= 100) {
			this.quiz3.quiz = quiz3;
		}
	}
	void printNote() {
		
		System.out.println(this.c1.name + " Notu\t:" + this.c1.note + "\n" + "Quiz Notu\t:" + this.quiz1.quiz);
		System.out.println("----------");
		System.out.println(this.c2.name + " Notu\t:" + this.c2.note + "\n" + "Quiz Notu\t:" + this.quiz2.quiz);
		System.out.println("----------");
		System.out.println(this.c3.name + " Notu\t:" + this.c3.note + "\n" + "Quiz Notu\t:" + this.quiz3.quiz);

		System.out.println("Ortalamanız: " + this.average);
	}
	void isPass() {
		System.out.println("===============================");
		this.average = (((this.c1.note * 0.80) + (this.quiz1.quiz * 0.20)) + ((this.c2.note * 0.80) + (this.quiz2.quiz * 0.20))
				+ ((this.c3.note * 0.80) + (this.quiz3.quiz * 0.20))) / 3.0;
		if (this.average > 50) {
			
			System.out.println("Sınıfı başarılı bir şekilde geçtiniz.");
			this.isPass = true;
		} else {
			System.out.println("Kaldınız.");
			this.isPass = false;
		}
		printNote();
	}

}
