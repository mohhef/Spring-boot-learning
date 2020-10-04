package Section4;

import Section4.xml.XMLPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class SpringIn5StepsXMLApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXMLApplication.class);

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        XMLPersonDAO personDAO = applicationContext.getBean(XMLPersonDAO.class);

        LOGGER.info("Beans Loaded --> {}",
                (Object)applicationContext.getBeanDefinitionNames());
        LOGGER.info("{}",personDAO);
        LOGGER.info("{}",personDAO.getXmljdbcConnection());
    }

}
