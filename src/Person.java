import java.io.Serializable;

/**
 * Created by Radu on 3/25/16.
 */
public class Person implements Serializable {
    private String firstName;
    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString(){
        return String.format("First Name: %s, Last Name: %s", firstName, lastName);
    }

    public Person(){
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
