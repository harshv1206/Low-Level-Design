package StructuralDesignPatterns.Factory;

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
