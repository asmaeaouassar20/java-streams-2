import java.util.List;

public class Person {

  private final String name;
  private final int age;
  private final Gender gender;

  public Person(String name, int age, Gender gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
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

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", gender=" + gender +
        '}';
  }

   static List<Person> getPeople() {
    return List.of(
            new Person("ahmed", 20, Gender.MALE),
            new Person("asmae", 33, Gender.FEMALE),
            new Person("nisrine", 57, Gender.FEMALE),
            new Person("achraf", 14, Gender.MALE),
            new Person("ali", 99, Gender.MALE),
            new Person("narjiss", 7, Gender.FEMALE),
            new Person("warda", 120, Gender.FEMALE)
    );
  }
}
