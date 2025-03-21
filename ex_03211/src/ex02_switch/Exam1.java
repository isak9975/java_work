package ex02_switch;

public class Exam1 {
	public static void main(String[] args) {
		int ball=20;
		int box = 5;
		float result = (float)ball/box;
		if((ball%box)>=1) {
			System.out.printf("필요한 박스의 개수는 %.0f 개",result+1);
		}
		else {
			System.out.printf("필요한 박스의 개수는 %.0f 개",result);
		}
	}
}
