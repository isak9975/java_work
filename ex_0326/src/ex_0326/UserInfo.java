package ex_0326;

public class UserInfo {
int totalmoney = 0;


//돈을 입금했을 경우를 처리
public boolean deposit(int money){
	totalmoney += money;
	return true;
}

//돈을 출금 처리
public boolean withDraw(int money){
	if(totalmoney>money) {
		totalmoney -= money;
		return true;
	}
	else {
		System.out.println("[실패]잔액이 부족합니다");
		return false;
	}
	
}

//현재 잔액 반환
public int showMoney() {
	return totalmoney;
}
	
}
