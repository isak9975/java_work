package ex01;

public class SleepThread extends Thread{
	@Override
	public void run() {
		
		System.out.println("카운트다운 5초");
		for(int i =5;i>=0;i-- ) {
			try {
				System.out.printf("%d",i);
				if(i==0) {
					System.out.println("발사");
				}
				
				System.out.println();
				Thread.sleep(1000);
			
			} catch (InterruptedException e) {
				//InterruptedException
				//스레드가 해야할 일을 처리하지 못할때
				e.printStackTrace();
			}
		}
		System.out.println("시스템 종료");
	}
	
	
	
	
	
	public static void main(String[] args) {
		SleepThread sleepThread = new SleepThread();
		sleepThread.run();
	}

	
	
}


