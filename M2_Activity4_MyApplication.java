package objectandclasses;

public class M2_Activity4_MyApplication {
	public static void main(String[] args) {
		M2_Activity4_Executable excel = new M2_Activity4_MSExcel();
		M2_Activity4_Executable word = new M2_Activity4_MSWord();
		
		runProgram(excel);
		runProgram(word);
		
		stopProgram(excel);
		stopProgram(word);
	}
	
	private static void runProgram(M2_Activity4_Executable executableProgram) {
		executableProgram.run();
	}
	private static void stopProgram(M2_Activity4_Executable executableProgram) {
		executableProgram.stop();
	}
}
