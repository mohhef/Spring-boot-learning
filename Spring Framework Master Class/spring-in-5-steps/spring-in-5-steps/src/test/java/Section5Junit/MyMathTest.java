package Section5Junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    MyMath myMath = new MyMath();

    @BeforeEach
    public void before(){
        System.out.println("before");
    }



    @Test
    public void sum_with3() {
        int result = myMath.sum(new int []{1,2,3});
        assertEquals(6, result);
    }

    @Test
    public void sum_with1() {
        int result = myMath.sum(new int []{3});
        assertEquals(3, result);
    }

    @BeforeTestClass
    public static void beforeTest(){
        System.out.println("before the class");
    }
}