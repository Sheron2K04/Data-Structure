import java.util.Collection;
import java.util.LinkedList;

public class CollectionPractical1 {
    public static void main(String[] args) {
        // Declare and initialize Collection as LinkedList
        Collection<Integer> c = new LinkedList<>();
        
        // Add five integer elements
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);
        
        // Check if the collection is empty and print the result
        System.out.println("Is the collection empty? " + c.isEmpty());
        
        // Print the size of the collection
        System.out.println("Size of the collection: " + c.size());
        
        // Check if the collection contains a specific element (e.g., 30) and print the result
        int checkElement = 30;
        System.out.println("Does the collection contain " + checkElement + "? " + c.contains(checkElement));
        
        // Remove a specific element (e.g., 20) from the collection
        c.remove(20);
        
        // Display the remaining elements of the collection
        System.out.println("Remaining elements in the collection: " + c);
    }
}
