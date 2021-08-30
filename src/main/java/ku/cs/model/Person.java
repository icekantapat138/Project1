package ku.cs.model;

import java.time.LocalDate;
import javafx.beans.property.SimpleStringProperty;

public class Person {

    public SimpleStringProperty firstname;
    public SimpleStringProperty lastname;
    private SimpleStringProperty username;

    public Person(String firstname, String lastname, String username) {
        this.firstname = new SimpleStringProperty(firstname);
        this.lastname = new SimpleStringProperty(lastname);
        this.username = new SimpleStringProperty(username);
    }

    public SimpleStringProperty getFirstname(){
        return firstname;
    }

    public void setFirstname(SimpleStringProperty firstname){
        this.firstname = firstname;
    }

    public SimpleStringProperty getLastname(){
        return lastname;
    }

    public void setLastname(SimpleStringProperty lastname){
        this.lastname = lastname;
    }

    public SimpleStringProperty getUsername(){
        return username;
    }

    public void setUsername(SimpleStringProperty username){
        this.username = username;
    }
}


