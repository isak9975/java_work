package ex02_for;

import java.awt.Image;
import java.io.DataOutput;

public class Ex02_for {
	public static void main(String[] args) {
		//향상된 for 문
		//jdk 1.5부터 새롭게 추가도니 기능으로
		//배열과 컬렉션의 모든 요소를 참조라기 위한 반복문이다.
		
		//for(변수 : 배열) {
		//반복하고 싶은 명령
		//}
		
		int [] ar = {1,2,3,4,5};
		
		for(int i =0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		//향상된 from 문
		//반복 대상의 요소를 하나씩 꺼내어 변수에 대입하면서
		//진행하고, 반복 대상의 길이만큼 꺼내어 반복한다.
		for(int i :ar) {
			System.out.println(i                                                                                                                                                                                                                                                                                                                                                              );
		}
		
	}//end main
}
