package ex_0408;

class AddStatckThread extends Thread{
	private Storage storage;
	
	public AddStatckThread(Storage storage) {
		this.storage = storage;
	}
	
	@Override
	public void run() {
		//짐을 10개씩 쌓을거임
		try {
			while(true) {
				Thread.sleep(1000);
				if(this.storage.getStackCount()==0) {
					System.out.println("짐 10개 추가");
					this.storage.addStack(10);
				}//end if
			}//end while
			
		} catch (Exception e) {
			
		}
	}//end run
	
}//end class

class PopStatckThread extends Thread{
	private Storage storage;
	
	public PopStatckThread(Storage storage) {
		this.storage = storage;
	}
	
	@Override
	public void run() {
		//짐을 5개씩 옮길거임
		try {
			while(true) {
				Thread.sleep(1000);
				System.out.println("짐 5개 나르기");
				this.storage.popStack(5);
			}			
		} catch (Exception e) {
			
		}
	}
}


public class ThreadWaitExample {
	public static void main(String[] args) {
		Storage storage = new Storage();
		
		AddStatckThread t1 = new AddStatckThread(storage);
		PopStatckThread p1 = new PopStatckThread(storage);
		
		t1.start();
		p1.start();
		
		
	}
}
