package DesignPatterns.CreationalDesignPatterns.Factory;

public class Rectangle implements Shape {
    @Override
    public void computeArea() {
        System.out.println("computing rectangle area");
    }
}