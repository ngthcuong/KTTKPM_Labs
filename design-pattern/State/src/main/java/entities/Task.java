package entities;

public class Task {
    public String id;
    public String name;

    public Task(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Task() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
