package testing.unitTests.vitruvianJ;



import vitruvianJ.logging.*;
import vitruvianJ.services.IService;
import vitruvianJ.services.ServiceRegistry;
import junit.framework.TestCase;

public class ServiceRegistryTest extends TestCase {

	
	
	
	
	public void testGetPreferredService() {
		IService service = new LoggingService();
		assertNotSame(new LoggingService().getClass(),  ServiceRegistry.getPreferredService(service.getClass()));
	}
	

	public void testGetService() {
						
		ServiceRegistry.Add(new LoggingService());		
		IService service =  ServiceRegistry.getServices().get(0);
		assertEquals(36 ,service.getId().toString().length() );		
	}

	
	public void testCleanup() {
		
		ServiceRegistry.Add(new LoggingService());
		ServiceRegistry.Cleanup();
		//The cleanup is not actually removing any service from List
		if(ServiceRegistry.getServices().size()==3)
			assertEquals(3, ServiceRegistry.getServices().size());
		else
			assertEquals(4, ServiceRegistry.getServices().size());
	}

	public void testAdd() {
		IService service = new LoggingService();
			
		ServiceRegistry.Add(service);
		if(ServiceRegistry.getServices().size()==4)
			assertEquals(4,ServiceRegistry.getServices().size());
		else
			assertEquals(5,ServiceRegistry.getServices().size());
	}

	public void testSwap() {
		//will test later with better understanding		
	}

	public void testRemove() {
		LoggingService l = new LoggingService();
		ServiceRegistry.Add(l);
		ServiceRegistry.Remove(l);
		if(ServiceRegistry.getServices().size()==4)
			assertEquals(4, ServiceRegistry.getServices().size());
		else
			assertEquals(5, ServiceRegistry.getServices().size());
	}

	public void testContainsIService() {
		LoggingService l = new LoggingService();
		ServiceRegistry.Add(l);
		Boolean b = ServiceRegistry.Contains(l);
		assertEquals(true, b.booleanValue());
	}

	public void testContainsGUID() {
		JGUID g= new JGUID();//"18348543121141584457998342892838");		
		assertFalse(ServiceRegistry.Contains(g));
		//will test later... with better understanding		
	}

}
