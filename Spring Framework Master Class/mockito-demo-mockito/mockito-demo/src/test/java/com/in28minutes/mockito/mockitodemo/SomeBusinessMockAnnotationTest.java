package com.in28minutes.mockito.mockitodemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.xml.crypto.Data;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SomeBusinessMockAnnotationTest {

    @Mock
    DataService dataServiceMock;

    @Test
    void findTheGreatestFromAllData() {
        //dataServiceMock.retrieveAllData() => new int[] {24,15,6}
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,16,5});
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceMock);
        assertEquals(24, someBusiness.findTheGreatestFromAllData());
    }

    @Test
    void findTheGreatestForOne() {
        //dataServiceMock.retrieveAllData() => new int[] {24,15,6}
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {16});
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceMock);
        assertEquals(16, someBusiness.findTheGreatestFromAllData());
    }

    @Test
    void findTheGreatestForNoValue() {
        //dataServiceMock.retrieveAllData() => new int[] {24,15,6}
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceMock);
        assertEquals(Integer.MIN_VALUE, someBusiness.findTheGreatestFromAllData());
    }
}
