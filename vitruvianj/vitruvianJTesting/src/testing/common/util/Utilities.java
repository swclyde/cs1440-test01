package testing.common.util;

import testing.common.data.*;
import testing.common.ppQueryResult.*;
import testing.common.ppServiceResult.*;
import testing.common.userprofile.*;
import vitruvianJ.serialization.xml.*;

import java.lang.reflect.*;
import java.util.*;

//import com.sun.org.apache.xpath.internal.operations.String;


    public class Utilities
    {

        static public XmlSerializer GetSerializer()
        {
            XmlSerializer result = new XmlSerializer();

            // native types
            result.getTypeChange().put(String.class, "String");
            result.getTypeChange().put(Boolean.class, "Boolean");
            result.getTypeChange().put(Integer.class, "Integer");            
            result.getTypeChange().put(Float.class, "Float");
            result.getTypeChange().put(Double.class, "Double");
            result.getTypeChange().put(boolean.class, "boolean");
            result.getTypeChange().put(int.class, "int");
            result.getTypeChange().put(float.class, "float");
            result.getTypeChange().put(double.class, "double");
            
            // charm types
            result.getTypeChange().put(AddressData.class, "AddressData");
            result.getTypeChange().put(AlertData.class, "AlertData");
            result.getTypeChange().put(AliasData.class, "AliasData");
            result.getTypeChange().put(DeferredMatchData.class, "DeferredMatchData");
            result.getTypeChange().put(EmailData.class, "EmailData");
            result.getTypeChange().put(OptData.class, "OptData");
            result.getTypeChange().put(PersonData.class, "PersonData");
            result.getTypeChange().put(PersonRoleData.class, "PersonRoleData");
            result.getTypeChange().put(PhoneData.class, "PhoneData");
            result.getTypeChange().put(QueryResult.class, "QueryResult");
            result.getTypeChange().put(AlertServiceResult.class, "AlertServiceResult");
            result.getTypeChange().put(AlternateID.class, "AlternateID");
            result.getTypeChange().put(BirthRecordForOrsisServiceResult.class, "BirthRecordForOrsisServiceResult");
            result.getTypeChange().put(EIAssessment.class, "EIAssessment");
            result.getTypeChange().put(EIAssessmentMethod.class, "EIAssessmentMethod");
            result.getTypeChange().put(EIAssessmentServiceResult.class, "EIAssessmentServiceResult");
            result.getTypeChange().put(EIIFSP.class, "EIIFSP");
            result.getTypeChange().put(EIMostRecentServicePlanServiceResult.class, "EIMostRecentServicePlanServiceResult");
            result.getTypeChange().put(EIServicePlanHistoryServiceResult.class, "EIServicePlanHistoryServiceResult");
            result.getTypeChange().put(EIStatusServiceResult.class, "EIStatusServiceResult");
            result.getTypeChange().put(Event.class, "Event");
            result.getTypeChange().put(HearingScreeningDispositionServiceResult.class, "HearingScreeningDispositionServiceResult");
            result.getTypeChange().put(HearingScreeningHistoryServiceResult.class, "HearingScreeningHistoryServiceResult");
            result.getTypeChange().put(HearingScreeningMCRServiceResult.class, "HearingScreeningMCRServiceResult");
            result.getTypeChange().put(HearingScreeningStatusServiceResult.class, "HearingScreeningStatusServiceResult");
            result.getTypeChange().put(IFSPService.class, "IFSPService");
            result.getTypeChange().put(ImmunizationEvent.class, "ImmunizationEvent");
            result.getTypeChange().put(testing.common.ppServiceResult.ImmunizationHistoryServiceResult.class, "ImmunizationHistoryServiceResult");            																	
            result.getTypeChange().put(ImmunizationStatusData.class, "ImmunizationStatusData");
            result.getTypeChange().put(ImmunizationStatusServiceResult.class, "ImmunizationStatusServiceResult");
            result.getTypeChange().put(MostConclusiveResult.class, "MostConclusiveResult");
            result.getTypeChange().put(NbsMailerResultsServiceResult.class, "NbsMailerResultsServiceResult");
            result.getTypeChange().put(NbsResult.class, "NbsResult");
            result.getTypeChange().put(PersonServiceResult.class, "PersonServiceResult");
            result.getTypeChange().put(ServiceResult.class, "ServiceResult");
            result.getTypeChange().put(VSRiskFactorForHearingServiceResult.class, "RiskFactorForHearingServiceResult");
            result.getTypeChange().put(UDPClientProfile.class, "UDPClientProfile");

            // list types
            result.getTypeChange().put(new ArrayList<AddressData>().getClass() , "AddressDataList");
            result.getTypeChange().put(new ArrayList<PersonData>().getClass(), "PersonDataList");
            result.getTypeChange().put(new ArrayList<PhoneData>().getClass(), "PhoneDataList");
            result.getTypeChange().put(new ArrayList<EmailData>().getClass(), "EmailDataList");
            result.getTypeChange().put(new ArrayList<ServiceResult>().getClass(), "ServiceResultList");
            result.getTypeChange().put(new ArrayList<AlertData>().getClass(), "AlertDataList");
            result.getTypeChange().put(new ArrayList<EIAssessment>().getClass(), "EIAssessmentList");
            result.getTypeChange().put(new ArrayList<EIAssessmentMethod>().getClass(), "EIAssessmentMethodList");
            result.getTypeChange().put(new ArrayList<IFSPService>().getClass(), "IFSPServiceList");
            result.getTypeChange().put(new ArrayList<EIIFSP>().getClass(), "EIIFSPList");
            result.getTypeChange().put(new ArrayList<Test>().getClass(), "TestList");
            result.getTypeChange().put(new ArrayList<MostConclusiveResult>().getClass(), "MostConclusiveResultList");
            result.getTypeChange().put(new ArrayList<ImmunizationEvent>().getClass(), "ImmunizationEventList");
            result.getTypeChange().put(new ArrayList<ImmunizationStatusData>().getClass(), "ImmunizationStatusList");
            result.getTypeChange().put(new ArrayList<NbsResult>().getClass(), "NbsResultList");
            result.getTypeChange().put(new ArrayList<AlternateID>().getClass(), "AlternateIDList");
            result.getTypeChange().put(NbsSampleCardServiceResult.class, "NbsSampleCardServiceResult");
            result.getTypeChange().put(NbsSample.class, "NbsSample");
            

            return result;
        }

        static public XmlDeserializer GetDeserializer()
        {
            XmlDeserializer result = new XmlDeserializer();

            
            result.getTypeChange().put("String" , String.class);
            result.getTypeChange().put("Boolean" , Boolean.class);
            result.getTypeChange().put("Integer" , Integer.class);            
            result.getTypeChange().put("Float" , Float.class);
            result.getTypeChange().put("Double" , Double.class);
            result.getTypeChange().put("boolean" , boolean.class);
            result.getTypeChange().put("int" , int.class);
            result.getTypeChange().put("float" , float.class);
            result.getTypeChange().put("double" , double.class);
            
            // charm types
            
            // charm types
            result.getTypeChange().put("AddressData", AddressData.class);
            result.getTypeChange().put("AlertData", AlertData.class);
            result.getTypeChange().put("AliasData", AliasData.class);
            result.getTypeChange().put("DeferredMatchData", DeferredMatchData.class);
            result.getTypeChange().put("EmailData", EmailData.class);
            result.getTypeChange().put("OptData", OptData.class);
            result.getTypeChange().put("PersonData", PersonData.class);
            result.getTypeChange().put("PersonRoleData", PersonRoleData.class);
            result.getTypeChange().put("PhoneData", PhoneData.class);
            result.getTypeChange().put("QueryResult", QueryResult.class);
            result.getTypeChange().put("AlertServiceResult", AlertServiceResult.class);
            result.getTypeChange().put("AlternateID", AlternateID.class);
            result.getTypeChange().put("BirthRecordForOrsisServiceResult", BirthRecordForOrsisServiceResult.class);
            result.getTypeChange().put("EIAssessment", EIAssessment.class);
            result.getTypeChange().put("EIAssessmentMethod", EIAssessmentMethod.class);
            result.getTypeChange().put("EIAssessmentServiceResult", EIAssessmentServiceResult.class);
            result.getTypeChange().put("EIIFSP", EIIFSP.class);
            result.getTypeChange().put("EIMostRecentServicePlanServiceResult", EIMostRecentServicePlanServiceResult.class);
            result.getTypeChange().put("EIServicePlanHistoryServiceResult", EIServicePlanHistoryServiceResult.class);
            result.getTypeChange().put("EIStatusServiceResult", EIStatusServiceResult.class);
            result.getTypeChange().put("Event", Event.class);
            result.getTypeChange().put("HearingScreeningDispositionServiceResult", HearingScreeningDispositionServiceResult.class);
            result.getTypeChange().put("HearingScreeningHistoryServiceResult", HearingScreeningHistoryServiceResult.class);
            result.getTypeChange().put("HearingScreeningMCRServiceResult", HearingScreeningMCRServiceResult.class);
            result.getTypeChange().put("HearingScreeningStatusServiceResult", HearingScreeningStatusServiceResult.class);
            result.getTypeChange().put("IFSPService", IFSPService.class);
            result.getTypeChange().put("ImmunizationEvent", ImmunizationEvent.class);
            result.getTypeChange().put("ImmunizationHistoryServiceResult", testing.common.ppServiceResult.ImmunizationHistoryServiceResult.class);            							
            result.getTypeChange().put("ImmunizationStatusData", ImmunizationStatusData.class);
            result.getTypeChange().put("ImmunizationStatusServiceResult", ImmunizationStatusServiceResult.class);
            result.getTypeChange().put("MostConclusiveResult", MostConclusiveResult.class);
            result.getTypeChange().put("NbsMailerResultsServiceResult", NbsMailerResultsServiceResult.class);
            result.getTypeChange().put("NbsResult", NbsResult.class);
            result.getTypeChange().put("PersonServiceResult", PersonServiceResult.class);
            result.getTypeChange().put("ServiceResult", ServiceResult.class);
            result.getTypeChange().put("RiskFactorForHearingServiceResult", VSRiskFactorForHearingServiceResult.class);
            result.getTypeChange().put("UDPClientProfile", UDPClientProfile.class);

            // list types
            
            result.getTypeChange().put("AddressDataList", new ArrayList<AddressData>().getClass() );
            result.getTypeChange().put("PersonDataList", new ArrayList<PersonData>().getClass() );
            result.getTypeChange().put("PhoneDataList", new ArrayList<PhoneData>().getClass() );
            result.getTypeChange().put("EmailDataList", new ArrayList<EmailData>().getClass() );
            result.getTypeChange().put("ServiceResultList", new ArrayList<ServiceResult>().getClass() );
            result.getTypeChange().put("AlertDataList", new ArrayList<AlertData>().getClass() );
            result.getTypeChange().put("EIAssessmentList", new ArrayList<EIAssessment>().getClass() );
            result.getTypeChange().put("EIAssessmentMethodList", new ArrayList<EIAssessmentMethod>().getClass() );
            result.getTypeChange().put("IFSPServiceList", new ArrayList<IFSPService>().getClass() );
            result.getTypeChange().put("EIIFSPList", new ArrayList<EIIFSP>().getClass() );
            result.getTypeChange().put("TestList", new ArrayList<Test>().getClass() );
            result.getTypeChange().put("MostConclusiveResultList", new ArrayList<MostConclusiveResult>().getClass() );
            result.getTypeChange().put("ImmunizationEventList", new ArrayList<ImmunizationEvent>().getClass() );
            result.getTypeChange().put("ImmunizationStatusDataList", new ArrayList<ImmunizationStatusData>().getClass() );
            result.getTypeChange().put("NbsResultList", new ArrayList<NbsResult>().getClass() );
            result.getTypeChange().put("AlternateIDList", new ArrayList<AlternateID>().getClass() );
            result.getTypeChange().put("NbsSampleCardServiceResult", NbsSampleCardServiceResult.class);
            result.getTypeChange().put("NbsSample" , NbsSample.class);

            return result;
        }
    }


