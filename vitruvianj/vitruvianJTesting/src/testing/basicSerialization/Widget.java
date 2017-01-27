package testing.basicSerialization;
import java.util.*;
import vitruvianJ.serialization.*;

   
    public class Widget implements java.io.Serializable
    {
    	/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private String label = "";
    	private String description = "";
    	private ArrayList<Gadgt> gadgtList = new ArrayList<Gadgt>();
    	
        public Widget(String label, String description)
        {
            this.label = label;
            this.description = description;
            setGadgtList(new ArrayList<Gadgt>());
        }

        
        public Widget()
        {
        	
        }
        public void Add(Gadgt gadget)
        {
        	gadgtList.add(gadget);
        }


        @Serialize
		public void setLabel(String label) {
			this.label = label;
		}


        @Serialize
		public String getLabel() {
			return label;
		}


        @Serialize
		public void setDescription(String description) {
			this.description = description;
		}


        @Serialize
		public String getDescription() {
			return description;
		}


        @Serialize
		public void setGadgtList(ArrayList<Gadgt> gadgtList) {
			this.gadgtList = gadgtList;
		}


        @Serialize
		public ArrayList<Gadgt> getGadgtList() {
			return gadgtList;
		}
    }

