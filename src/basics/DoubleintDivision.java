package basics;

public class DoubleintDivision {
    public static void main(String[] args) {
        double x = 10;
        int y = 3;
        int z = 7;

        int a = z / y;
        System.out.println(a);
        double b = x / y;
        System.out.println(b);

        int c = (int) x / y; // cast x to int
        int d = (int) (x / y);
        System.out.println(c);
        System.out.println(d);

        double e = (double) (z / y);
        System.out.println(e);

    }
}
