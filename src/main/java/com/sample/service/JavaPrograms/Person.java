package com.sample.service.JavaPrograms;

public class Person {

   public int age;
   public String name;
   public String address;

    public static PersonBuilder aPerson() {
        return new PersonBuilder();
    }

    public static final class PersonBuilder {
        private int age;
        private String name;
        private String address;

        private PersonBuilder() {
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            Person person = new Person();
            person.name = this.name;
            person.age = this.age;
            person.address = this.address;
            return person;
        }
    }
}
