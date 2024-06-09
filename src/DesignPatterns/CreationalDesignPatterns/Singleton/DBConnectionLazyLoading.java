package DesignPatterns.CreationalDesignPatterns.Singleton;

public class DBConnectionLazyLoading {
    // Lazy Loading  -> Not Thread Safe

    private static DBConnectionLazyLoading obj = null;
    private DBConnectionLazyLoading(){

    }
    public static DBConnectionLazyLoading getInstance(){
        if(obj == null) {
            obj = new DBConnectionLazyLoading();
        }
        return obj;
    }
}
