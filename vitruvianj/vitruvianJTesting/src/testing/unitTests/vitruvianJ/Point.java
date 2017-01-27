package testing.unitTests.vitruvianJ;


import java.util.ArrayList;
import java.util.List;

import vitruvianJ.serialization.OptimisticSerialization;
import vitruvianJ.serialization.Serialize;


public class Point{

	@Serialize	
	public Long x = new Long(0);
	
	@Serialize
	public Long y = new Long(0);
	
	@Serialize
	public List<Point> point = new ArrayList<Point>();
	
	
	
	public Long getX()
	{
		return x;
	}
	
	
	public void setX(Long val)
	{
		x = val;
	}
	
	
	public Long getY()
	{
		return y;
	}
	
	
	public void setY(Long val)
	{
		y = val;
	}

	
	
	public List<Point> getPoint()
	{
		return point;
	}
	
	
	public void setPoint(List<Point> val)
	{
		point = val;
	}
	
}
