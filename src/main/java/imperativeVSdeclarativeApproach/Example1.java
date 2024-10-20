package imperativeVSdeclarativeApproach;
// 1. Find people aged less or equal 18
// 2. Then change implementation to find first 10 people


import getStarted.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
    static List<Person> people=Person.getPeople();

    static void imperativeApproach(){
        List<Person> youngPeople=new ArrayList<>();
        int limit=10;
        int counter=0;
        for(Person person:people){
            if(person.getAge()<=18){
                youngPeople.add(person);
                counter++;
                if(counter==limit){
                    break;
                }
            }
        }
        youngPeople.forEach(System.out::println);
    }



    static void declarativeApproach(){
        List<Person> youngPeopel=people.stream()
                .filter(p->p.getAge()<=18)
                .limit(10)
                .collect(Collectors.toList());
        youngPeopel.forEach(System.out::println);
    }
}
