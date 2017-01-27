package testing.unitTests.vitruvianJ;


import java.util.ArrayList;
import java.util.List;

import vitruvianJ.serialization.OptimisticSerialization;
import vitruvianJ.serialization.Serialize;


public class PPoint {

		
	private Long x = new Long(0);
	
	
	private Long y = new Long(0);
	
	
	private List<PPoint> ppoint = new ArrayList<PPoint>();
	
	
	@Serialize
	public Long getX()
	{
		return x;
	}
	
	@Serialize
	public void setX(Long val)
	{
		x = val;
	}
	
	@Serialize
	public Long getY()
	{
		return y;
	}
	
	@Serialize
	public void setY(Long val)
	{
		y = val;
	}

	
	@Serialize
	public List<PPoint> getPPoint()
	{
		return ppoint;
	}
	
	@Serialize
	public void setPPoint(List<PPoint> val)
	{
		ppoint = val;
	}
	
}
