package Section4.basic;

import Section4.SpringIn5StepsBasicApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

//Load the context
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = SpringIn5StepsBasicApplication.class)
class BinarySearchImplTest {

    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    void binarySearch() {
        assertEquals(3, binarySearch.binarySearch(new int[] {1,2,3},5));
    }
}