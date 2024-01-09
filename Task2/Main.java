import Employees.Employee;
import roles.Role;

public class Main {
    public static void main(String[] args) {
        Role manager = new Role("Manager");
        Role engineer = new Role("Employee");
        Employee employee1 = new Employee("Danne Dos", "Economics");
        Employee employee2 = new Employee("Manne Fred", "Economics", manager);
        Employee employee3 = new Employee("Sven-Olof", "Postoffice");

        employee1.addRole(engineer);
        employee3.addRole(engineer);
        employee3.addRole(manager);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee3.removeRole(manager);

        System.out.println("\nRemoving role for: " + employee3.name());
        System.out.println(employee3);


    }
}

