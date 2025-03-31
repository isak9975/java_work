package ex05_generic;

import java.util.Arrays;

public class Gen<T> {
	
	public<T> void printArr(T[] arr){
		
		for(T x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(arr));
	}
}
