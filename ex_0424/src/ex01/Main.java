package ex01;

public class Main {
	public static void main(String[] args) {
		Exam exam = new Exam();
		//5번문제
		int[] f_arr = {3,2,5,7,9,4,2,1,6,8};
		System.out.println("5문제 답 : "+exam.findmax(f_arr));
		System.out.println("==================================================");
		
		
		//6번문제
		Student student = new Student("유재석", 30, 1916602);
		System.out.print("6번문제 답 : ");
		student.ShowInfo();
		System.out.println();
		System.out.println("==================================================");
		
		//10번문제
		System.out.println("---10번 문제 답---");
		Box<String> box1 = new Box<String>();
		box1.set("안녕하세요");
		System.out.println(box1.get());
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(12345);
		System.out.println(box2.get());
		
		Box<Double> box3 = new Box<Double>();
		box3.set(3.14);
		System.out.println(box3.get());
				
	}
}


