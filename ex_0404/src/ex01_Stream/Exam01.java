package ex01_Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

class Student{
	private String name;
	private int score;
	
	public void setName(String name) {
		this.name = name;
	}public void setScore(int score) {
		this.score = score;
	}public String getName() {
		return name;
	}public int getScore() {
		return score;
	}
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	
	
	
}


public class Exam01 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		//짝수만 출력하기
		numbers.stream().filter(x -> x%2==0).forEach(System.out::println);
		
		List<String> names = Arrays.asList("kim chulsoo", "lee younghee", "park minsue", "kim younghee", "choi gildong");
		//kim으로 시작하는 이름만 골라서 대문자로 변환하고
		//알파벳순으로 정렬하여 출력하는 코드 작성하기.
		names.stream().filter(t->t.startsWith("kim")).map(t -> t.toUpperCase()
		).forEach(System.out::println);
		
		List<String> numList = Arrays.asList("1","2","3","4","5","6");
		//짝수의 제곱값만 모아서 리스트로 반환하기
		List<Integer> str= numList.stream().map(Integer::parseInt).filter(x -> x%2==0).map(n->n*n).collect(Collectors.toList());
		
		
		
	      List<Student> students = Arrays.asList(
	              new Student("Alice", 85),
	              new Student("Bob", 92),
	              new Student("Charlie", 78)
	          );
	      //점수가 가장 높은 학생의 이름 출력하기.
		
	      //ifPresent()
	      //Optional 클래스에서 제공하는 메서드로
	      //값이 존재할 경우에만 어떤 동작을 수행하고 싶을 때 사용하는 메서드
	      //Optional 안에 값이 있으면 Consumer<T>를 실행하고
	      //값이 없으면 아무 일도 하지 않는다.
	      students.stream().max(Comparator.comparing(Student::getScore)).ifPresent(t->System.out.println(t.getName()));
	      
	      
	      //orElse(default)
	      //값이 없으면 기본값을 반환
	      
	      //ifPresentOrElse(value,default)
	      //값이 있으면 value, 값이 없으면 
	      
	      
	      
	      System.out.println("====================");
	      Optional<Student> si = students.stream().max((o1, o2) -> o1.getScore()-o2.getScore());
		
		System.out.println(students.stream().sorted((o1, o2) -> o1.getScore()-o2.getScore()).collect(Collectors.toList()).get(2).getName());
		
		System.out.println(si.get().getName());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}
