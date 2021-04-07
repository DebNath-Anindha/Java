import java.lang.*;

public class Rectangle
{
	private double length;
	private double width;
	
	public Rectangle()
	{
		System.out.println ("empty"); 
	}
	public Rectangle (double length,double width)
	{
		System.out.println("para");
		this.length=length;
		this.width=width;
		
	}
	public void setLength(double length)
	{
		this.length=length;
	}
	public void setWidth(double width)
	{
		this.width=width;
	}
	public double getLength()
	{
		return length;
	}
	public double getWith()
	{
		return width;
	}
	public double getArea()
	
    {
		return length*width;
	}
     
	 
	 {
		 System.out.println("length: "+length);
		 System.out.println("width: "+width);
		
		 
		 
	 } 
	

	
}