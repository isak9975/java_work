package ex01;

//6번문제
public class Student {
	String name;
	int age;
	int num;
	
	public Student(String name, int age, int num) {
		this.name = name;
		this.age = age;
		this.num = num;	
	}
	
	public void ShowInfo() {
		System.out.printf("학생 이름 : %s, 학생 나이 : %d, 학변 : %d",name,age,num);
	}
}
