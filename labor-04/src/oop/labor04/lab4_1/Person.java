package oop.labor04.lab4_1;

public class Person {
    private String firstname;

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    private String lastname;
    private int birthyear;

    public Person(String firstname, String lastname, int birthyear) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthyear = birthyear;
    }

    public String toString(){
        return "Person{" +
                "firtsName= "+firstname+'\''+
                "lastName= "+lastname+'\''+
                "birthYear= "+birthyear+'\''+'}';
    }
}
