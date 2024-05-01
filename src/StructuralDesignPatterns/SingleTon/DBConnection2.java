package StructuralDesignPatterns.SingleTon;

public class DBConnection2 {

    //Synchronised method -> thread safe

    private static DBConnection2 obj = null;
    private DBConnection2(){

    }

    synchronized public static DBConnection2 getInstance(){
        if(obj == null){
            obj = new DBConnection2();
        }
        return obj;
    }
}
