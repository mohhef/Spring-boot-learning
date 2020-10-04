package Section4;

import Section4.basic.BinarySearchImpl;
import Section4.properties.SomeExternalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
//app.properties
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

    //What are beans?
    //What are the dependencies of a bean?
    //Where to search for beans => No need cuz we are in the same package
    public static void main(String[] args) {

        //BinarySearchImpl bn = new BinarySearchImpl(new BubbleSortAlgorithm());
        //System.out.println(result);
        //Application Context
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class);
        SomeExternalService service = applicationContext.getBean(SomeExternalService.class);

        System.out.println(service.returnServiceUrl());

    }

}
