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
        return repository.findAll().stream()
                .map(person -> new PersonDTO(person.getId(), person.getFirstName(), person.getLastName(), person.getFavoriteColor()))
                .toList();
    }

    public List<PersonDTO> getAllPersonsByColor(String color) {
        return repository.findAllByFavoriteColorIgnoreCaseOrderByFirstName(color)
                .stream()
                .map(person -> new PersonDTO(person.getId(), person.getFirstName(), person.getLastName(), person.getFavoriteColor()))
                .toList();
    }

    public PersonDTO savePerson(PersonDTO newPerson) {
        Person personToSave = repository.save(new Person(newPerson.id(), newPerson.firstName(), newPerson.lastName(), newPerson.favoriteColor()));
        return new PersonDTO(personToSave.getId(), personToSave.getFirstName(), personToSave.getLastName(), personToSave.getFavoriteColor());
    }

    public PersonDTO getById(int id) {
        Person optionalPerson = repository.findById(id).orElseThrow();

        return new PersonDTO(optionalPerson.getId(), optionalPerson.getFirstName(), optionalPerson.getLastName(), optionalPerson.getFavoriteColor());
    }
}
