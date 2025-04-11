package ex02_Oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpMethod {
	
	static public List<Emp> find(String job){
		List<Emp> list = new ArrayList<Emp>();
		//EMP 테이블에서 사원번호(Empno), 이름(ename), 직종(job), 급여(sal) 
		//을 조회해서 하나의 행을 Emp 객체에 넣은 후 그 객체들을 ArrayList에 담아서 반환하기
		
		Connection conn = null;
		PreparedStatement state = null;
		ResultSet result = null;
		
		String sql = "select empno, ename,job,sal from emp where job= ?";
		
		try {
			conn = DBUtil.getConnection();
			state = conn.prepareStatement(sql);
			
			state.setString(1, job);
			
			result = state.executeQuery();
			
			while(result.next()) {
				Emp emp = new Emp();
				
				emp.setEmpno(result.getInt("empno"));
				emp.setEname(result.getString("ename"));
				emp.setJob(result.getString("job"));
				emp.setSalary(result.getInt("sal"));
				
				list.add(emp);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if(result!=null) {
					result.close();
				}
				if(state!= null) {
					state.close();
				}
				if(conn!=null) {
					conn.close();
				}
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
		return list;
	}
	
	
}
