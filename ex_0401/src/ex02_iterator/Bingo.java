package ex02_iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Bingo {
	public static void main(String[] args) {
		//HashSet을 이용한 5*5의 랜덤 빙고판 만들기
		//숫자는 1~50
		HashSet<Integer> bingo = new HashSet<Integer>();
		
		int[][] arr1 = new int[5][5];
		
		//HashSet에 25개의 난수를 채울때까지 돌려라
			//==>여기에서 25개가 안만들어져서 오류가 났었음.
		while(bingo.size()!=25) {
			bingo.add(new Random().nextInt(50)+1);
		}
		
		//shuffle()
		//난수들을 셔플을 사용하기 위한 list형식으로 바꿔주기.
		List<Integer> list = new ArrayList<>(bingo);
		Collections.shuffle(list);//값 한번 섞어주기.
		//set으로 랜덤값을 넣었기 때문에 중복값은 어차피 안 들어가 있음.
		
		//Set은 index가 없기 때문에 하나씩 꺼낼수가 없다.
		//그렇기 때문에 iterator를 통해서 꺼낸다.
		Iterator<Integer> iterator = list.iterator();
		
		for(int i=0;i<arr1.length;i++)		{
			for(int j=0;j<arr1[i].length;j++) {
				arr1[i][j] = iterator.next();
				System.out.printf("%02d",arr1[i][j]);
			}
			System.out.println();
		}
			
	}
}
