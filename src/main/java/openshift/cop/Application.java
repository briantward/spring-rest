package openshift.cop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.lang.InterruptedException;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"openshift.cop"})
public class Application {

    public static void main(String[] args) throws java.lang.InterruptedException {
        Thread.sleep(600000);
        SpringApplication.run(Application.class, args);    
    }
}
