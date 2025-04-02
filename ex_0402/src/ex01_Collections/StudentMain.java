package ex01_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//주어진 성적 리스트를 활용하여, 이름별로 Student 객체를 생성하고 점수를 누적하라.
//
//모든 학생 중에서 평균 점수가 가장 높은 학생의 이름과 평균 점수를 출력하라.
//
//평균 점수는 소수점 한 자리 이상 나오도록 출력해도 무방하다.

////List<String> scores = Arrays.asList(
////	    "Alice:Math:85", "Alice:English:78",
////	    "Bob:Math:90", "Bob:English:92", "Bob:Science:88",
////	    "Charlie:Math:70", "Charlie:English:60"

public class StudentMain {
	public static void main(String[] args) {
		
		ArrayList<String[]> list = new ArrayList<>();
		
		Map<String, Student> studentMap = new HashMap<String, Student>();
		
		List<String> scores = Arrays.asList(
		"Alice:Math:85", "Alice:English:78",
		"Bob:Math:90", "Bob:English:92", "Bob:Science:88",
		"Charlie:Math:70", "Charlie:English:60");
	
		for(String recode : scores) {
			String[] parts = recode.split(":");
			String name = parts[0];
			int score = Integer.parseInt(parts[2]);
			
			//값이 없을 때만 넣어(이미 키가 있으면 무시)(있는 값이면 기존객체)
			studentMap.putIfAbsent(name, new Student(name));
			
			//name을 통해서 얻어온 Student객체를 통해 addScore메서드를 호출하고 점수 전달.
			studentMap.get(name).addScore(score);
		}
				
		Student topStudent = null;
		double highAvg = 0;
		
		for(Student student : studentMap.values()) {
			double avg = student.getAverage();
			if(avg>highAvg) {
				highAvg = avg;
				topStudent = student;
			}
		}
		if(topStudent != null) {
			
		}
			
	}//end main
}//end calss
