

import Record.PersonRecord;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        PersonRecord larry = new PersonRecord("Wilson","larry", LocalDate.of(1990,12,11),1000,"Programmer","L&T");
        System.out.println(larry);
        System.out.println(larry.sayHello());
        System.out.println( larry.firstName());
        System.out.println(larry.getSalary());
        System.out.println(larry.getDesignation());
        System.out.println(larry.getCompanyName());


        PersonRecord Jake = new PersonRecord("Toast","JAKE", LocalDate.of(1880,12,11),2000,"Analyst",PersonRecord.UNKOWN_COMPANY);
        System.out.println(Jake);

        System.out.println(PersonRecord.unNamed("Toast","Jake"));









    }
}
