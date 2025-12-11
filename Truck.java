package objectandclasses;

public class Truck extends Vehicle implements Refuelable {
	public Truck(int numberOfWheels, String brand) {
		super(numberOfWheels, brand);
	}
	
	@Override
	void startEngine() {
		System.out.println("Starting Truck.");
		System.out.println(this + " engine started");
    }
	
	@Override
	public void refuel() {
		System.out.println("Refueling Truck.");
		System.out.println(this + "Truck refueled");
	}

}
