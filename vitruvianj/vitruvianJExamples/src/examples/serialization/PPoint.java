package examples.serialization;


import java.util.ArrayList;
import java.util.List;

import vitruvianJ.serialization.OptimisticSerialization;
import vitruvianJ.serialization.Serialize;


public class PPoint {

		
	private Long x = new Long(0);
	
	
	private Long y = new Long(0);
	
	
	private List<PPoint> pPoint = new ArrayList<PPoint>();
	
	
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
		return pPoint;
	}
	
	@Serialize
	public void setPPoint(List<PPoint> val)
	{
		pPoint = val;
	}
	
}
