package ru.acorn.springpetclinic.springpetclinic.model;

public class Person extends BaseEntity {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNameName() {
        return lastName;
    }

    public void setLastName(String secondName) {
        this.lastName = secondName;
    }
}
