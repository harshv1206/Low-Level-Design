package StructuralDesignPatterns.ProtoType;

import DesignPatterns.CreationalDesignPatterns.ProtoType.Student;

public class Main {
    public static void main(String[] args) {
        Student obj = new Student(20,2,"Harsh");
        Student cloneObj = (Student) obj.clone();
        System.out.println(obj);
        System.out.println(cloneObj);

    }
}