import java.util.ArrayList;

public class PersonMain {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("강호동",45,"010-222-111"));
		list.add(new Person("유재석",40,"010-111-111"));
		
		PersonFuncion p = new PersonFuncion();
		while(true) {
			p.personFunc(list);
		}
	}
}
