package todo.app.model;

public class Person {
    private final int id;
    private String firstName;
    private String lastName;
    private String email;

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
            this.firstName = "No_first_name";
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
            this.lastName = "No_last_name";
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
            this.email = "No_email";
        }
        else {
            this.email = email;
        }
    }

    public String getSummary() {
        return  "id: " + this.id +"\n"
                + "First Name: " + this.firstName +"\n"
                + "Last Name: " + this.lastName +"\n"
                + "email: " + this.email +"\n";
    }

    public boolean isNullOrEmpty(String str) {
        if(str == null) {
            return true;
        }

        String inString = str.trim();

        return inString.length() == 0;
    }
}
