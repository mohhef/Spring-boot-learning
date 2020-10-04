package Section4.basic;

import Section4.SpringIn5StepsBasicApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Load the context
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "/applicationContext.xml")
class BinarySearchXMLConfigurationImplTest {

    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    void binarySearch() {
        assertEquals(3, binarySearch.binarySearch(new int[] {1,2,3},5));
    }
}