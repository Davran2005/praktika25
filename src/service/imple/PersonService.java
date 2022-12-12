package service.imple;

import classes.Person;

import java.util.List;

public interface PersonService {
    String create(Person people);


    List<Person>getPerson();
    Person getPersonFirsName(String name,List<Person>people);
}

