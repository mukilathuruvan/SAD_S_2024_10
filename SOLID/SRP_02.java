package SOLID;

public class SRP_02 {

    /*
     * TASK:
     * Just make this class obeying the SRP (Single Responsibility Principle)!
     * The method bodies are empty by purpose and there is no main provided.
     */


    // seperate class for NoficationService
    public static class NoficationService {
        private Employee employee;

        public NoficationService(Employee employee) {
            this.employee = employee;
        }

        public void sendMail() {
            System.out.println("Sending mail for " + employee.getName());
        }
    }


    // seperate class for SalaryService
    public static class SalaryService {
        private Employee employee;

        public SalaryService(Employee employee) {
            this.employee = employee;
        }

        public void updateSalary() {
            System.out.println("Updating salary for " + employee.getName());
        }
    }

    public static class Employee {
        private int id;
        private String name, designation;

        public Employee(int id, String name, String designation) {
            this.id = id;
            this.name = name;
            this.designation = designation;
        }

        public String getName() {
            return this.name;
        }

        public String getDesignation() {
            return this.designation;
        }

    }

    public static void main(String[] args) {

        Employee employee = new Employee(1, "Ragnar Lathbrok", "Software Engineer");
        NoficationService noficationService = new NoficationService(employee);
        noficationService.sendMail();

        SalaryService salaryService = new SalaryService(employee);
        salaryService.updateSalary();

    }
}
