package getStarted;

import java.util.List;

public class Person {

  private final String name;
  private final int age;
  private final Gender gender;
  private final City city;

  public Person(String name, int age, Gender gender,City city) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.city=city;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public Gender getGender() {
    return gender;
  }

  public City getCity() {
    return city;
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", gender=" + gender +
            ", city=" + city +
            '}';
  }

  public static List<Person> getPeople() {
    return List.of(
            new Person("ahmed", 20, Gender.MALE,City.Agadir),
            new Person("asmae", 33, Gender.FEMALE,City.Fes),
            new Person("nisrine", 57, Gender.FEMALE,City.Casablanca),
            new Person("achraf", 14, Gender.MALE,City.Agadir),
            new Person("ali", 99, Gender.MALE,City.Errachidia),
            new Person("narjiss", 7, Gender.FEMALE,City.Errachidia),
            new Person("warda", 120, Gender.FEMALE,City.Rabat)
    );
  }
}
