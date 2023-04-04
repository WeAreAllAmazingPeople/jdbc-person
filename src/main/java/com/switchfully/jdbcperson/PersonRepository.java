package com.switchfully.jdbcperson;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepository {
    private final JdbcTemplate template;

    public PersonRepository(JdbcTemplate template) {
        this.template = template;
    }

    public List<Person> getAllPersons() {
        
        return template.query("select * from person",
                (resultSet, rowNumber) -> new Person(
                        resultSet.getInt("id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("favorite_color")));
    }
}
