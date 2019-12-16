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
    @Test
    public void toMilesPerHour1() {
        long milesresult = SpeedConverter.toMilesPerHour(10.5);
        System.out.println(" Miles = " + milesresult);
        SpeedConverter.printConversion(10.5);
        long expectedresult = 7;
        assertEquals(expectedresult,milesresult);
    }




    @Test
    public void toMilesPerHour10() {
        long milesresult = SpeedConverter.toMilesPerHour(0.5);
        System.out.println(" Miles = " + milesresult);
        SpeedConverter.printConversion(0.5);
        long expectedresult = 0;
        assertEquals(expectedresult,milesresult);
    }


    @Test
    public void toMilesPerHour1000() {
        long milesresult = SpeedConverter.toMilesPerHour(10000.5);
        System.out.println(" Miles = " + milesresult);
        SpeedConverter.printConversion(10000.5);
        long expectedresult = 6215;
        assertEquals(expectedresult,milesresult);
    }

    @Test
    public void toMilesPerHournegative() {
        long milesresult = SpeedConverter.toMilesPerHour(-100.5);
        System.out.println(" Miles = " + milesresult);
        SpeedConverter.printConversion(-100.5);
        long expectedresult = -1;
        assertEquals(expectedresult,milesresult);
    }

    @Test
    public void toMilesPerHournegativelarge() {
        long milesresult = SpeedConverter.toMilesPerHour(-1000000.5);
        System.out.println(" Miles = " + milesresult);
        SpeedConverter.printConversion(-1000000.5);
       long expectedresult = -1;
        assertEquals(expectedresult,milesresult);
    }
    @Test
    public void toMilesPerHourlarge() {
        long milesresult = SpeedConverter.toMilesPerHour(1000000000.5);
        System.out.println(" Miles = " + milesresult);
        SpeedConverter.printConversion(1000000000.5);
        long expectedresult = 621504040;
        assertEquals(expectedresult,milesresult);
    }






}