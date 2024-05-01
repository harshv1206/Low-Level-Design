package StructuralDesignPatterns.SingleTon;

public class DBConnection3 {

    //Double locking -> less costly than synchronised method approach -> thread safe

    private static DBConnection3 obj = null;

    private DBConnection3(){

    }

    public static DBConnection3 getInstance(){
        if(obj == null){
            synchronized (DBConnection3.class){
                if(obj == null){
                    obj = new DBConnection3();
                }
            }
        }
        return obj;
    }


}
