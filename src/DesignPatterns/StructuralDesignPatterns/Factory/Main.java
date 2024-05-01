package StructuralDesignPatterns.Factory;

import DesignPatterns.StructuralDesignPatterns.Factory.Shape;
import DesignPatterns.StructuralDesignPatterns.Factory.ShapeFactory;

public class Main {

    public static void main(String[] args) {
        ShapeFactory factoryInstance = new ShapeFactory();
        Shape circleObj = factoryInstance.getShapeInstance("Circle");
        Shape squareObj = factoryInstance.getShapeInstance("Square");
        circleObj.computeArea();
        squareObj.computeArea();
    }
}