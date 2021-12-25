package com.caglayan.builderpattern;

import java.util.Date;
import java.util.Objects;

public class Person {
    private String name;
    private String lastName;
    private String eMail;
    private Date birthDate;
    private char gender;

    // No args constructor
    public Person() {
    }

    // Full args constructor
    public Person(String name, String lastName, String eMail, Date birthDate, char gender) {
        this.name = name;
        this.lastName = lastName;
        this.eMail = eMail;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    // Constructor for builder
    public Person(Builder builder) {
        this(builder.name, builder.lastName, builder.eMail, builder.birthDate, builder.gender);
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    // Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getGender() == person.getGender() && Objects.equals(getName(), person.getName()) && Objects.equals(getLastName(), person.getLastName()) && Objects.equals(geteMail(), person.geteMail()) && Objects.equals(getBirthDate(), person.getBirthDate());
    }

    // HashCode
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLastName(), geteMail(), getBirthDate(), getGender());
    }

    // ToString
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", eMail='" + eMail + '\'' +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                '}';
    }

    // Builder class
    public static class Builder {
        private String name="";
        private String lastName="";
        private String eMail="";
        private Date birthDate = new Date();
        private char gender='\0';

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder setEMail(String eMail){
            this.eMail = eMail;
            return this;
        }

        public Builder setBirthDate(Date birthDate){
            this.birthDate = birthDate;
            return this;
        }

        public Builder setGender(char gender){
            this.gender = gender;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
}
