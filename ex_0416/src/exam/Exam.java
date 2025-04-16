package exam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Stream;

public class Exam {
	public static void main(String[] args) {
	
		List<String> list = Arrays.asList("apple", "dog", "banana", "cat", "grape");
	    list.stream()
	        .filter(t -> t.length()>=4)
	        .forEach(System.out::println);
	
	    Map<String, Integer> scores = new HashMap<>();
	    scores.put("Alice", 85);
	    scores.put("Bob", 72);
	    scores.put("Charlie", 90);
	    
	    for(Entry<String, Integer> en : scores.entrySet()) {
	    	if(en.getValue()>=80) {
	    		System.out.print(en.getKey()+" : ");
	    		System.out.println(en.getValue());
	    	}
	    }
	    
	    StreamFun f1 = (x) -> x.toUpperCase();
	    
	    System.out.println(f1.fun("hello"));
	    
	    Function<String, String>f2 = t -> t.toUpperCase();
	    
	
	    
	}
}
