package com.codegym;

public class PersonManagement {
    private Person[] persons = new Person[0];

    public PersonManagement() {

    }

    public PersonManagement(Person[] persons) {
        this.persons = persons;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    public void displayAllPerson() {
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
    }
    public Person[] addPerson(Person newPerson){
        for (int i = 0; i < persons.length; i++) {
            persons[i] = newPerson;
        }
        return persons;
    }
}


