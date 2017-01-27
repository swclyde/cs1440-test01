package testing.unitTests.common;

import junit.framework.TestCase;

import org.junit.Test;


import testing.common.ppServiceResult.EIAssessmentMethod;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;



public class EIAssessmentMethodTest  extends TestCase {

	protected EIAssessmentMethod GetTestValue()
    {
		 EIAssessmentMethod result = new EIAssessmentMethod();
         result.setAssessmentMethod("assessmentMethod");
         result.setStandardizedScore("standardizedScore");
         return result;
    }
	@Test
	public void testEIAssessmentMethod()
	{
		EIAssessmentMethod eIAssessmentMethod = new EIAssessmentMethodTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("EIAssessmentMethod.xml"), XmlFramework.Serialize(eIAssessmentMethod));
	}

}
