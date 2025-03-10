import component.Employee;
import concreteComponent.BasicEmployee;
import concreteDecorator.DesignerDecorator;
import concreteDecorator.DeveloperDecorator;
import concreteDecorator.ManagerDecorator;

public class Main {
    public static void main(String[] args) {
        Employee basicEmployee = new BasicEmployee("Nguyễn Văn A");
        System.out.println("Nhân viên cơ bản: " + basicEmployee.getTasks());

        // Nhân viên Developer
        Employee developer = new DeveloperDecorator(new BasicEmployee("Nguyễn Văn B"));
        System.out.println("\nNhân viên Developer: " + developer.getTasks());

        // Nhân viên Manager
        Employee manager = new ManagerDecorator(new BasicEmployee("Trần Thị C"));
        System.out.println("\nNhân viên Manager: " + manager.getTasks());

        // Nhân viên Designer
        Employee designer = new DesignerDecorator(new BasicEmployee("Lê Văn D"));
        System.out.println("\nNhân viên Designer: " + designer.getTasks());
    }
}
