package Section4.cdi;

import Section4.SpringIn5StepsBasicApplication;
import Section4.basic.BinarySearchImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@Run
@ExtendWith(MockitoExtension.class)
class SomeCDIBusinessTest {

    //Create mock
    @Mock
    SomeCDIBusinessDAO daoMock;

    //Inject Mock
    @Inject
    SomeCDIBusiness someCDIBusiness;



    @Test
    void findGreatest() {
        someCDIBusiness.g
        when(daoMock.getData()).thenReturn(new int[] {2,7,4});
        //when doaMock.getData() method is called return int[]{2,4}
        assertEquals(4, someCDIBusiness.findGreatest());


    }
    @Test
    void findGreatestNoElements() {

        when(daoMock.getData()).thenReturn(new int[] {});
        //when doaMock.getData() method is called return int[]{2,4}
        assertEquals(Integer.MIN_VALUE, someCDIBusiness.findGreatest());


    }
    @Test
    void findGreatestEqualElements() {

        when(daoMock.getData()).thenReturn(new int[] {2,2});
        //when doaMock.getData() method is called return int[]{2,4}
        assertEquals(2, someCDIBusiness.findGreatest());


    }
}