import Models.Person;
import Models.Student;
import Models.Employee;

import java.util.ArrayList;
import java.util.Collections;

  public class Main {

    public static void main(String[] args){
    ArrayList<Person> people = new ArrayList<>();
    people.add(new Student("Hermione", "Granger", 4.0 ));
    people.add(new Student("Ron", "Weasley",2.3));
    people.add(new Employee("Ashley", "Snow","Designer", 570000));
    people.add(new Employee("Nick", "wild","Manager", 360000));

    Collections.sort(people);
    printData(people);
    }
    public static void printData(Iterable<Person> people) {
        for(Person p: people) {
            System.out.println(p + " gets " + p.getPaymentAmount() + "tenge");
        }
    }
}