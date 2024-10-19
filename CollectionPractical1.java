import java.util.Collection;
import java.util.LinkedList;

class CollectionPractical1{
	public CollectionPractical1(){
		Collection <Integer> c = new LinkedList<>();
		c.add(5);
		c.add(7);
		c.add(3);
		c.add(2);
		c.add(9);
		
		if (c.isEmpty()) {
			System.out.println("The collection is empty");
		}else{
			System.out.println("The collection is not empty");
		}
		
		int size = c.size();
		System.out.println("The size of the collection: "+size);
		
		
		int elementToCheck = 5;
		if (c.contains(elementToCheck)) {
			System.out.println("The collection contains: "+elementToCheck);
		}else {
			System.out.println("The collection does not contain: "+elementToCheck);
		}
		c.remove(2);
		System.out.println(c);
	
	}

	public static void main(String[]args){
		new CollectionPractical1();
	}





}	



	
