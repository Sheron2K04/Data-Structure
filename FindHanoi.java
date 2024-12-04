public class FindHanoi {
    public static void Hanoi(char src, char des, char aux, int n) {
        
        if (n == 1) {
            System.out.println("Move disc from " + src + " to " + des);
            return;
        }
        
        
        Hanoi(src, aux, des, n - 1);
        
        
        System.out.println("Move disc from " + src + " to " + des);
        
        
        Hanoi(aux, des, src, n - 1);
    }

    public static void main(String[] args) {
        int noOfDisks = 4;
        
        Hanoi('A', 'B', 'C', noOfDisks);
    }
}
