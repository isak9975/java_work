package exam;

public class StudentMain {
	public static void main(String[] args) {
		Student student = new Student();
		if(student.avr()>=80) {
			System.out.println(student.getName()+" : "+student.avr());
		}
	}
}
