package org.example;

import java.util.ArrayList;
import java.util.List;

public class ClassLeader  extends Student{

    private Class clazz;

    public ClassLeader() {
    }

    public ClassLeader(int id, String name, Class clazz) {
        super(id, name);
        this.clazz = clazz;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public void notifyStudents(String message) {
        clazz.notifyAllObservers(message);
    }

}
