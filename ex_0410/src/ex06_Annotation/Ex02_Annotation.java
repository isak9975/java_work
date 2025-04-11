package ex06_Annotation;

import java.lang.annotation.Annotation;

@Testinfo(name="홍길동",skills= {"java","Spring"})
public class Ex02_Annotation {
	public static void main(String[] args) {
		Annotation[] annotations = Ex02_Annotation.class.getAnnotations();
		for(Annotation annotation : annotations) {
			System.out.println(annotation);
		}
		
		Testinfo testinfo =  (Testinfo)Ex02_Annotation.class.getAnnotation(Testinfo.class);
		System.out.println(testinfo);
	}
}
