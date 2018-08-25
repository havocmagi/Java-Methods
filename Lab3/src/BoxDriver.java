public class BoxDriver 
{
	public static void main( String[] args )
	{
	Box box1 = new Box(); // this references the no-arg constructor
	Box box2 = new Box(20., 30., 40., "green");
	// Instantiate an object of type Box and name it box3. Set the dimensions
	// to be height = 18, width = 36, depth = 18. The color is blue.
	Box box3 = new Box(18.,36.,18., "blue");
	// Instantiate an object of type Box using the copy constructor. Name the object
	// box4. box4 should be a deep copy of box3.
	Box box4 = new Box(box3);
	// Change the box color for box1 to red:
	box3.changeBox(18.,36.,18.,"red");
	// Change the width dimension of box1 to 24.
	box1.changeBox(12.,24.,12.,"white");
	// Display the surface area of each box and label your output by box color.
	System.out.println("SurfaceArea of white box = " + box1.area());
	System.out.println("Surface Area of green box = " + box2.area());
	System.out.println("Surface Area of red box = " + box3.area());
	System.out.println("Surface Area of red box = " + box4.area());
	// Display the total surface area of all the combined boxes:
	System.out.println("The total area of all the boxes is:"+ box1.area() + box2.area() + box3.area() + box4.area());
	// Display the volume of each box and label the box by color:
	System.out.println("Volume of white box = " + box1.volume());
	System.out.println("Volume of green box = " + box2.volume());
	System.out.println("Volume of red box = " + box3.volume());
	System.out.println("Volume of red box = " + box4.volume());
	// Display the total storage volume of all the combined boxes:
	System.out.println("The total area of all the boxes is:"+ box1.volume() + box2.volume() + box3.volume() + box4.volume());
	// Change the color of box4 to yellow and change its height to 15.
	box4.changeBox(15.,36.,18., "yellow");
	// Use the Box toString method to show the state of each object.
	System.out.println(box1.toString());
	System.out.println(box2.toString());
	System.out.println(box3.toString());
	System.out.println(box4.toString());
	} 
}

