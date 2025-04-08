package entities;

import java.util.ArrayList;
import java.util.List;

public class Position {
    public String id;
    public String name;
    public String description;
    public List<Task> tasks = new ArrayList<>();

    public Position(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
//        this.tasks = new ArrayList<>();
    }

    public Position() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

//    public void setTasks(List<Task> tasks) {
//        this.tasks = tasks;
//    }

    @Override
    public String toString() {
        return "Position{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", tasks=" + tasks +
                '}';
    }
}
