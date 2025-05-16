package SOLID;

public class DIP_02 {

    /*
     * TASK:
     * The class Employee violates the DIP (Dependency Inversion Principle).
     * Fix this!
     */
    
    public static interface Notification {
        void doNotify();
    }

    public static class EmailNotification implements Notification {
        @Override
        public void doNotify() {
            System.out.println("Sending notification via email!");
        }
    }

    public static class Employee {

        //  Now this class depends on the abstraction (Notification) rather than a concrete implementation (EmailNotification)
        private Notification notification;

        public Employee(Notification notification) {
            this.notification = notification;
        }
    
        public void notifyEmployee() {
            notification.doNotify();
        }
    }

    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification();
        Employee employee = new Employee(emailNotification);
        employee.notifyEmployee();
    }
}
