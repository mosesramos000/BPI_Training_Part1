package objectandclasses;

public class M2_Activity4_MSExcel implements M2_Activity4_Executable {
	
	@Override
	public void run() {
		String message = "Öpening MS Excel...";
		System.out.println(message);
	}
	
	@Override
	public void stop() {
		String message = "Stopping MS Excel...";
		System.out.println(message);
	}

}
