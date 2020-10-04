package Section4;

import Section4.basic.BinarySearchImpl;
import beansIntro.SpringIn5StepsApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsBasicApplication {

    //What are beans?
    //What are the dependencies of a bean?
    //Where to search for beans => No need cuz we are in the same package
    public static void main(String[] args) {

        //BinarySearchImpl bn = new BinarySearchImpl(new BubbleSortAlgorithm());
        //System.out.println(result);
        //Application Context
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);


        System.out.println(binarySearch);
        int result = binarySearch.binarySearch(new int[]{12,3,2},3);
        System.out.print(result);
    }

}
