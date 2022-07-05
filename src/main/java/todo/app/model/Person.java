package todo.app.model;

import java.util.Objects;

public class Person {
    private final int id;
    private String firstName;
    private String lastName;
    private String email;
    private AppUser credentials;

    public Person(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (isNullOrEmpty(firstName)) {
            this.firstName = "first name missing";
        }
        else {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (isNullOrEmpty(lastName)) {
            this.lastName = "first name missing";
        }
        else {
            this.lastName = lastName;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isNullOrEmpty(email)) {
            this.email = "email missing";
        }
        else {
            this.email = email;
        }
    }

    public AppUser getCredentials() {
        return credentials;
    }

    public void setCredentials(AppUser credentials) {
        this.credentials = credentials;
    }

    public String getSummary() {
        return  "id: " + this.id +"\n"
                + "First Name: " + this.firstName +"\n"
                + "Last Name: " + this.lastName +"\n"
                + "email: " + this.email +"\n";
    }

    public boolean isNullOrEmpty(String str) {
        if(str == null) { return true; }

        return str.trim().length() == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && firstName.equals(person.firstName) && lastName.equals(person.lastName) && email.equals(person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
