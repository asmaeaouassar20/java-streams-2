package getStarted;

import getStarted.Gender;
import getStarted.Person;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainProgram {
    public static void main(String[] args) {

        List<Person> people=Person.getPeople();


        // -----  Filter -----
        List<Person> females=people.stream()
                .filter(person->person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());
        //females.forEach(System.out::println);



        // ----- sort : small -> old -----
        List<Person> sortedPeopleByAge1=people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());
        //sortedPeopleByAge1.forEach(System.out::println);



        // ----- sort : old -> small -----
        List<Person> sortedPeopleByAge2=people.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .collect(Collectors.toList());
       // sortedPeopleByAge2.forEach(System.out::println);




        // -----  aLL match -----
        boolean areAllMatch=people.stream()
                .allMatch(person->person.getAge()>5);
        //System.out.println(areAllMatch);



        // -----  any match -----
        boolean anyMatch=people.stream()
                .anyMatch(person -> person.getName().startsWith("y"));
        //System.out.println(anyMatch);



        // -----  none match -----
        boolean noneMatch=people.stream()
                .noneMatch(person->person.getAge()>120);
        //System.out.println(noneMatch);


        // -----  max -----
        people.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);
        // PS : "ifPresent()" not "isPresent()"


        // -----  min -----
        people.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);
        // PS : "ifPresent()" not "isPresent()"




        // -----  group -----
        Map<Gender,List<Person>> peopleGroupedByGender= people.stream()
                .collect(Collectors.groupingBy(Person::getGender));
      /*  peopleGroupedByGender.forEach((gender,list)->{
            System.out.println("--- "+gender+" ---");
            list.forEach(System.out::println);
        });
       */




        // -----  return the oldest male -----
        System.out.println(" -> the oldest male : ");
        people.stream()
                .filter(person -> person.getGender().equals(Gender.MALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName)
                .ifPresent(System.out::println);
    }



    List<String> names=List.of("asmae","achraf","warda");

}


