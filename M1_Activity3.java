package methodandoperator;
import java.util.Scanner;
public class M1_Activity3 {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter first integer:");
	int first = sc.nextInt();
	
	System.out.print("Enter second integer:");
	int second = sc.nextInt();
	
	int sum = first + second;
	int difference = first - second;
	int product = first * second;
	
	System.out.println("Sum:" + sum);
	System.out.println("Difference:" + difference);
	System.out.println("Product:" + product);
	
	sc.close();
}
public static int SumNumber(int first, int second)
{
	return first + second;
}

public static int DiffNumber(int first, int second)
{
	return first - second;
}

public static int ProdNumber(int first, int second)
{
	return first * second;
} 

}
