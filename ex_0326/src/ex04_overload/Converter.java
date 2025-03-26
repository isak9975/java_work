package ex04_overload;

public class Converter {
	//cm -> m로 변환하는 convert
	
	//m,inch -> cm로 변환하는 convert
	//inch -> cm : inch *2.54
	
	public double convert(int cm){
		return cm*0.01;
	}//end c
	
	public double convert(int a,String b) {
		if(b.equals("m")) {
			return a*100;
		}
		else if(b.equals("inch")) {
			return a*2.54;
		}
		return 0;
	}//end c
	

}
