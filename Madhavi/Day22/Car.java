package package20;

class Tyre{
	
}
public class Car {

	Tyre tyre;					// 1 reference 

	String name;

	public static void main(String[] args) {

	Car carMain = new Car();				// 1 reference in stack and 1 obj in heap

	carMain.setFeatures(carMain);

	
	}

	void setFeatures(Car car) {

	tyre = new Tyre();						// 1 obj of Tyre() stored in heap

	car.setName("Swift");

	}

	public void setName(String name) {

	this.name = name;

	}
}
