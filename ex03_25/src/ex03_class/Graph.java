package ex03_class;
import java.util.Arrays;
import java.util.PrimitiveIterator.OfDouble;
import java.util.Random;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Graph {
	int[] arr = new int[100];
		
	
	//메서드
	public void PrintGraph(){
		Random r = new Random();
		
		int[] count = new int[10];
		
		//난수 넣기
		for(int i = 0; i<100;i++) {
			this.arr[i] = r.nextInt(10);;
			count[arr[i]]++;
		}
		//난수 한번에 다 출력
		System.out.println(Arrays.toString(arr));
				
		//난수 출력
		for(int i = 0; i<10;i++) {
			System.out.printf("%d 의 갯수 : ",i);
			for(int j=0;j<count[i];j++) {
				System.out.print("#");
			}
			System.out.println(" "+count[i]);
		}
		 
		
	}//end method
	
}//end class
