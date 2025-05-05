package model;

public abstract class Person {
    protected String name;
    protected String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract void displayInfo();

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
