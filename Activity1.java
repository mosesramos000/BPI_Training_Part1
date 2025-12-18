package module3;

import java.util.ArrayList;
import java.util.Scanner;
public class Activity1 {
	
	private ArrayList<String> list=new ArrayList<>();
	private String findproduct;
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		Activity1 product=new Activity1();
		product.productList();
		product.updateproductList();
		product.searchproduct(sc);
	}
	
	//method
	public void productList()
	{
		list.add("Laptop");
		list.add("Mouse");
		list.add("Keyboard");
		list.add("Monitor");
		list.add("Printer");
		int i=1;
		System.out.println("All Products:");
		for(String list1:list)
		{	
			System.out.println(i+". "+list1);
			i++;
		}
	}
	
	public void updateproductList()
	{
		list.add("Webcam");
		list.remove("Mouse");
 
		int i=1;
		System.out.println("\nAfter adding/removing Products:");
		for(String list1:list)
		{	
			System.out.println(i+". "+list1);
			i++;
 
		}
	}
	
	public void searchproduct(Scanner sc)
	{
		System.out.print("\nEnter product name to search:");
		findproduct=sc.nextLine();
 
		boolean found = false;
        int foundIndex = -1;
 
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
 
            if (name.equalsIgnoreCase(findproduct)) {
                found = true;
                foundIndex = i;
                break;
            }
        }
 
        if (found)
        {
            System.out.println("Product found:" + list.get(foundIndex));
        }
        else
        {
            System.out.println("Product not found: "+findproduct);
        }
 
		
	}
}
