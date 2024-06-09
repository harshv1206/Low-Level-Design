package DesignPatterns.CreationalDesignPatterns.Singleton;

public class DBConnectionEagerLoading {
    //Eager Loading -> Thread Safe
    private static DBConnectionEagerLoading obj = new DBConnectionEagerLoading();
    private DBConnectionEagerLoading(){

    }
    public static DBConnectionEagerLoading getInstance(){
        return obj;
    }
}
