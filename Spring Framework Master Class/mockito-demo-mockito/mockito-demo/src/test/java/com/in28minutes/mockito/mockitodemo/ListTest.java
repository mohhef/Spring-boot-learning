package com.in28minutes.mockito.mockitodemo;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    void listTest(){
        List listmock = mock(List.class);
        when(listmock.size()).thenReturn(10);
        assertEquals(10,listmock.size());
    }
    @Test
    void multipleReturs(){
        List listmock = mock(List.class);
        when(listmock.size()).thenReturn(10).thenReturn(20);
        assertEquals(10,listmock.size());
        assertEquals(20,listmock.size());
    }

    @Test
    void testGet(){
        List listmock = mock(List.class);
        when(listmock.get(0)).thenReturn("SomeString");
        assertEquals("SomeString",listmock.get(0));
        assertEquals(20,listmock.size());
    }
}
