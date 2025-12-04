package conditional;
import java.util.Scanner;
public class M1_Activity4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your age:");
		int age=sc.nextInt();
		
		if (age <18)
		{
			System.out.print("Minor");
		}
		else if (age >= 18 && age <=59)
		{
			System.out.print("Adult");
		}
		else
			System.out.print("Senior");
		
		sc.close();
	}
}
