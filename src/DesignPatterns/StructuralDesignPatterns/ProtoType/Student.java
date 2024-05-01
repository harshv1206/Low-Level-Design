package DesignPatterns.StructuralDesignPatterns.ProtoType;

import DesignPatterns.StructuralDesignPatterns.ProtoType.Prototype;

public class Student implements Prototype{
    int age;
    private int rollNumber;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }

    Student(){

    }

    public Student(int age, int rollNumber, String name) {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
    }


    @Override
    public Prototype clone() {
        return new Student(age, rollNumber, name);
    }
}