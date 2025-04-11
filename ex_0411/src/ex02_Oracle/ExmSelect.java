package ex02_Oracle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExmSelect {
	public static void main(String[] args) {
		Connection conn = null;
		Statement state = null;
		ResultSet result = null;
		
		try {
			conn = DBUtil.getConnection();
			state = conn.createStatement();
			result = state.executeQuery("select*from emp where sal>1000");
			
			
			while(result.next()) {
				int empno = result.getInt("empno");
				String ename = result.getString("ename");
				String job = result.getString("job");
				int salary = result.getInt("sal");
				
				
				System.out.println("번호 : "+empno+", 이름 : "+ ename +", 직업 : "+ job+", 연봉 : " +salary);
				
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if(result!=null) {
					result.close();
				}
				if(state!=null) {
					state.close();
				}
				if(conn!=null) {
					conn.close();
				}
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
