package testing.unitTests.vitruvianJ;


import junit.framework.TestCase;

import org.apache.log4j.Level;
import org.apache.log4j.xml.DOMConfigurator;

import vitruvianJ.core.PathUtilities;
import vitruvianJ.logging.JLogger;


public class JLoggerTest extends TestCase {

	
	JLogger logger;
	
		

	
	public void tearDown() throws Exception {
	}

	
	
//Test for Logger Debug Level
	
    public void testLoggerDebug_T01()
    {
        //Initialize the logger  
    	//DOMConfigurator.configure(PathUtilities.GetAbsolutePath("VitruvianJ_CLogger_console.xml"));
    	DOMConfigurator.configure(PathUtilities.GetAbsolutePath("VitruvianJ_CLogger.xml"));
        JLogger _logger = new JLogger(JLogger.class);            
        _logger.Mandatory(Level.DEBUG, "hi");
        assertTrue(_logger.IsDebugEnabled());
        assertNotNull(_logger);
    }
          
    //Test for Logger Warn Level
	
    public void testLoggerWarn_T02()
    {
        //Initialize the logger  
    	DOMConfigurator.configure(PathUtilities.GetAbsolutePath("VitruvianJ_CLogger.xml"));
        JLogger _logger = new JLogger(JLogger.class);
        //_logger.Warn("hi");
        //_logger.Mandatory(Level.WARN, "hi");
        assertNotNull(_logger);
    }

    
    //Test for Logger Info Level	
    public void testLoggerInfo_T03()
    {
        //Initialize the logger
    	DOMConfigurator.configure(PathUtilities.GetAbsolutePath("VitruvianJ_CLogger.xml"));
        JLogger _logger = new JLogger(JLogger.class);
        _logger.Info("hi");
        _logger.Mandatory(Level.INFO, "hi");
        assertNotNull(_logger);
    }

	
    public void testDebugEnabled_T04()
	{		
    	
    	DOMConfigurator.configure(PathUtilities.GetAbsolutePath("VitruvianJ_CLogger.xml"));
		Object message = "Ali Raza";
		logger = new JLogger();
		logger.TestLogger();
		logger.Debug(message);
		assertEquals(logger.IsDebugEnabled(),true);
		//assertEquals((String)message,"Ali Raza");
	}
	
	public void testMandatory_T05()
	{
		Object message = "Ali Raza";
		logger = new JLogger();
		logger.TestLogger();
		logger.Mandatory(logger.getLevel(), message);
		assertEquals(logger.getLevel(), Level.DEBUG);
		//assertEquals(logger.IsInfoEnabled(), true);
	}
}
