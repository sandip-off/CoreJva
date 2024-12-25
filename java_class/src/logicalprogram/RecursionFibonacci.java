package logicalprogram;

public class RecursionFibonacci {
    static int fib1 = 0, fib2 = 1; 
    static int count = 0;         

    public static void main(String[] args) {
        System.out.print(fib1 + " " + fib2 + " "); 
        pass();
    }

    static void pass() {
        if (count < 10) { 
            int fib3 = fib1 + fib2; 
            System.out.print(fib3 + " ");
            fib1 = fib2;
            fib2 = fib3;
            count++;

            // Recursive call
            pass();
        }
    }
}
