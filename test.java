package com.javafortesters.junit;
import JavaForTesters.TestAppEnv;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;



public class test {

    @Test
    public void test44()
    {
        Integer ddd = new Integer(4);
        
    }
    
    @Test
    public void ddd(){
        assertEquals("dasda","b" ,Integer.toHexString(11));
    }

    @Test
    public void one(){
        Integer five = 5;
        assertEquals("is 5", 5, five.intValue());
        System.out.println(five.intValue());
    }

    @Test
    public void das(){
        assertEquals("Integer.MAX_VALUE", Integer.MAX_VALUE,2147483647 );
        assertEquals("Integer.MIN_VALUE", Integer.MIN_VALUE,-2147483648 );
    }

    @Test
    public void dasda(){
        assertEquals("returns", "http://192.123.0.3:67", TestAppEnv.getUrl() );

    }
}



