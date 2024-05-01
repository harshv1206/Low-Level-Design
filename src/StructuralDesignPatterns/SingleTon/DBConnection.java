package StructuralDesignPatterns.SingleTon;

public class DBConnection {
    //Eager Loading -> Thread Safe
    private static DBConnection obj = new DBConnection();
    private DBConnection(){

    }
    public static DBConnection getInstance(){
        return obj;
    }
}
