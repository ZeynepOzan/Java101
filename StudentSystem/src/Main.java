
public class Main {

	public static void main(String[] args) {
		Teacher t1 = new Teacher("Ali Hoca","TRH","123546");
		Teacher t2 = new Teacher ("Graham Belt", "FZK","0000");
		Teacher t3 = new Teacher("Kül Yutmaz","BIO","1111");
				
		
		Course  tarih = new Course("Tarih","101","TRH");
		tarih.addTeacher(t1);
		
		Course fizik = new Course("Fizik","102","FZK");
		fizik.addTeacher(t2);
		
		Course biyoloji = new Course("Biyoloji","101","BIO");
		biyoloji.addTeacher(t3);
	
		
		
		
		Student s1 = new Student("İnek Şaban","123","4",tarih,fizik,biyoloji,tarih,fizik,biyoloji);
		s1.addBulkExamNote(100,78,50,70,80,60);
		s1.isPass();
		
		Student s2 = new Student("Mehmet","1234","2",tarih,fizik,biyoloji,tarih,fizik,biyoloji);
		s2.addBulkExamNote(50,30,70,30,40,43);
		s2.isPass();
		
	}
}
