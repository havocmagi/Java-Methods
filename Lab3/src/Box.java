public class Box 
{
	// These are the declarations for the private instance fields:
	private String color_ ;
	private double height_ ;
	private double width_ ;
	private double depth_;
	
	// This is the no-argument constructor.
	public Box()
	{
		color_="white";
		height_=12.;
		width_=12.;
		depth_=12.;
	}
	
	// Complete the next constructor; it should have formal input parameters
	// for the height, width, depth, and color respectively.
	public Box(double h, double w, double d, String c) 
	{
		height_=h;
		width_=w;
		depth_=d;
		color_=c;
	}
	
	// Write a copy constructor for the Box class here:
	public Box(Box b)
	{
		height_=b.getHeight();
		width_=b.getWidth();
		depth_=b.getDepth();
		color_=b.getColor();
	}
	
	// Write accessor-methods for each private instance field (getter-methods).
	// Write mutator-methods for each private instance field (setter-methods).
	public double getHeight()
	{
		return height_;
	}
	
	public void setHeight(double h_)
	{
		height_=h_;
	}
	
	public double getWidth()
	{
		return width_;
	}
	
	public void setWidth(double w_)
	{
		width_=w_;
	}
	
	public double getDepth()
	{
		return depth_;
	}
	
	public void setDepth(double d_)
	{
		depth_=d_;
	}
	
	public String getColor()
	{
		return color_;
	}
	
	public void setString(String c_)
	{
		color_=c_;
	}
	
	// changes parameters of box
	public void changeBox(double ch, double cw, double cd, String cc)
	{
		height_=ch;
		width_=cw;
		depth_=cd;
		color_=cc;
	}
	
	// Write separate methods for computing the area and the volume.
	public double area()
	{
		return 2*(height_*width_)+ 2*(depth_*width_) + 2*(depth_*height_);
	}
	
	public double volume()
	{
		return height_*width_*depth_;
	}
	
	// Write a method named toString to return all the instance fields as a String.
	// Use concatenation to build the String.
	public String toString()
	{
		return "Height = " + height_ + ", Width = " + width_  + ", Depth = " + depth_ + ", Color = " + color_
				+ ", Area = " + this.area() + ", Volume = " + this.volume();
	}
}
