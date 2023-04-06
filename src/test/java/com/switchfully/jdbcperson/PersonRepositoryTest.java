//package com.switchfully.jdbcperson;
//
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.jdbc.Sql;
//
//@DataJdbcTest
//@ContextConfiguration(classes = {PersonRepositoryJPA.class})
//@EnableAutoConfiguration
//public class PersonRepositoryTest {
//    @Autowired
//    private PersonRepositoryJPA personRepository;
//
//    @Test
//    @Sql("createTestPersons.sql")
//    void getAllPersons_givenTestDB_thenReturn1Person() {
//        Assertions
//                .assertThat(this.personRepository.getAllPersons())
//                .hasSize(1);
//    }
//
//    @Test
//    void getAllPersons_givenEmptyTestDB() {
//        Assertions.assertThat(personRepository.getAllPersons())
//                .hasSize(0);
//
//    }
//}
