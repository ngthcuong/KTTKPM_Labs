package org.example;

import java.util.ArrayList;
import java.util.List;

public class Class implements Subject{
    private int id;
    private String name;
    private List<Observer> observers;

    public Class() {
    }

    public Class(int id, String name) {
        this.id = id;
        this.name = name;
        this.observers = new ArrayList<Observer>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers(String message) {
        observers.forEach(observer -> {
            observer.update(message);
        });
    }

}
