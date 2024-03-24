import org.junit.Test;

import java.time.LocalDate;
import Record.PersonRecord;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Record {


    @Test
    public void GivenValidDetails_thenExpectedValuesRetured(){
        String lastName ="Wilson";
        String firstName = "larry";
        LocalDate dob = LocalDate.of(1990,12,11);
        int salary = 1000;
        String designation = "Programmer";
        String company = "L&T";

        PersonRecord larry = new PersonRecord(lastName,firstName,dob,salary,designation,company);
        assertEquals(lastName,larry.lastName());
        assertEquals(firstName,larry.firstName());
        assertEquals(dob,larry.dob());
        assertEquals(salary,larry.salary());
        assertEquals(designation,larry.designation());
        assertEquals(company,larry.company());

    }

    @Test
    public void GivenSameDetails_WhenEquals_thenBothShouldEquals(){
        String lastName ="Wilson";
        String firstName = "larry";
        LocalDate dob = LocalDate.of(1990,12,11);
        int salary = 1000;
        String designation = "Programmer";
        String company = "L&T";

        PersonRecord larry1 = new PersonRecord(lastName,firstName,dob,salary,designation,company);
        PersonRecord larry2 = new PersonRecord(lastName,firstName,dob,salary,designation,company);
        assertTrue(larry1.equals(larry2));

    }

    @Test
    public void GivenSameDetails_WhenHashCode_thenBothShouldEquals(){
        String lastName ="Wilson";
        String firstName = "larry";
        LocalDate dob = LocalDate.of(1990,12,11);
        int salary = 1000;
        String designation = "Programmer";
        String company = "L&T";

        PersonRecord larry1 = new PersonRecord(lastName,firstName,dob,salary,designation,company);
        PersonRecord larry2 = new PersonRecord(lastName,firstName,dob,salary,designation,company);
        assertEquals(larry1.hashCode(),larry2.hashCode());
    }
}
