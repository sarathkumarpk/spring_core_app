import com.sarath.core_spring.pojo.DerivedTestPojo;
import com.sarath.core_spring.pojo.TestPojo;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("config/application_context.xml");
        TestPojo testPojo = (TestPojo) context.getBean("testPojo");
        context.registerShutdownHook();
    }
}
