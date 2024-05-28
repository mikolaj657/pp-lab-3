import geometry.Circle;
import geometry.ColoredCircle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        // Tworzenie tablicy obiektów typu Circle
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(new Point(0, 0), 5.0);
        circles[1] = new Circle(new Point(2, 2), 3.0);
        circles[2] = new Circle(new Point(-3, 1), 4.0);

        // Tworzenie tablicy obiektów typu ColoredCircle
        ColoredCircle[] coloredCircles = new ColoredCircle[2];
        coloredCircles[0] = new ColoredCircle(new Point(1, -1), 6.0, "red");
        coloredCircles[1] = new ColoredCircle(new Point(-2, -2), 2.5, "green");

        // Iteracja po tablicy obiektów typu Circle
        System.out.println("Obwody kół:");
        for (Circle circle : circles) {
            System.out.println("Obwód: " + circle.calculatePerimeter());
        }

        // Iteracja po tablicy obiektów typu ColoredCircle
        System.out.println("\nObwody kolorowych kół:");
        for (ColoredCircle coloredCircle : coloredCircles) {
            System.out.println("Obwód: " + coloredCircle.calculatePerimeter());
            System.out.println("Kolor: " + coloredCircle.getColor());
        }
    }
}
