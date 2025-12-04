package your.name;

import java.util.Scanner;

public class M1_Activity1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name=sc.nextLine();
		System.out.println("Hello, " + name + "!");
		sc.close();
		
	}
}


