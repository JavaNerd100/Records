package Person;

import java.time.LocalDate;
import java.util.Objects;


/**
 *  here are two problems with it:
 *    1) There’s a lot of boilerplate code
 *    2)  We obscure the purpose of our class: to represent a person with a name and address
 *  In the first case, we have to repeat the same tedious process for each data class,
 *  monotonously creating a new field for each piece of data; creating equals, hashCode,
 *  and toString methods; and creating a constructor that accepts each field.
 *      While IDEs can automatically generate many of these classes, they fail to automatically
 *      update our classes when we add a new field. For example, if we add a new field, we have to update
 *      our equals method to incorporate this field.
 *  In the second case, the extra code obscures that our class is simply a data class that has two String fields, name and address.
 *  A better approach would be to explicitly declare that our class is a data class.
 */
public class Person {

    private String lastName;
    private String firstName;
    private LocalDate dob;

    public Person(String lastName, String firstName, LocalDate dob) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dob = dob;
    }

    public Person(){

    }

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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(lastName, person.lastName) && Objects.equals(firstName, person.firstName) && Objects.equals(dob, person.dob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, dob);
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", FirstName='" + firstName + '\'' +
                ", dob=" + dob +
                '}';
    }
}
