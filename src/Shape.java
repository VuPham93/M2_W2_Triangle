import java.util.Scanner;

public class Shape {
    private int side = 5;
    private String color = "blue";
    Scanner sc = new Scanner(System.in);

    public Shape() {

    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public void setColor() {
        System.out.print("Please enter the color: ");
        color = sc.nextLine();
    }

    public String getColor() {
        return color;
    }

    public double setLength() {
        System.out.print("Please enter the length: ");
        return sc.nextInt();
    }

    @Override
    public String toString() {
        return "The shape has " + getSide() + " sides and "
                 + getColor() + " color ";
    }
}
