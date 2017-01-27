package testing.unitTests.common;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Test;

import testing.common.data.AddressData;
import testing.common.ppServiceResult.AlternateID;
import testing.common.ppServiceResult.NbsMailerResultsServiceResult;
import testing.common.ppServiceResult.NbsResult;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;


public class NbsMailerResultsServiceResultTest   extends TestCase {

	protected NbsMailerResultsServiceResult GetTestValue()
    {
		NbsMailerResultsServiceResult result = new NbsMailerResultsServiceResult();
        result.setAlternateIds(new ArrayList<AlternateID>());
        result.getAlternateIds().add(new AlternateID());
        result.getAlternateIds().add(new AlternateID());
        result.setCharmID(new Long(1000));
        result.setErrorMsg("errorMsg");
        result.setNbsResultList(new ArrayList<NbsResult>());
        result.getNbsResultList().add(new NbsResult());
        result.getNbsResultList().add(new NbsResult());
        result.setOriginatingProgram("originatingProgram");
        result.setProgramChildID(1000);
        result.setResultStatus("resultStatus");
        return result;
    }
	@Test
	public void testNbsMailerResultsServiceResult()
	{
		NbsMailerResultsServiceResult nbsMailerResultsServiceResult = new NbsMailerResultsServiceResultTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("NbsMailerResultsServiceResult.xml"), XmlFramework.Serialize(nbsMailerResultsServiceResult));
	}

}
