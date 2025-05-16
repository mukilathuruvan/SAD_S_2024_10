package SOLID;

public class DIP_01 {

    /*
     * TASK:
     * The Switch is violating the DIP (Dependency Inversion Principle).
     * Please fix this!
     */


    // Creating an interface to abstract the operations
    public interface Operatable{
        void turnOn();
        void turnOff();
    }
    
    // Implementing the interface in the LightBulb class (now concrete class is dependent on the interface)
    public static class LightBulb implements Operatable{
        @Override
        public void turnOn() {
            System.out.println("Light is ON!");
        }

        @Override
        public void turnOff() {
            System.out.println("Light is OFF!");
        }
    }

    public static class Switch {
        // Dependency on the interface instead of concrete class
        private Operatable operatable;

        public Switch(Operatable device) {
            this.operatable = device;
        }

        public void operate() {
            operatable.turnOn();
        }
    }

    public static void main(String[] args) {
        LightBulb lightBulb = new LightBulb();
        Switch lightSwitch = new Switch(lightBulb);
        lightSwitch.operate();
    }
}
