package vitruvianJ.serialization;

import java.lang.annotation.*; 
import java.lang.reflect.*; 
 

@Retention(RetentionPolicy.RUNTIME)  
@interface MyAnno { 
  String str() default "Testing"; 
  int val() default 9000; 
} 
 
public class TestAnnotations { 
 
  // Annotate a method using the default values. 
  @MyAnno() 
  public static void myMeth() { 
	  TestAnnotations ob = new TestAnnotations(); 
 
    // Obtain the annotation for this method 
    // and display the values of the members. 
    try { 
    	

      Class c = ob.getClass(); 
 
      Method m = c.getMethod("myMeth"); 
 
  	  Annotation[] attributes = m.getAnnotations();// GetCustomAttributes(Formatter.class, false);		
/*	
	if (attributes.length > 0){		
		Class attribute = attributes[0].annotationType();
		AnnotatedElement element = m;
		
		MyAnno ano =  element.getAnnotation(attribute);
		String value = ano.getClass().getCanonicalName();
	}	
	*/
      MyAnno anno = m.getAnnotation(MyAnno.class); 
  
      System.out.println(anno.str() + " " + anno.val()); 
    } catch (NoSuchMethodException exc) { 
       System.out.println("Method Not Found."); 
    } 
  } 
 
  public static void main(String args[]) { 
    myMeth(); 
  } 
}