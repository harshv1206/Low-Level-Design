package DesignPatterns.CreationalDesignPatterns.Factory;

import DesignPatterns.CreationalDesignPatterns.Factory.Shape;
import DesignPatterns.CreationalDesignPatterns.Factory.ShapeFactory;

public class Main {

    public static void main(String[] args) {
        ShapeFactory factoryInstance = new ShapeFactory();
        Shape circleObj = factoryInstance.getShapeInstance("Circle");
        Shape squareObj = factoryInstance.getShapeInstance("Square");
        circleObj.computeArea();
        squareObj.computeArea();
    }
}