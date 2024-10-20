package transformDataUsingStreams.dtos;

import getStarted.City;
import getStarted.Gender;
import getStarted.Person;

public class PersonDto {
    private final String name;
    private final int age;

    public PersonDto(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static PersonDto map(Person person){
        return new PersonDto(
                person.getName(),
                person.getAge()
        );
    }

    @Override
    public String toString() {
        return "PersonDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
