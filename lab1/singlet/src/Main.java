import org.junit.Test;

import static junit.framework.TestCase.assertSame;


public class Main {

    public static void main(String[] args) {

        //not thread safe
        //lazy instantiation
        Singleton singleton = Singleton.getInstance();
        singleton.display();


    }

    @Test
    public void Singletontest(){
        Singleton singleton = Singleton.getInstance();
        singleton.display();

        Singleton singleton1 = Singleton.getInstance();
        singleton1.display();

        assertSame(singleton, singleton1);


    }
}
