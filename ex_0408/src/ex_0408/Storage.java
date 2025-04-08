package ex_0408;

public class Storage {
	//wait()와 notity()
	//여러개의 스레드가 동시에 동작하다 보면, 하나의 스레드가 완료되어야 다음 스레드가 동작할 수 있는 경우가 있다
	//물건 나르기 -> 물건 쌓기 -> 물건 나르기 -> 물건 쌓기
	//wait() 메서드는 스레드를 대기시키고,
	//notity() 메서드는 대기중인 스레드를 다시 동작시킬때 사용한다.
	//동기화 진행중에 일시적으로 스레드를 정지시키고 다른 스레드가 작업을 할 수 있다.
	//a(끝)->b(끝)가 아닌 // a(중간)->b(중간)->a(중간)->b(중간) 느낌
	
//===================================================================================
	
	//재고
	private int stackCount = 10;
	
	//물건을 쌓는 메서드
	public synchronized void addStack(int stackCount) {
		
		this.stackCount += stackCount;
		
		//쌓은 물건이 10개 이상이면 
		if(this.stackCount >= 10) {
			System.out.println("=== 스레드 깨우기 ===");
			notify(); //스레드를 깨워서 물건을 옮겨라.
		}//end if
		
	}//end  method
	
	
	public synchronized void  popStack(int leaveCount){
		//옮기려는 양이 재고보다 많으면
		if(leaveCount > stackCount) {
			stackCount = 0;
		}else {
			this.stackCount -= leaveCount;
		}
		//쌓은 물건이 0이면
		if(stackCount ==0) {
			System.out.println("=== 짐 없음 대기 ===");
			try {
				wait();//스레드가 진행중에 wait()을 만나면 일시적으로 정지
				//스레드가 구동되고 있을 때 일시적으로 대기상태에 보내고, 다른 스레드에게 제어권을 넘긴다.
				
				//notify()가 실행될때 wait() 바로 아래에서 시작된다.
				System.out.println("=== 대기끝 일 시작");
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
		}//end if
	}//end method
	
	
	//재고 개수 확인 getter
	public int getStackCount() {
		return stackCount;
	}
	
}//end class
