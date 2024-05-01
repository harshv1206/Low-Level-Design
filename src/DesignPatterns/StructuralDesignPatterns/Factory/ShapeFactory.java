package DesignPatterns.StructuralDesignPatterns.Factory;

import DesignPatterns.StructuralDesignPatterns.Factory.Circle;

import java.awt.*;

public class ShapeFactory {
    public Shape getShapeInstance(String value){
        if(value.equals("Circle"))
            return new Circle();
        else if(value.equals("Rectangle"))
            return new Rectangle();
        else if(value.equals("Square"))
            return new Square();

        return null;
    }

}