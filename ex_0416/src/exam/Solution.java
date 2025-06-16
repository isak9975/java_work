package exam;

import java.util.Arrays;

public class Solution {
	int answer = 0;
    int max = 0;
    int[] arr = new int [1000];
    boolean count = false;
    
    public int solution(int[] array) {
        
        for(int i =0; i<array.length;i++){
//        	System.out.println("array"+array[i]);
        	arr[array[i]] =arr[array[i]] +1; 
//        	System.out.println("arr"+arr[array[i]]);    	
        }
        
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
               
        for(int i =0;i<arr.length;i++){
        	
            if(arr[i] == max){
            	if(count) {
            		
                	System.out.println("max"+max);
                    return -1;	
            	}
            	count=true;
                
            }
        }
                      
        return array[max-1];
    }
    
    
    public static void main(String[] args) {
    	int[] array = {1,1,2,2};
    	
    	Solution s = new Solution();
    	
//    	System.out.println(Arrays.toString(s.arr));
		System.out.println(s.solution(array));
	}
}