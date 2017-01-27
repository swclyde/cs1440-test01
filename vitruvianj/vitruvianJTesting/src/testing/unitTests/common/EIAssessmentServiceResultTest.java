package testing.unitTests.common;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Test;


import testing.common.ppServiceResult.AlternateID;
import testing.common.ppServiceResult.EIAssessment;
import testing.common.ppServiceResult.EIAssessmentServiceResult;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;



public class EIAssessmentServiceResultTest   extends TestCase {

	protected EIAssessmentServiceResult GetTestValue()
    {
		EIAssessmentServiceResult result = new EIAssessmentServiceResult();
        result.setAlternateIds(new ArrayList<AlternateID>());
        result.getAlternateIds().add(new AlternateID());
        result.getAlternateIds().add(new AlternateID());
        result.setAssessmentList(new ArrayList<EIAssessment>());
        result.getAssessmentList().add(new EIAssessment());
        result.getAssessmentList().add(new EIAssessment());
        result.setCharmID(new Long(1000));
        result.setErrorMsg("errorMsg");
        result.setOriginatingProgram("originatingProgram");
        result.setProgramChildID(1000);
        result.setResultStatus("resultStatus");
        return result;
    }
	@Test
	public void testEIAssessmentServiceResult()
	{
		EIAssessmentServiceResult eIAssessmentServiceResult = new EIAssessmentServiceResultTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("EIAssessmentService.xml"), XmlFramework.Serialize(eIAssessmentServiceResult));
	}

}
