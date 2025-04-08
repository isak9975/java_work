package ex_0408;

import java.util.Iterator;
import java.util.Scanner;

import javax.lang.model.util.AbstractAnnotationValueVisitor14;

//스캐너를 이용하여 키보드에서 숫자를 입력받고
//스레드에서 입력받은 숫자부터 1씩 감소하다가 0이 되었을 때
//"종료" 메시지와 함께 프로그램이 종료되도록 만들어보자
//Thread는 ThreadCount에다 작성하기
public class Exam1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("카운드를 입력하세요 : ");
		int count = scan.nextInt();
		ThreadCount threadCount = new ThreadCount(count);
		ThreadCount threadCount1 = new ThreadCount(10);
		
		
		Thread t1 = new Thread(threadCount);
		Thread t2 = new Thread(threadCount1);
		
		new Thread(threadCount).start();
		
		t1.start();
		t2.start();
	
	}
	
}

class ThreadCount implements Runnable{
	
	private int count;
	
	public ThreadCount(int count) {
		this.count = count;
	}	
	
	public void countStart(int count) {
		
		for(int i = count; i>=0;i--) {
			
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(i==0) {
				System.out.println("종료");
				break;
			}			
		}
	}
	
	@Override
	public void run() {
		countStart(count);
		
	}
	
}