package Job;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Doctor();
        employees[1] = new Firefighter();
        employees[2] = new Policeman();

        for (Employee employee : employees) {
            employee.work();
        }
    }
}
