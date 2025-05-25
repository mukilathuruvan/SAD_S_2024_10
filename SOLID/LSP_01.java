
public class LSP_01 {

    /*
     * TASK:
     * (classical example)
     *
     * The Square class does not behave like a Rectangle when
     * setting the width and/or height. Please fix this to obey
     * the LSP (Liskov Substitution Principle).
     */


    // creating a common interface to break the inheritance chain
    public interface Shape {
        int getArea();
    }

    public static class Rectangle implements Shape {
        protected int width;
        protected int height;

        public Rectangle(int width, int height) {
            setWidth(width);
            setHeight(height);
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        @Override
        public int getArea() {
            return width * height;
        }
    }

    public static class Square implements Shape {
        private int side;

        public Square(int side) {
            setSide(side);
        }

        public void setSide(int side) {
            this.side = side;
        }

        @Override
        public int getArea() {
            return side * side;
        }

    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle Area: " + rectangle.getArea());

        Square square = new Square(0);
        square.setSide(5);
        System.out.println("Square Area: " + square.getArea());
    }
}
