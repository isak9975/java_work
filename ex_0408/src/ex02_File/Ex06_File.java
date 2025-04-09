package ex02_File;

import java.io.File;
import java.io.IOException;

public class Ex06_File {
//	String path = "D:\\kimisak\\java\\java_work";
	
	public static void main(String[] args) {
		
		File f = new File("test.txt"); //경로를 설정
		
		try {
			//파일이 존재하지 않으면 새로 생성
			if(f.createNewFile()) {
				//파일 이름만 설정하게 된다면 기본적으로 프로젝트 내부로 설정이 된다.
				System.out.println("파일이 생성되었습니다. : "+f.getName());
				System.out.println(f.getAbsolutePath());
			}else {
				System.out.println("이미 파일이 존재합니다.");
			}
			
		} catch (IOException e) {e.printStackTrace();}
	}
	//파일/폴더의 생성이나 삭제까지는 가능하지만
	//내용을 읽거나 쓰는것을 불가능하다
	
	//입출력스트림
	//바이크 기반의 스트림 :  byte 단위로 읽어온다
	//이미지, 음성, 영상은 byte로 이루어진 데이터라서, 문자 인코딩을 적용하면
	//데이터가 손상될 수 있다
	
	//문자 기반의 스트림
	//문자를 처리하도록 설계가 되었고, 내부적으로 문자 인코등(UTF-8)처리를 한다
	
}
