import java.util.LinkedList;

class SequencedCollection1 {
    public SequencedCollection1() {
        LinkedList<Integer> sc = new LinkedList<>();
        sc.addFirst(5); 
        sc.addFirst(2); 
        sc.addLast(3);  
        System.out.println(sc.getFirst());
        System.out.println(sc.removeLast()); 
        System.out.println(sc); 
        System.out.println(sc.descendingIterator()); 
    }

    public static void main(String[] args) {
        new SequencedCollection1();
    }
}
