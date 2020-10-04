package Section4.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BubbleSortAlgorithm implements SortAlgorithm {

    public int[] sort(int[] numbers){
        return numbers;
    }
}
