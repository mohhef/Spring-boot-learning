	package telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

    @SpringBootApplication
public class SpringIn5StepsApplication {

    //What are beans?
    //What are the dependencies of a bean?
    //Where to search for beans => No need cuz we are in the same package
    public static void main(String[] args) {

        //BinarySearchImpl bn = new BinarySearchImpl(new BubbleSortAlgorithm());
        //System.out.println(result);
        //Application Context
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);

        Alien a = applicationContext.getBean(Alien.class);
        a.show();

    }

}
