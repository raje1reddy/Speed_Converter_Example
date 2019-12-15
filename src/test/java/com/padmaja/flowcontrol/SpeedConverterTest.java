package com.padmaja.flowcontrol;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;



public class SpeedConverterTest {
    SpeedConverter speedConverter;
    @BeforeClass
    public static void setUpClass()
    {
        System.out.println("set up class");
        // ForLoopExample forLoopExample = new ForLoopExample();
    }
    @Before
    public void setUp(){
         speedConverter = new SpeedConverter();


    }

    @After
    public void tearDown(){
        System.out.println("tear down");


    }
/*
    @Test
    public void printDayOfTheWeek1() {
        int result = speedConverter.
        System.out.println(result);
        int expectedresult = 0;
        assertEquals(expectedresult,result);
    }


    @Test
    public void printDayOfTheWeek2() {
        int result = speedConverter.getRankBaseOfScore(1);
        System.out.println(result);
        int expectedresult = 1;
        assertEquals(expectedresult,result);
    }
    @Test
    public void printDayOfTheWeek3() {
        int result = speedConverter.getRankBaseOfScore(2);
        System.out.println(result);
        int expectedresult = 2;
        assertEquals(expectedresult,result);
    }

    @Test
    public void printDayOfTheWeek4() {
        int result = speedConverter.getRankBaseOfScore(3);
        System.out.println(result);
        int expectedresult = 3;
        assertEquals(expectedresult,result);
    }

    @Test
    public void printDayOfTheWeek5() {
        int result = speedConverter.getRankBaseOfScore(4);
        System.out.println(result);
        int expectedresult = 4;
        assertEquals(expectedresult,result);
    }

    @Test
    public void printDayOfTheWeek6() {
        int result = speedConverter.getRankBaseOfScore(5);
        System.out.println(result);
        int expectedresult = 5;
        assertEquals(expectedresult,result);
    }

    @Test
    public void printDayOfTheWeek7() {
        int result = speedConverter.getRankBaseOfScore(6);
        System.out.println(result);
        int expectedresult = 6;
        assertEquals(expectedresult,result);
    }
    @Test
    public void printDayOfTheWeek8() {
        int result = speedConverter.getRankBaseOfScore(7);
        System.out.println(result);
        int expectedresult = 7;
        assertEquals(expectedresult,result);
    }

    @Test
    public void printDayOfTheWeek9() {
        int result = speedConverter.getRankBaseOfScore(-1);
        System.out.println(result);
        int expectedresult = -1;
        assertEquals(expectedresult,result);
    }
*/
    @Test
    public void toMilesPerHour1() {
       // double result = speedConverter.
    }

    @Test
    public void printConversion() {
    }
}