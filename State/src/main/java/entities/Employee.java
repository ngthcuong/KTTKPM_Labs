package entities;

import states.EmployeeState;
import states.OnLeaveState;
import states.RetiredState;
import states.WorkingState;

public class Employee {
    private String id;
    private String fullName;
    private Position position;
    private EmployeeState state = WORKING;

    public static final EmployeeState WORKING = new WorkingState();
    public static final EmployeeState ON_LEAVE = new OnLeaveState();
    public static final EmployeeState RETIRE = new RetiredState();

    public Employee(String id, String fullName, Position position) {
        this.id = id;
        this.fullName = fullName;
        this.position = position;
//        this.state = WORKING;
    }

    public EmployeeState getState() {
        return state;
    }

    public void setState(EmployeeState state) {
        this.state = state;
    }

    public void displayTasks() {
        state.displayTasks(this);
    }

    public Employee() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", position=" + position +
                '}';
    }
}
