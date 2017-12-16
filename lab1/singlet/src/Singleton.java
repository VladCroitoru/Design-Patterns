public class Singleton {
    private static Singleton singleton = null;


    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public void display(){
        System.out.println("I'm the only Singleton there is");
    }

}

