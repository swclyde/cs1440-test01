package examples.serialization;
import vitruvianJ.services.ServiceRegistry;


public class TestSerializationService {
	
	public static void main(String args[])
	{
		try
        {			
			
            ServiceRegistry.Load();              
	        ServiceRegistry.Init();	        
	        ServiceRegistry.Run();
	        ServiceRegistry.Cleanup();
            
        }
        catch (Exception ex)
        {
        	ex.printStackTrace();
        }						
	}	
}
