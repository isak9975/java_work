package ex04_outputstreamwriter;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Ex01_OutputStreamWriter {
	public static void main(String[] args) {
		//바이트 기반의 스트림은
		//문자열을 바이트배열로 변호나한 후에 작성을 했어야 했다.
		//OutputStreamWriter의 경우 문자열을 바이트로 쉽게 변경을 해주는 보조스트림이다.
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
				try {
					fos = new FileOutputStream("D:\\kimisak\\java\\java_work\\OutputStreamWriter.txt");
					osw = new OutputStreamWriter(fos);
					
					System.out.println("파일 생성 시작");
					String[] str = {
							"OutputStreamWriter에 대해서 배웁니다",
							"we are learning aoubt ouputStreamwriter"
					};
					
					for(String string : str ) {
						osw.write(string+"\n");
					}
					
					System.out.println("파일 생성 완료");
					
				
				} catch (Exception e) {
					// TODO: handle exception
				} finally {
					try {
						if(osw!=null)osw.close();
						if(fos!=null)fos.close();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
	}
}
