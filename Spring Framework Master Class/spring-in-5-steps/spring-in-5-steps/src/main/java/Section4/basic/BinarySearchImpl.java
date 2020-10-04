package Section4.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm bubbleSortAlgorithm;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //Sort the array
    //Search the array
    //Return the index
    //This algorithm is tightly coupled to the bubble sort algorithm, If I want to change the algorithm then I would need
    //To change the code of the binary search
    public int binarySearch(int[] numbers, int numberToSearch){
        //implement searching logic
        //Hard coded to use bubble sort Algorithm
        int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
        //System.out.print(sortAlgorithm);
        //search the array
        System.out.println(bubbleSortAlgorithm);
        return 3;
    }

    @PostConstruct
    public void postConstruct(){
        logger.info("Post Construct");
    }

    @PreDestroy
    public void preDestroy(){
        logger.info("Bean is destroyed");
    }
}
