package com.switchfully.jdbcperson;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public List<PersonDTO> getAllPersons() {
        return repository.getAllPersons().stream()
                .map(person -> new PersonDTO(person.getId(), person.getFirstName(), person.getLastName(), person.getFavoriteColor()))
                .toList();
    }
}
