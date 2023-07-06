public class TriangleTester {
    public static boolean isTriangle(int a, int b, int c) {
        // Check if the sum of any two sides is greater than the third side
        return a + b > c && b + c > a && a + c > b;
    }
}