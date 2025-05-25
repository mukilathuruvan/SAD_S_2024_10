package SOLID;

public class LSP_02 {

    /*
     * TASK:
     * The polymorphic function move expect the same behaviour
     * for all birds, but this isn't the case.
     * Fix this to obey the LSP (Liskov Substitution Principle)!
     */

    public static class Bird {
        // list of general methods
        void eat() {
            System.out.println("The bird is eating...");
        }

    }

    // ceating this interface to make sure seperate fylable from penguin
    public interface Flyable {
        public void fly();
    }

    public static class Sparrow extends Bird implements Flyable {
        @Override
        public void fly() {
            System.out.println("The sparrow is flying...");
        }
    }

    public static class Penguin extends Bird {
        void swim() {
            System.out.println("The penguin is swimming...");
        }
    }

    public static void move(Flyable flyable) {
        flyable.fly();
    }

    public static void main(String[] args) {
        move(new Sparrow());

        // move(new Penguin()); // This will not work as Penguin is
        // not Flyable
    }
}