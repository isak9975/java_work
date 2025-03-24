package ex02_break;

public class Ex02_break {
	public static void main(String[] args) {
		//break 문은 switch 를 할때 나왔던 구문으로
		//case 를 종료할 때 사용
		//반복문이 진행되는 도중, 특정 조건을 만족해
		//더이상 반복문을 실행할 필요없이 종료하려고
		//할 때 사용한다.
		
		int s= 0;
		while(s<10) {
			if(s==5) {
				break; //s=5일때 더 이상 반복안하고 빠져나오기.
			}
			System.out.println(s+" ");
			s++;
		}
		System.out.println();
		
		
		//break, continue 와 같은 기타제어문들ㅇ느
		//반복문 안에서만 사용할 수 있다.
		
		//기타제어문 밑에는 코드가 올 수 없
		
	}//end main
}//end class
