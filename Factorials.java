public class Factorials {
    public static void main(String[] args) {
        int n = 10;
        int factorial = 1;
        for(int i = 1; i <= n; i++) {
            factorial *= i;


            System.out.println("The factorial of " + i + " is " + factorial);
        }
    }
}
