package testing.unitTests.common;

import junit.framework.TestCase;

import org.junit.Test;


import testing.common.ppServiceResult.ImmunizationEvent;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;



public class ImmunizationEventTest   extends TestCase {

	protected ImmunizationEvent GetTestValue()
    {
		ImmunizationEvent result = new ImmunizationEvent();
        result.setConfidentialityRequirement("confidentialityRequirement");
        result.setContraindicationFlag("contraindicationFlag");
        result.setEventDate("eventDate");
        result.setExemptFlag("exemptFlag");
        result.setInvalidFlag("invalidFlag");
        result.setNote("note");
        result.setProviderName("providerName");
        result.setReactionFlag("reactionFlag");
        result.setVaccinationDate("vaccinationDate");
        result.setVaccineCode("vaccineCode");
        result.setVaccineComponentNo(new Long(1000));
        result.setVaccineName("vaccineName");
        result.setVaccineSeriesName("vaccineSeriesName");
        return result;
    }
	@Test
	public void testImmunizationEvent()
	{
		ImmunizationEvent immunizationEvent = new ImmunizationEventTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("ImmunizationEvent.xml"), XmlFramework.Serialize(immunizationEvent));
	}

}
