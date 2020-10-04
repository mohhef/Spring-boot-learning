package beansIntro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm){
        this.sortAlgorithm=sortAlgorithm;
    }
    //Sort the array
    //Search the array
    //Return the index
    //This algorithm is tightly coupled to the bubble sort algorithm, If I want to change the algorithm then I would need
    //To change the code of the binary search
    public int binarySearch(int[] numbers, int numberToSearch){
        //implement searching logic
        //Hard coded to use bubble sort Algorithm
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        //System.out.print(sortAlgorithm);
        //search the array
        System.out.println(sortAlgorithm);
        return 3;
    }
}
