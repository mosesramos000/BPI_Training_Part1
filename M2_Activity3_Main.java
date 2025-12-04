package objectandclasses;

public class M2_Activity3_Main {
	public static void main(String[] args) {
		
		M2_Activity3_Car myCar = new M2_Activity3_Car();
		
		myCar.setBrand("Toyota");
		myCar.setModel("Veloz");
		myCar.getCarDetails();
		
		
		M2_Activity3_Car myCar2 = new M2_Activity3_Car("Honda", "Civic");
		myCar2.getCarDetails();
	}

}
