package transformDataUsingStreams.dtos;

import getStarted.Person;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people=Person.getPeople();

        //  ---> Transform person to personDto
        List<PersonDto> dtos=people.stream()
                                    .map(PersonDto::map)
                                    .collect(Collectors.toList());
        //dtos.forEach(System.out::println);

    }

}
