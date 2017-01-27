package testing.unitTests.common;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Test;

import testing.common.data.AddressData;
import testing.common.ppServiceResult.EIAssessment;
import testing.common.ppServiceResult.EIAssessmentMethod;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;


public class EIAssessmentTest   extends TestCase {

	protected EIAssessment GetTestValue()
    {
		EIAssessment result = new EIAssessment();
        result.setAssessDate("assessDate");
        result.setAssessmentList(new ArrayList<EIAssessmentMethod>());
        result.getAssessmentList().add(new EIAssessmentMethod());
        result.getAssessmentList().add(new EIAssessmentMethod());
        result.setDomain("domain");
        result.setIsDomain(true);
        result.setScreeningResult("screeningResult");
        result.setSignificanceOfDelay("significanceOfDelay");
        return result;
    }
	@Test
	public void testEIAssessment()
	{
		EIAssessment eIAssessment = new EIAssessmentTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("EIAssessment.xml"), XmlFramework.Serialize(eIAssessment));
	}

}
