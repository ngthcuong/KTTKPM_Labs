package context;

import concrete.DesignerTasks;
import concrete.DeveloperTasks;
import concrete.ManagerTasks;
import strategy.TaskStrategy;

public class Employee {
    private  String id;
    private String name;
    private String role;
    private TaskStrategy strategy;

    public Employee(String id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
        setTaskStrategy(role);
    }

    public void setTaskStrategy(String role) {
        switch (role.toLowerCase()) {
            case "manager":
                strategy = new ManagerTasks();
                break;
            case "designer":
                strategy = new DesignerTasks();
                break;
            case "developer":
                strategy = new DeveloperTasks();
                break;
            default:
                throw new IllegalArgumentException("Invalid role");
        }
    }

    public void displayTasks() {
        System.out.println("Employee: " + name);
        System.out.println("Role: " + role);
        System.out.println("Tasks: ");
        strategy.getTasks().forEach(System.out::println);
    }
}
