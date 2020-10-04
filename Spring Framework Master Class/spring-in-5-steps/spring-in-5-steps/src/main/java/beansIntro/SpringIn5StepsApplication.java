package beansIntro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("beansIntro")
public class SpringIn5StepsApplication {

	//What are beans?
	//What are the dependencies of a bean?
	//Where to search for beans => No need cuz we are in the same package
	public static void main(String[] args) {

		//BinarySearchImpl bn = new BinarySearchImpl(new BubbleSortAlgorithm());
		//System.out.println(result);
		//Application Context
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsApplication.class);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[]{12,3,2},3);
		System.out.print(result);

	}

}
