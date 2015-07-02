
public class Box {

	double width;
	double height;
	double depth;
	
	Box(double w, double h, double d) {
	width = w;
	height = h;
	depth = d;
	}
	
	//String toString( )
	
	public String toString() {
	return "Dimensions are " + width + "\\ " +
	depth + "\\" + height + ".";
	}
	}