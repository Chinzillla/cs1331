public class ConstantTest {
    public static void main(String[] args) {
        final double PI = 3.14159265359;
        final int radius = 4;

        double area = (double)(radius * radius) * PI;
        System.out.println(area);
    }
}