package ex05_enum;
//OrderStatus 열거형을 만들고

//ORDERED, SHIPPED, DELIVERED 상수를 정의한다.

//온라인 쇼핑몰의 주문상태를 관리하는 시스템을 만들고자 한다.

//상태에 따라 다음 상태로 바뀐다.

//각 상태에서 NEXT()메서드를 호출하면 다음 상태로 전환되도록 구현하기

//ORDERED → SHIPPED → DELIVERED → “완료 상태이며 상태 전환 불가”
public enum OrderStatus {
	ORDERED {
		@Override
		OrderStatus next() {
			return SHIPPED;
		}
	},
	SHIPPED {
		@Override
		OrderStatus next() {
			return DELIVERED;
		}
	},
	DELIVERED {
		@Override
		OrderStatus next() throws Exception{
			throw new Exception("완료 상태이며 상태 전환 불가");
		}
	};

	abstract OrderStatus next() throws Exception; 

}
