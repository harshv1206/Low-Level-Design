package DesignPatterns.StructuralDesignPatterns.Factory;

public class Circle implements Shape {
    @Override
    public void computeArea() {
        System.out.println("computing circle area");
    }
}