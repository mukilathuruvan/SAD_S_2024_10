package SOLID;

public class ISP_02 {
    
    /*
     * TASK:
     * Again, some classes are more simple than other.
     * Fix this without violating the ISP (Interface Segregation Principle)!
     */

    public static interface Workable {
        void work();
    }

    public static interface Restable {
        void rest();        
    }

    // by separating interfaces, now we are not forced to implement methods which we don't need
    public static class Developer implements Workable, Restable {
        @Override
        public void work() {
            System.out.println("Developer is coding ...");
        }

        @Override
        public void rest() {
            System.out.println("Developer is making a break!");
        }
    }

    // Robot is not abled to rest since we implemented only Workable interface
    public static class Robot implements Workable {
        @Override
        public void work() {
            System.out.println("Robot is working hard ...");
        }

    }

    public static void workingCycleForDeveloper(Workable worker, Restable rester) {
        worker.work();
        rester.rest();
    }

    public static void workingCycleForRobot(Workable worker) {
        worker.work();
    }

    public static void main(String[] args) {
        Developer developer=new Developer();
        Robot robot =new Robot();

        workingCycleForDeveloper(developer, developer);
        workingCycleForRobot(robot);        
    }
}
