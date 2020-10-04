package com.in28minutes.mockito.mockitodemo;

import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SomeBusinessMockImplTest {

    @Test
    void findTheGreatestFromAllData() {
        DataService dataServiceMock = mock(DataService.class);
        //dataServiceMock.retrieveAllData() => new int[] {24,15,6}
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,16,5});
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceMock);
        int result = someBusiness.findTheGreatestFromAllData();
        assertEquals(24,result);
    }

    @Test
    void findTheGreatestForOne() {
        DataService dataServiceMock = mock(DataService.class);
        //dataServiceMock.retrieveAllData() => new int[] {24,15,6}
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {16});
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceMock);
        int result = someBusiness.findTheGreatestFromAllData();
        assertEquals(16,result);
    }
}
