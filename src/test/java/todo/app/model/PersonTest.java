package todo.app.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void should_Construct_A_Person_Object() {
        //Arrange
        int id = 1;
        String firstName = "Christopher";
        String lastName = "Ojaide";
        String email = "co@provider.com";

        //Act
        Person person = new Person(id, firstName, lastName, email);

        //Assert
        assertAll(
                () -> assertEquals(id, person.getId()),
                () -> assertEquals(firstName, person.getFirstName()),
                () -> assertEquals(lastName, person.getLastName()),
                () -> assertEquals(email, person.getEmail())
        );
    }

    @Test
    void should_Not_Construct_A_Person_Object_With_Null_Or_Empty_Names_Or_Email() {
        //Arrange
        int Id = 1;
        String firstName = "   ";
        String lastName = null;
        String email = "";

        String objectFirstName = "No_first_name";
        String objectLastName = "No_last_name";
        String objectEmail = "No_email";

        //Act
        Person person = new Person(Id, firstName, lastName, email);

        //Assert
        assertAll(
                () -> assertEquals(Id, person.getId()),
                () -> assertEquals(objectFirstName, person.getFirstName()),
                () -> assertEquals(objectLastName, person.getLastName()),
                () -> assertEquals(objectEmail, person.getEmail())
        );
    }

}