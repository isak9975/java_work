package ex02_Oracle;

import java.util.List;

public class EmpMain {
	public static void main(String[] args) {
		
		List<Emp> emp =	EmpMethod.find("MANAGER");
		
		for(Emp find : emp) {
			System.out.printf("사원번호 : %d,이름 : %s,직종 : %s, 월급 : %d",find.getEmpno(),find.getEname(),find.getJob(),find.getSalary());
			System.out.println();
		}
		
		
				
	}
}
