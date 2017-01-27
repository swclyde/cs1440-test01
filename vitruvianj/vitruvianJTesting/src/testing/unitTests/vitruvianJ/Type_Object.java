package testing.unitTests.vitruvianJ;

import vitruvianJ.*;
import vitruvianJ.serialization.*;

    public class Type_Object implements java.io.Serializable
    {    	
        private Integer int_var = 0;        
        private Boolean bool_var = true;     
        private Long long_var = new Long(0);        
        private String string_var;              
        private Double double_var = new Double(0);      
        private Float float_var = new Float(0);


        @Serialize
        public Integer getInt_Var()
        {
        	return int_var;
        }
        
        @Serialize
        public void setInt_Var(Integer value)            
        {
            int_var = value;
        }
    
        
        @Serialize
        public Boolean getBool_Var()
        {         
        	return bool_var;
        }
        @Serialize
        public void setBool_Var(Boolean value)
        {
            bool_var = value;
        }


        @Serialize
        public Long getLong_Var()
        {         
            return long_var;
        }
        @Serialize
        public void  setLong_Var(Long value)
        {
                long_var = value;
        }
        
        
        @Serialize
        public String getString_Var()
        {         
            return string_var;
        }
        @Serialize
        public void setString_Var(String value)
        {
                string_var = value;
        }
        
        
        
        
        @Serialize
        public Double getDouble_Var()
        {
            return double_var;
        }
        @Serialize
        public void  setDouble_Var(Double value)
        {
                double_var = value;
        }
    
        
        @Serialize
        public Float getFloat_Var()
        {    
            return float_var;
        }
        @Serialize
        public void setFloat_Var(Float value)
        {
                float_var = value;        
        }
    }

