package typecastingandparsing;
import java.util.Scanner;
public class M1_Activity2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age");
		String age=sc.nextLine();
		int ageint=Integer.parseInt(age);
		double agedouble=ageint;
		
		System.out.println("Your age in int:"+ageint);
		System.out.println("Your age in double:"+agedouble);
		
		sc.close();
	}

}
