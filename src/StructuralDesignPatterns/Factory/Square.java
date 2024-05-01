package StructuralDesignPatterns.Factory;

import StructuralDesignPatterns.Factory.Shape;

public class Square implements Shape {
    @Override
    public void computeArea() {
        System.out.println("computing square Area");
    }
}
