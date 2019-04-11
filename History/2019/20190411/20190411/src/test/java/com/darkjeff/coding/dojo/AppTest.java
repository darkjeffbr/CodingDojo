package com.darkjeff.coding.dojo;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    public App app;

    @Before
    public void setUp(){
        app = new App();
    }

    @Test
public void testMultipleThreeFive(){
    Assert.assertEquals(app.findFizzBuzz(1), "1");
    Assert.assertEquals(app.findFizzBuzz(3), "Fizz");
    Assert.assertEquals(app.findFizzBuzz(5), "Buzz");
    Assert.assertEquals(app.findFizzBuzz(15), "FizzBuzz");
    Assert.assertEquals(app.findFizzBuzz(100), "Buzz");
}

    public void testListSize(){
        Assert.assertEquals(app.getList().size(), 100);
    }

    public void testListElement(){
        Assert.assertEquals(app.getList().size(), 100);
    }

//    public void testListStdout(){
//        Assert.assertEquals(app.getList(1, 100), );
//
//    }
}
