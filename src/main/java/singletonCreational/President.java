package singletonCreational;

public final class President {
    private static President instance;

    public President() {
    }

    public static President getInstance() {

       if(!(instance == null)){
           instance = new President();
       }
       return instance;
    }

    @Override
    protected java.lang.Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private void wakeup(){

    }

}
