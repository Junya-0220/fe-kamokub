public class Main {
    public static void main(String[] args) {

        System.out.println(calc(32, 12));
    }

    private static double calc(double x, double y) {
        return Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5);
    }
}