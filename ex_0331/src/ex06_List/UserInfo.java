package ex06_List;
//유저의 아이디와 패스워르를 가지는
//UserInfo 클래스를 하나 만든다. 필드는 private
//Main클래스에서 유저의 정보를 
//ArrayList에 추가하여 출력해보자

//--결과--
//아이디 생성 : aaa
//패스워드 입력 : 1234
//aaa
//1234

//-------
//아이디 생성 : bbb
//패스워드 입력 : 5678
//bbb
//5678

public class UserInfo {
	private String id;
	private String pwd;
	
	public void setId(String id) {
		this.id = id;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
}
