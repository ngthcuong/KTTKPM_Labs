import context.Employee;

public class Main {
    public static void main(String[] args) {
        Employee dev = new Employee("1", "Nguyễn Thành Cương", "developer");
        Employee manager = new Employee("2", "Nguyễn Thanh Cường", "manager");
        Employee designer = new Employee("3", "Nguyễn Thành Cường", "designer");

        dev.displayTasks();
        manager.displayTasks();
        designer.displayTasks();
    }
}