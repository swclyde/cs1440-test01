package testing.unitTests.common;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Test;


import testing.common.ppServiceResult.AlternateID;
import testing.common.ppServiceResult.VSRiskFactorForHearingServiceResult;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;



public class VSRiskFactorForHearingServiceResultTest   extends TestCase {

	protected VSRiskFactorForHearingServiceResult GetTestValue()
    {
		VSRiskFactorForHearingServiceResult result = new VSRiskFactorForHearingServiceResult();

        result.setAlternateIds(new ArrayList<AlternateID>());
        result.getAlternateIds().add(new AlternateID());
        result.getAlternateIds().add(new AlternateID());
        result.setAnemia(true);
        result.setAnencephaly(true);
        result.setAPGAR1((short)1000);
        result.setAPGAR5((short)1000);
        result.setAssistedVent6Hours(true);
        result.setBirthOrder((short)1000);
        result.setBirthWeightGrams(new Integer(1000));
        result.setBirthWeightOunces((short)1000);
        result.setBirthWeightPounds((short)1000);
        result.setCharmID(new Long(1000));
        result.setChromAnom(true);
        result.setCleft(true);
        result.setCytomeglovirus(true);
        result.setDownSyndrome(true);
        result.setErrorMsg("errorMsg");
        result.setGestation((short)1000);
        result.setHereditaryHearingLoss("hereditaryHearingLoss");
        result.setHerpes(true);
        result.setHydrocephalus(true);
        result.setInjury(true);
        result.setMaternalInfectionsUnknown(true);
        result.setMeconium(true);
        result.setMeningitis(true);
        result.setMicrocephalus(true);
        result.setNewbornAntibiotics(true);
        result.setNICU("NICU");
        result.setOriginatingProgram("originatingProgram");
        result.setPlurality((short)1000);
        result.setProgramChildID(new Integer(1000));
        result.setResultStatus("resultStatus");
        result.setRubella(true);
        result.setSeizure(true);
        result.setToxoplasmosis(true);
        result.setUnknownAbnormalConditions(true);
        
        return result;
    }
	
	@Test
	public void testRiskFactorForHearingServiceResult()
	{
		VSRiskFactorForHearingServiceResult riskFactorForHearingServiceResult = new VSRiskFactorForHearingServiceResultTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("RiskFactorForHearingServiceResult.xml"), XmlFramework.Serialize(riskFactorForHearingServiceResult));
	}

}
