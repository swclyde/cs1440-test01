package testing.unitTests.vitruvianJ;
import java.lang.reflect.*;

import junit.framework.TestCase;


public class RunAnnotationTests extends TestCase {
	public void testAnnotations() {
		try{
		int passed = 0, failed = 0;
		String arg = "serialization.Foo";
		for (Method m : Class.forName(arg).getMethods()) {
			if (m.isAnnotationPresent(TestAnnotations.class)) {
				try {
					m.invoke(null);
					passed++;
				} catch (Exception ex) {
					System.out
							.printf("Test %s failed: %s %n", m, ex.getCause());
					failed++;
				}
			}
		}
		System.out.printf("Passed: %d, Failed %d%n", passed, failed);
		}catch(Exception e)
		{}
	}
}