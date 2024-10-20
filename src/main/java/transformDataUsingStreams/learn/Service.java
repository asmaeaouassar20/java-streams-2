package transformDataUsingStreams.learn;

import getStarted.Person;

import java.util.List;

public class Service {
    static List<Person> people=Person.getPeople();

    static void toNames(){
        people.stream()
                .map(Person::getName)
                .forEach(System.out::println);
    }
    static void toCities(){
        people.stream()
                .map(Person::getCity)
                .forEach(System.out::println);
    }
}
