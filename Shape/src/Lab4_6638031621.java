abstract class Shape {
    protected String color;
    public Shape(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public abstract double getArea();
    public abstract void printDetails();
    public abstract void resize(double factor);

}

class Square extends Shape {
    private double length;
    private double area;

    public Square(String color, double length) {
        super(color);
        this.length = length;
    }

    public double getArea() {
        area = length * length;
        return area;
    }

    public void printDetails() {
        System.out.println("Shape: " + "Square");
        System.out.println("Color: " + super.getColor());
        System.out.println("Side Length: " + length);
        System.out.println("Area: " + getArea());
        System.out.println("----------------------");
    }

    public void resize(double factor) {
        this.length = this.length * factor;
    }

}

class Rectangle extends Shape{
    private double width;
    private double height;
    private double area;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        area = width * height;
        return area;
    }

    public void printDetails() {
        System.out.println("Shape: " + "Rectangle");
        System.out.println("Color: " + super.getColor());
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
        System.out.println("----------------------");
    }
    public void resize(double factor) {
        this.width = this.width * factor;
        this.height = this.height * factor;
    }

}

class Circle extends Shape{
    private double radius;
    private double area;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    public double getArea() {
        area = Math.PI * radius * radius;
        return area;
    }
    public void printDetails() {
        System.out.println("Shape: " + "Circle");
        System.out.println("Color: " + super.getColor());
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("----------------------");
    }
    public void resize(double factor) {
        this.radius = this.radius * factor;
    }

}

public class Lab4_6638031621 {
    public static void main(String[] args) throws Exception {
        Square s1 = new Square("Red", 5);
        s1.printDetails();
        Square s2 = new Square("Yellow", 8);
        s2.printDetails();
        Rectangle r1 = new Rectangle(10, 10, "Green");
        r1.printDetails();
        Rectangle r2 = new Rectangle(15, 15, "Purple");
        r2.printDetails();
        Circle c1 = new Circle("Blue", 10);
        c1.printDetails();
    }
}
