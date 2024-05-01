package DesignPatterns.StructuralDesignPatterns.Singleton;

public class DBConnectionSynchronization {
    //Synchronised method -> thread safe
    private static DBConnectionSynchronization obj = null;
    private DBConnectionSynchronization(){

    }

    synchronized public static DBConnectionSynchronization getInstance(){
        if(obj == null){
            obj = new DBConnectionSynchronization();
        }
        return obj;
    }
}
