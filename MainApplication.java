package objectandclasses;

public class MainApplication {
	 
	public static void main(String[] args) {
		
		Car car = new Car(4, "Honda");
		Truck truck = new Truck(10, "Hyundai");
		car.startEngine();
		car.refuel();
		truck.startEngine();
		truck.refuel();
		destroyVehicle(car);
		destroyVehicle(truck);
 
	}
    public static void destroyVehicle(Vehicle v) {
        v.destroy();
    }
 
}
