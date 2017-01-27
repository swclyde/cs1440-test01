package testing.unitTests.vitruvianJ;
import java.util.ArrayList;

import org.w3c.dom.Document;

import testing.common.ppQueryResult.QueryResult;
import testing.common.ppServiceResult.*;
import vitruvianJ.core.PathUtilities;
//import vitruvianJ.logging.GUID;
import vitruvianJ.logging.JGUID;
import vitruvianJ.serialization.xml.XmlFramework;
import vitruvianJ.services.*;


public class TestingService implements IRunnable{

	@Override
	public void Run() {
		System.out.println(" Testing Service - Run() ");

		TestMethodPoint();
		//test_query_result();
		//TestPoint();
		//imm_result();
		
	}

	
	void test_query_result()
    {
		
        QueryResult q_result = new SampleImmServiceQueryResult().testQueryBuilder();

        Document pointDoc = XmlFramework.Serialize(q_result);
        
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("q_result.xml"), pointDoc);


        System.out.println("===============Serializer ==========================");
        System.out.println("Query Result - programChildID : " + q_result.getProgramChildID());
        System.out.println(" ==========================");
        
        /*
        String filename = PathUtilities.GetAbsolutePath("q_result.xml");
        XmlFramework.AddTypeChange("QueryResult", common.ppQueryResult.QueryResult.class);
        QueryResult query_result = (QueryResult)XmlFramework.Deserialize(filename);
        System.out.println("===============Derializer ==========================");
        */
        

    }
	
	 void imm_result()
     {
         ImmunizationHistoryServiceResult im_result = new ImmunizationHistoryServiceResult();
         
         ImmunizationEvent imm_event = new ImmunizationEvent();
         imm_event.setContraindicationFlag("c_flag");
         imm_event.setExemptFlag("e_flag");
         imm_event.setProviderName("usu");

         im_result.setImmunizationEventList(new ArrayList<ImmunizationEvent>());
         im_result.getImmunizationEventList().add(imm_event);


         Document pointDoc = XmlFramework.Serialize(im_result);
         
 		 XmlFramework.Save(PathUtilities.GetAbsolutePath("imm_result.xml"), pointDoc);
           		 
         System.out.println("===============Derializer ==========================");
         System.out.println("contraindicationFlag " + im_result.getImmunizationEventList().get(0).getContraindicationFlag() + "  providerName " + im_result.getImmunizationEventList().get(0).getProviderName());
         System.out.println(" ==========================");
     }
	void TestPoint()
	{	
	        Point p1 = new Point();
	        p1.x = new Long(3);
	        p1.y = new Long(30);
	        
	        Point p2 = new Point();
	        p2.x = new Long(4);
	        p2.y = new Long(40);
	        
	        p1.point.add(p2);
	        
	        //p.immunizationEventList.add(p2);
		Document pointDoc = XmlFramework.Serialize(p1);
		XmlFramework.Save(PathUtilities.GetAbsolutePath("_point.xml"), pointDoc);
		
		
		
		String filename = PathUtilities.GetAbsolutePath("_point.xml");
		XmlFramework.AddTypeChange("POINT", testing.unitTests.vitruvianJ.Point.class);
		Point point = (Point)XmlFramework.Deserialize(filename);
		System.out.println("X " + point.x + "  Y " + point.y);
		System.out.println("X " + point.point.get(0).x + "  Y " + point.point.get(0).y);
		
		
	}
	
	void TestMethodPoint()
	{	
	        PPoint p1 = new PPoint();
	        p1.setX(new Long(3));
	        p1.setY(new Long(30));
	        
	        PPoint p2 = new PPoint();
	        p2.setX(new Long(4));
	        p2.setY(new Long(40));
	        
	        p1.getPPoint().add(p2);
	        
	        //p.immunizationEventList.add(p2);
		Document pointDoc = XmlFramework.Serialize(p1);
		XmlFramework.Save(PathUtilities.GetAbsolutePath("_point.xml"), pointDoc);
		
		
		
		String filename = PathUtilities.GetAbsolutePath("_point.xml");
		XmlFramework.AddTypeChange("PPOINT", PPoint.class);
		PPoint point = (PPoint)XmlFramework.Deserialize(filename);
		System.out.println("X " + point.getX()+ "  Y " + point.getY());
		System.out.println("X " + point.getPPoint().get(0).getX() + "  Y " + point.getPPoint().get(0).getY());
		
		
	}
	@Override
	public void Cleanup() {
		System.out.println(" Testing Service - Cleanup() ");
		
	}

	@Override
	public void Init() {
		System.out.println(" Testing Service - Init() ");
		
	}

	@Override
	public JGUID getId() {
		System.out.println(" Testing Service - getId() ");
		return null;
	}

	@Override
	public String getName() {
		System.out.println(" Testing Service - getName() ");
		return "Testing Service";
	}
	
	
		
	
}
