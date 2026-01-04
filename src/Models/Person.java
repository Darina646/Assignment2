package Models;

public abstract class Person implements Payable, Comparable<Person> {

    private static int nextId = 1;

    protected final int id;
    protected String name;
    protected String surname;

    public Person() {
        this.id = nextId++;
    }
    public Person(String name, String surname) {
        this.id = nextId++;
        this.name = name;
        this.surname = surname;
    }
    public int getId() {
        return id;
    }
    public String getName() {

        return name;
    }
    public String getSurname() {
        return surname;
    }
    @Override
    public String toString(){

        return String.format("%d. %s %s", id,name,surname);
    }
    public abstract String getPosition();

    @Override
    public abstract double getPaymentAmount();

    @Override
    public abstract int compareTo(Person other);
}