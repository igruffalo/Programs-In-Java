
public class Fibonacci {
    public static void itrFibonacci(int n) {
        int firstTerm = 0;
        int secondTerm = 1;
        for(int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
