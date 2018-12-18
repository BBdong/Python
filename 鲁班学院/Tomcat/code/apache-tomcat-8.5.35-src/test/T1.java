import java.io.File;
import java.io.IOException;

import org.apache.catalina.Lifecycle;
import org.apache.catalina.util.LifecycleBase;

/**
 * 
 * @Description
 *				   
 * @author mayadong[863836234@qq.com]     
 * @date 2018年12月18日 - 上午10:27:32
 */
public class T1 {

    public static void main(String[] args) throws IOException { 
       Lifecycle l = null;
       LifecycleBase b = null;
       
       //E:\JAVAWork\IDEASpace\code\catalina-home
       File f = new File("E:\\JAVAWork\\IDEASpace\\code\\catalina-home");
       System.out.println(f.getCanonicalFile());
    }
    
    

}
