public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        Triangle triangle1 = new Triangle(12, 8, 9);
        System.out.println(triangle1);

        Triangle triangle2 = new Triangle();
        triangle2.setColor();
        triangle2.setSide1();
        triangle2.setSide2();
        triangle2.setSide3();
        System.out.println(triangle2);
    }
}
