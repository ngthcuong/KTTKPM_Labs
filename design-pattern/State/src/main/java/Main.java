import entities.Employee;
import entities.Position;
import entities.Task;
import manager.EmployeeManager;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        Position managerPosition = new Position();
        managerPosition.setId("C1");
        managerPosition.setName("Quản lý");
        managerPosition.addTask(new Task("T1", "Kiểm tra báo cáo danh thu"));
        managerPosition.addTask(new Task("T2", "Lên lịch họpc"));

        Position staffPosition = new Position();
        staffPosition.setId("S1");
        staffPosition.setName("Nhân viên");
        staffPosition.addTask(new Task("T1", "Bán hàng"));
        staffPosition.addTask(new Task("T2", "Nhập dữ liệu"));

        Employee emp1 = new Employee();
        emp1.setId("E1");
        emp1.setFullName("Nguyễn Thành Cương");
        emp1.setPosition(managerPosition);

        Employee emp2 = new Employee();
        emp2.setId("E2");
        emp2.setFullName("Nguyễn Thanh Cường");
        emp2.setPosition(staffPosition);

        manager.addEmployee(emp1);
        manager.addEmployee(emp2);

        System.out.println("Trạng thái ban đầu: ");
        manager.displayEmployeeTasks("E1");
        manager.displayEmployeeTasks("E2");

        System.out.println("\nTrạng thái sau khi thay đổi: ");
        emp1.setState(Employee.RETIRE);
        emp1.setState(Employee.ON_LEAVE);

        manager.displayEmployeeTasks("E1");
        manager.displayEmployeeTasks("E2");
    }
}