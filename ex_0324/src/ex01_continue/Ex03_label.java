package ex01_continue;

public class Ex03_label {
	public static void main(String[] args) {
		//label
		//기타제어문을 포함하고 있는 방복문에 대해서만
		//영향이 있다.
		//라벨링을 하면 내가 원하는 반복문에 대해서 
		//조작을 할 수 있다.
		
		
		
		for(int i=0;i<3;i++) {
			 for(int j =0;j<=10;j++) {
				if(j%2==0) {
					continue;
				}System.out.println(j+" ");
			}
			System.out.println();
		}
		//라벨은 항상 쌍으로 존재한다.
		out:for(int i=0;i<3;i++) {
			 for(int j =0;j<=10;j++) {
				if(j%2==0) {
					break out;
				}System.out.println(j+" ");
			}
			System.out.println();
		}
	}//end main
}//end class
