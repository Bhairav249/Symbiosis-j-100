import java.lang.annotation.*;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

@ interface TestAnnotation{
	String teacher()
	default "viniya";
	String subject();	
}
public class customeAnnotaionExample {
	
	@TestAnnotation(teacher ="bhairav", subject="java full stack")
	public void method1() {
		System.out.println("Test Method 1");
		
	}
	@TestAnnotation(teacher ="myname", subject="full stack java")
	public void method2() {
		System.out.println("Test Method 2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Method m =customeAnnotaionExample.class.getMethod("method1");
			TestAnnotation personAnnotation = (TestAnnotation) m.getAnnotation(TestAnnotation.class);
			if(personAnnotation != null) {
				System.out.println(" Name :" +personAnnotation.teacher());
				System.out.println("Subject: "+personAnnotation.subject());
				System.out.println("-------------------------");
				
			}
		}
			catch(NoSuchMethodException e) {
				System.out.println("NoSuchMethodException");
				return;
				
			}
		try {
			Method m =customeAnnotaionExample.class.getMethod("method2");
			TestAnnotation personAnnotation = (TestAnnotation) m.getAnnotation(TestAnnotation.class);
			if(personAnnotation != null) {
				System.out.println(" Name :" +personAnnotation.teacher());
				System.out.println("Subject: "+personAnnotation.subject());
				System.out.println("-------------------------");
				
			}
		}
			catch(NoSuchMethodException e) {
				System.out.println("NoSuchMethodException");
				return;
				
			}
			customeAnnotaionExample obj1 = new customeAnnotaionExample();
			obj1.method1();
	}	
}
