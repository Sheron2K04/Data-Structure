public class FindFactorial {
    // Method to calculate factorial
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // Create an instance of FindFactorial
         
        FindFactorial obj = new FindFactorial();

        // Call the factorial method using the instance
        int result = obj.factorial(10);

        // Print the result
        System.out.println("Factorial is: " + result);
    }
}
