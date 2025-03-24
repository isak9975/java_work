package ex04_array;

import java.util.Random;
import java.util.Scanner;

import javax.xml.stream.events.EndDocument;

public class Exam1 {
	public static void main(String[] args) {
		int[] iArr = new int[10];
		//배열에 각각의 index에 1~10를 할당하고
		//총 합을 구하여 출력하세요
		int total = 0;
		for(int i =0;i<10;i++){
			iArr[i]= i+1;
			total += iArr[i];
		}
		System.out.println("총합은 : " + total);
		
System.out.println("=======================================================");
		
		
		Random r = new Random();
		int random = r.nextInt(30)+1;
		
		//iArr에 각 index 에 난수를 넣고
		//배열의 짝수 요소들의 총 합 구하기
		for(int i =0; i<10;i++) {
			iArr[i] = random;
			if(iArr[i]%2==0){
				total += iArr[i];
			}//end if
		}
		System.out.println("배열의 짝수 요소들의 총 합은 : "+total);
		
System.out.println("=======================================================");

		int[] nums = {5,7,2,9,4,10,3};
		//배열에서 최대값과 최소값을 출력하는 프로그램 만들기
		int max = 0;
		int min = 10;
		for(int i =0;i<nums.length-1;i++){
			for(int j=0;j<i;j++) {
				if(nums[i]>nums[j]) {
					if(nums[i]>max) {
						max = nums[i];
					}
				 	if(nums[j]<min) {
				 		min = nums[j];
				 	}
				}else {
					if(nums[j]>max) {
						max = nums[j];
					}
				 	if(nums[i]<min) {
				 		min = nums[i];
				 	}	
				}
			}//end for2
		}//end for1
		System.out.println("최대값은 : "+max);
		System.out.println("최소값은 : " + min);
		
System.out.println("=======================================================");

		int[] nums2 = {1,2,1,3,2,1,4};
		//위 배열에서 각 숫자가 몇 번 나왔는지 출력하시오
		//1 : 3번
		//2 : 2번
		//3 : 1번
		//4 : 1번
		int count[] = new int[5];
		
//		for(int i =0;i<nums2.length;i++) {
//			count[nums2[i]]++;
//		}
//		for(int i = 1; i <=4; i++) {
//			System.out.printf("%d : $d번 \n",count[i],count[i]);
//		}
//		
		
		
		for(int i =0;i<nums2.length;i++){			
			switch(nums2[i]) {
			case 1:
				count[nums2[i]-1]++;
				break;
			case 2:
				count[nums2[i]-1]++;
				break;
			case 3:
				count[nums2[i]-1]++;
				break;
			case 4:
				count[nums2[i]-1]++;
				break;
			}//end swich
		}//end for		
		System.out.println("1 : "+count[0]);
		System.out.println("2 : "+count[1]);
		System.out.println("3 : "+count[2]);
		System.out.println("4 : "+count[3]);
		
System.out.println("=======================================================");
		System.out.println("[내림차순]");
		int[] nums3 = {5,3,8,4,2};
		//오름차순으로 정렬하세요
		int temp = 0;
		for(int i =0; i<nums3.length;i++){
			for(int j=0;j<i;j++) {
				if(nums3[i] > nums3[j]) {
					temp = nums3[i];
					nums3[i]= nums3[j];
					nums3[j] = temp;
				}//end if
			}//end for2
		}//end for1
		
		for(int i =0; i<nums3.length;i++){
			System.out.printf("%d번째 숫자 : %d \n",i,nums3[i]);
		}
		
		
		//1. 버블정렬
		//인접한 두 요소를 비교해 큰 값을 뒤로 보내는 정렬 방식
		System.out.println("[오름차순]");
		int temp1 = 0;
		for(int i =0; i<nums3.length;i++){
			for(int j=0;j<i;j++) {
				if(nums3[i] < nums3[j]) {
					temp1 = nums3[j];
					nums3[j]= nums3[i];
					nums3[i] = temp1;
				}//end if
			}//end for2
		}//end for1
		for(int i =0; i<nums3.length;i++){
			System.out.printf("%d, %d",i,nums3[i]);
		}
		
System.out.println("==================================================================");
		

		//아스키 코드 활용
		char[] cards = {'1','L','O','2','V','3','E'};
		String myWord = "";
		//배열에서 영문자만 추출하여 이어붙혀 출력하시오
		for(int i=0; i<cards.length;i++) {
			int n = cards[i];
			System.out.println("숫자"+n);
			
			if(cards[i]>51) {
				myWord += (char)n;
			}
		}
		System.out.println(myWord);
		
System.out.println("====================================================================");
		
		//키보드에서 배열의 길이를 입력받는다
		//입력받은 배려의 길이만큼 알파벳을 넣고 출력한다.
		//배열의 길이 : 5
		//ABCDE
		
		Scanner scan = new Scanner(System.in);
//		
//		System.out.printf("배열의 길이를 입력하세요 : ");
//		int arraynum = scan.nextInt();
//				
//		for(int i=0;i<arraynum;i++){
//			char alpabet = 'A';
//			alpabet += (char)i;
//			System.out.print(alpabet);
//		}
		
		
System.out.println("====================================================================");
	//동전의 개수 구하기
	//10~5000사이의 난수를 변수에 담는다
	//1의 자리는 반드시 0이 되도록 한다.
	//발생된 난수를 각 동전으로 바꿀 때 몇개씩 필요한지
	//판단하여 작성하세요
	//가능한 적은 수의 동전을 사용한다.

	//4170
	//500원 : 8개
	//100 : 1개
	//50 : 1개
	//10개 : 2개

	int[] coin = {500,100,50,10};
//	int money = (r.nextInt(4)+1)*1000 + (r.nextInt(8)+1)*100 +(r.nextInt(8)+1)*10 ;
	int money = (r.nextInt(500)+1)*10;
	int n1[] = new int[4];
	
	System.out.println(money+"원");
	for(int i = 0;i<coin.length;i++) {
		n1[i] = money / coin[i];
		money -= n1[i]*coin[i]; 
		System.out.printf("%d원 %d개\n",coin[i],n1[i]);
	}
	
System.out.println("====================================================================");
	
	
	}//end main
}//end class










