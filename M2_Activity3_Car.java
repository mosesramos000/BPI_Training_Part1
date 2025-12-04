package objectandclasses;

public class M2_Activity3_Car {
	private String brand;
	private String model;
	
	public M2_Activity3_Car() {
		this.brand = "Default Brand";
		this.model = "Default Model";
	}
	
	public M2_Activity3_Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
	 	this.brand = brand;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public void getCarDetails() {
		System.out.println("----------------------");
		System.out.println("Car Brand is " + brand);
		System.out.println("Car Model is " + model);
	}


}
