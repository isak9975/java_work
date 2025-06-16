package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Exam {
	//4번 문제
	public int[] removeDuplicates(int[] arr) {
		int[] result = new int [arr.length];
		
		for(int i = 0; i<arr.length-1;i++) {
			if(arr[i] !=arr[i+1]) {
//				result.
			}
		}
		
		
		
		
		return null;
	}
	
	
	//5번 문제
	public int findmax(int[] arr){

	    int max = 0;

	    for(int i=0;i<arr.length;i++){

	       if(arr[i] > max){

	              max = arr[i];

	         }

	    }
	    return max;
	}
	
	//7번문제
	public Map<String, Integer> wordFrequency() {
		Map<String , Integer> result = new HashMap<String, Integer>();
		String text = "apple banana apple apple orange banana apple orange orange";
		String[] str = text.split(" ");
		
		for(int i=0;i<str.length;i++) {
//			result.computeIfAbsent(str[i], x-> return x)
		}
		
		
//		System.out.println(Arrays.toString(str));
		
		return result;
	}
	
	
	//9번 문제
	public int sumOfDigits(int num) {
		int result =0;
		int num2 = num;
		System.out.println(num2);
		
		
		for(int i =num2; i < 0 ;i++) {
			
			num2 /= 10;
			System.out.println(num2);
			
		}
		return result;
	}
	
	public static void main(String[] args) {
		Exam exam = new Exam();
		
//		exam.wordFrequency();
		
//		exam.sumOfDigits(12345);
		
		
	}
	
	
}
