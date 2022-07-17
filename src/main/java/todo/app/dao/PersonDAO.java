package todo.app.dao;

import todo.app.model.AppUser;
import todo.app.model.Person;

import java.util.List;

public interface PersonDAO {
    Person persist(Person person);
    Person findById(int id);
    Person findByEmail(String email);
    List<Person> findAll();
    void remove(int id);
}
