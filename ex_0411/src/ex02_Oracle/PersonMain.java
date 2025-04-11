package ex02_Oracle;

import java.sql.PseudoColumnUsage;
import java.util.List;

public class PersonMain {
	public static void main(String[] args) {
		
		PersonMethod.add(7, "이수근", 50);
		
		List<Person> list = PersonMethod.find();
		
		for(Person p : list) {
			System.out.println(p.getIdx() +". 이름 : "+p.getName() + ", 나이 : " + p.getAge());
		}
		
		
	}
}
