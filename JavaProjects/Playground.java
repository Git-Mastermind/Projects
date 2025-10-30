public class Playground {
    public static int factorial(int n) {
        if (n == 1) {
            return n;
        }
        else {
            return n - factorial(n - 1);
        }
    }

    public static int fibbanoci(int n) {
        if (n == 0) {
            return n;
        }
        else {
            return fibbanoci(n - 1) + fibbanoci(n - 2);
        }
    }
    public static void main(String[] args) {
        int result = fibbanoci(5);
        System.out.println(result);
    } 
}
