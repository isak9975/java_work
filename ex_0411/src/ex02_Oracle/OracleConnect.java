package ex02_Oracle;

import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleConnect {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		//jdbc : 자바db연결
		//oracle : 오라클db를 의미
		//thin : 오라클에서 제공하는 경량 드라이버
		//localhost : db기본 주소(자기 컴퓨터)
		//1521 : 기본 포트
		//xe : 오라클 SID
		String user = "hr"; //아이디
		String password = "hr"; //비밀번호
		
		Connection conn = null;
		Statement state = null;
		ResultSet result = null;
		try {
			//conn : db 연결을 생성
			conn = DriverManager.getConnection(url, user, password);
			
			//문자열 형태의 SQL을 실제로 오라클로 전달해서 실행을 하기 위한 객체
			state = conn.createStatement();
			
			//executeQuery() : SQL을 실행한 결과를 ResultSet타입으로 받는다.
			result = state.executeQuery("Select*from emp");
			System.out.println("Oracle DB연결 성공");
			
			//조회된 데이터를 콘솔에 출력을 해보자.
			//next() : 다음에 읽어올 행이 있으면 true
			while(result.next()) {			
				System.out.println(result.getInt("empno")+" : "+result.getString("ename"));
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
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
	}//end main
}//class
