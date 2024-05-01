package StructuralDesignPatterns.Factory;

public class Main {

    public static void main(String[] args) {
        ShapeFactory factoryInstance = new ShapeFactory();
        Shape circleObj = factoryInstance.getShapeInstance("Circle");
        Shape squareObj = factoryInstance.getShapeInstance("Square");
        circleObj.computeArea();
        squareObj.computeArea();
    }
}
