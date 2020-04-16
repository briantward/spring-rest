package openshift.cop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.lang.InterruptedException;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"openshift.cop"})
public class Application {

    public static void main(String[] args) throws java.lang.InterruptedException {
        for (int i=1; i<=6; i++){
            Thread.sleep(10000);
            System.out.println("System starting up: " + i*10 + "/60");
        }
        SpringApplication.run(Application.class, args);    
    }
}
