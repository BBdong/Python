import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringApplicationContext.class);
        context.start();
        try {
            System.in.read();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
