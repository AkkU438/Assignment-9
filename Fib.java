public class Fib {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Fib <number_of_terms>");
            return;
        }
        
        int n = Integer.parseInt(args[0]);
        int lastFibNumber = fibonacci(n + 1);
        
        System.out.println("Last Fibonacci number: " + lastFibNumber);
    }

    public static int fibonacci(int n) {
        int[] fibSequence = new int[n];
        if (n >= 1) {
            fibSequence[0] = 0;
        }
        if (n >= 2) {
            fibSequence[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];
        }
        return fibSequence[n-1]; // Return the last element of the sequence
    }
}
    