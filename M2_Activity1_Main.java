package objectandclasses;



public class M2_Activity1_Main {

	public static void separator() {
		System.out.println("---------------------------------------");

	}
	public static void main(String[] args) {
		

		M2_Activity1_House myHouse = new M2_Activity1_House();
		myHouse.city = ("Laguna");
		myHouse.color = ("White");
		myHouse.floors = (3);
		
		myHouse.location();
		myHouse.paintColor();
		myHouse.numFloors();
		separator();
		
		M2_Activity1_Book myBook = new M2_Activity1_Book();
		myBook.title = ("Harry Potter");
		myBook.pages = (4100);
		
		myBook.bookTitle();
		myBook.numpages();
		separator();
		
		M2_Activity1_Tree myTree = new M2_Activity1_Tree();
		myTree.type = ("Mango");
		myTree.color = ("brown");
		
		myTree.treeType();
		myTree.trunkColor();
		
	}

}
