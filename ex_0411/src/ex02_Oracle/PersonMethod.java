package ex02_Oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonMethod {
	public static List<Person> find(){
		List<Person> list = new ArrayList<Person>();
		
		Connection conn = null;
		PreparedStatement state = null;
		ResultSet result = null;
		
		try {
			String sql = "select * from person";
			
			conn = DBUtil.getConnection();
			state = conn.prepareStatement(sql);
			result = state.executeQuery();
			
			while(result.next()) {
				Person person = new Person();
				
				person.setIdx(result.getInt("idx"));
				person.setName(result.getString("name"));
				person.setAge(result.getInt("age"));
				
				list.add(person);
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
		
		return list;
	}
	
	//person테이블에 데이터를 추가하는 add메서드
	public static void add(int idx, String name,int age) {
		Connection conn = null;
		PreparedStatement state = null;
		ResultSet result = null;
		
		try {
			String sql = "insert into person(idx,name,age) values (?,?,?)";
			conn = DBUtil.getConnection();
			state = conn.prepareStatement(sql);
			
			state.setInt(1, idx);
			state.setString(2, name);
			state.setInt(3, age);
			
			result = state.executeQuery();
			
//			int done = state.executeUpdate();
//			
//			if(done>0) {
//				System.out.println("추가 성공");
//			}else {
//				System.out.println("추가 실패");
//			}
			
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
