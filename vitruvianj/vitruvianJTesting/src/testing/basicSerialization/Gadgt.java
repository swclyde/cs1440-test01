package testing.basicSerialization;



import vitruvianJ.serialization.*;


    
    public class Gadgt implements java.io.Serializable
    {
    	/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private String label = "";
    	private String description = "";
    	private Integer weight = 0;
    	private Integer height = 0;
    	
        public Gadgt(String label, String description, int weight, int height)
        {
            this.setLabel(label);
            this.setDescription(description);
            this.setWeight(weight);
            this.setHeight(height);
        }

        public Gadgt()
        {}
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
		public void setWeight(int weight) {
			this.weight = weight;
		}
        @Serialize
		public Integer getWeight() {
			return weight;
		}
        @Serialize
		public void setHeight(Integer height) {
			this.height = height;
		}
        @Serialize
		public Integer getHeight() {
			return height;
		}

        
    }


