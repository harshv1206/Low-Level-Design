package DesignPatterns.StructuralDesignPatterns.Singleton;

public class DBConnectionDoubleLocking {
    //Double locking -> less costly than synchronised method approach -> thread safe

    private static DBConnectionDoubleLocking obj = null;

    private DBConnectionDoubleLocking(){

    }

    public static DBConnectionDoubleLocking getInstance(){
        if(obj == null){
            synchronized (DBConnectionDoubleLocking.class){
                if(obj == null){
                    obj = new DBConnectionDoubleLocking();
                }
            }
        }
        return obj;
    }
}
