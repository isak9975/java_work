package ex06_Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//선언 키워드는 @interface
//어노테이션을 적용할 타겟
@Target(ElementType.TYPE)

//어노테이션의 유지 범위를 지정(런타임, 컴파일 등)
@Retention(RetentionPolicy.RUNTIME)
public @interface Testinfo {
	
	String name(); //추상메서드로 선언해야한다.
	int career() default 1;
	String[] skills();
	//어노테이션의 속성은 메서드 형태로 정의한다.
	
	//어노테이션 속성의 반환형은 제한적이다.
	//기본타입
	//String
	//Class
	//enum
	//다른 어노테이션
	//배열
	
	//속성에 기본값을 지정할 수 있다.
	//예외를 던질 수 없다.
	//String value() throw Exception;
	
	//속성은 매개변수를 가질 수 없다.
	//String name(String input);
	
	
}
