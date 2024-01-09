package Employees;

import roles.Role;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String department;

    private List<Role> roles = new ArrayList<>();

    public Employee(String name, String department, Role role) {
        this.name = name;
        this.department = department;
        this.roles.add(role);
    }

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void addRole(Role r) {
        this.roles.add(r);
    }


    public String name() {
        return name;
    }

    public String department() {
        return department;
    }

    public void removeRole(Role role) {
        for (int i = 0; i < roles.size(); i++) {
            if (roles.get(i).equals(role)){
                roles.remove(roles.get(i));
        }


        }
    }

    @Override
    public String toString() {
        return String.format("%s at %s has roles %s", name, department, roles);
    }

}
