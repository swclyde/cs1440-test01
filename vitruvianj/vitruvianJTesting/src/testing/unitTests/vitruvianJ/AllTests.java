package testing.unitTests.vitruvianJ;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for unitTests");
		//$JUnit-BEGIN$
		suite.addTestSuite(JFileAppenderTest.class);
		suite.addTestSuite(ByteListTest.class);
		suite.addTestSuite(PathUtilitiesTest.class);
		suite.addTestSuite(JLoggerTest.class);
		suite.addTestSuite(XmlSerializerTest.class);
		suite.addTestSuite(RunAnnotationTests.class);
		suite.addTestSuite(XmlDeserializerTest.class);
		suite.addTestSuite(XmlFrameworkTest.class);
		suite.addTestSuite(GUIDTest.class);
		suite.addTestSuite(ServiceRegistryTest.class);
		//$JUnit-END$
		return suite;
	}

}
