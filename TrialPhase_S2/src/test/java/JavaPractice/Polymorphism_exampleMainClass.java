package JavaPractice;

public class Polymorphism_exampleMainClass {
    public static void main(String[] args) {
        Polymorphism_example circle = new Circle(5);
        Polymorphism_example rectangle = new Rectangle(4, 6);
        Polymorphism_example triangle = new Triangle(3, 7);

        System.out.println("Area of the circle: " + circle.calculateArea());
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
        System.out.println("Area of the triangle: " + triangle.calculateArea());
    }
}