package objectandclasses;

public class M2_Activity4_MSWord implements M2_Activity4_Executable {

	@Override
	public void run() {
		String message = "Öpening MS Word...";
		System.out.println(message);
	}
	
	@Override
	public void stop() {
		String message = "Stopping MS Word...";
		System.out.println(message);
	}

}
