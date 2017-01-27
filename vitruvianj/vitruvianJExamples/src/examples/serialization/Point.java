package examples.serialization;


import java.util.ArrayList;
import java.util.List;

import vitruvianJ.serialization.OptimisticSerialization;
import vitruvianJ.serialization.Serialize;


public class Point{

		
	public Long x = new Long(0);
	
	
	public Long y = new Long(0);
	
	
	public List<Point> point = new ArrayList<Point>();
	
	
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
	public List<Point> getPoint()
	{
		return point;
	}
	
	@Serialize
	public void setPoint(List<Point> val)
	{
		point = val;
	}
	
}
