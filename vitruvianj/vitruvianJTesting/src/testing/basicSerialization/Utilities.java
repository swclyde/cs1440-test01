package testing.basicSerialization;

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
            result.getTypeChange().put(Gadgt.class, "Gadgt");
            result.getTypeChange().put(Widget.class, "Widget");
            result.getTypeChange().put(new ArrayList<Gadgt>().getClass() , "GadgtList");
            result.getTypeChange().put(new ArrayList<Widget>().getClass() , "WidgetList");
            

            return result;
        }

        static public XmlDeserializer GetDeserializer()
        {
            XmlDeserializer result = new XmlDeserializer();
            result.getTypeChange().put("Gadgt", Gadgt.class);
            result.getTypeChange().put("Widget", Widget.class);
            result.getTypeChange().put("GadgtList", new ArrayList<Gadgt>().getClass());
            result.getTypeChange().put("WidgetList", new ArrayList<Widget>().getClass());
            return result;
        }
    }


