package StructuralDesignPatterns.SingleTon;

public class DBConnection1 {
    // Lazy Loading  -> Not Thread Safe

    private static DBConnection1 obj = null;
    private DBConnection1(){

    }
    public static DBConnection1 getInstance(){
        if(obj == null) {
            obj = new DBConnection1();
        }
        return obj;
    }

}
