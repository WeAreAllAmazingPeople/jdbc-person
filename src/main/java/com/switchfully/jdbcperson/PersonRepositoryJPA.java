//package com.switchfully.jdbcperson;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class PersonRepositoryJPA {
////    private final JdbcTemplate template;
////
////    public PersonRepository(JdbcTemplate template) {
////        this.template = template;
////    }
////
////    public List<Person> getAllPersons() {
////
////        return template.query("select * from person",
////                (resultSet, rowNumber) -> new Person(
////                        resultSet.getInt("id"),
////                        resultSet.getString("first_name"),
////                        resultSet.getString("last_name"),
////                        resultSet.getString("favorite_color")));
////    }
//
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    public List<Person> getAllPersons() {
//        return entityManager.createQuery("SELECT p FROM Person p", Person.class)
//                .getResultList();
//    }
//
//    public List<Person> getAllPersonsWhoLikeAColor(List<String> colors) {
//        return entityManager.createQuery("select p from Person p where favoriteColor in :colorsToMatch", Person.class)
//                .setParameter("colorsToMatch", colors)
//                .getResultList();
//    }
//
//    public List<Person> getAllPersonsByFirstAndLastName(String firstName, String lastName) {
//        return entityManager.createQuery("""
//                        select p from Person p
//                        where firstName like :x and lastName like :y
//                        """, Person.class)
//                .setParameter("x", firstName)
//                .setParameter("y", lastName)
//                .getResultList();
//    }
//
//    public Person getPersonById(int id) {
//        return entityManager.find(Person.class, id);
//    }
//}
