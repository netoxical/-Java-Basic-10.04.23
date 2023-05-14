package ua.hillel.brizhak.lessons.lessons11;

import java.util.Objects;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
//        this(name, 1111);
    }

    public Person(int age) {
        this.age = age;
//        this("Alex", age);
    }

    public Person() {
        this("Alex", 1111);
    }

    void sayHello() {
        System.out.println(name + " say hello!");
    }

    void printAge() {
        System.out.println("age = " + age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }





}
