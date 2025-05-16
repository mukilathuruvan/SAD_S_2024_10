package SOLID;

public class OCP_02 {
 /*
     * TASK:
     * (classical task)
     * How to add other shapes without violating the OCP
     * (Open/Closed Principle)?
     * The interface/class/method bodies are empty by purpose
     * and there is no main provided.
     */


    // closed for modification 
    // at the same time we can add new shaped without changing this abstract class 
    public static abstract class Shape {
        abstract double getArea();
    }

    public static class Square extends Shape {
        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        double getArea() {
            return this.side * this.side;
        }
    }

    public static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    public static class AreaCalculator {
        public double getArea(Shape shape) {
            double areaOfShape = shape.getArea();
            return areaOfShape;
        }
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        Square square = new Square(5);
        Circle circle = new Circle(10);

        System.out.println("The area of the square is:" + calculator.getArea(square));
        System.out.println("The area of the circle is:" + calculator.getArea(circle));
    }
}
