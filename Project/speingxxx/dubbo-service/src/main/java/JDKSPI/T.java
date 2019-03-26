package JDKSPI;

import java.util.Iterator;
import java.util.ServiceLoader;

public class T {

    public static void main(String[] args) {

        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
        Iterator<HelloService> i = loader.iterator();
        while (i.hasNext()){
            HelloService service = i.next();
            System.out.println(service.sayHello());
        }

    }

}
