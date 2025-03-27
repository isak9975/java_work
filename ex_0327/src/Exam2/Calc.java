package Exam2;

import java.util.Arrays;

public class Calc extends Claculator{
	
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	@Override
	public int substract(int a, int b) {
		return a-b;
	}@Override
	public double average(int[] a) {
		int total =0;
		for(int i =0; i<a.length;i++) {
			total += a[i];
		}
		return (double)total/a.length;
	}
	

}
