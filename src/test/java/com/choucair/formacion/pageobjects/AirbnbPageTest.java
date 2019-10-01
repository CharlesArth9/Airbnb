package com.choucair.formacion.pageobjects;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;

public class AirbnbPageTest {

    private AirbnbPage airbnbPageUnderTest;

    @BeforeMethod
    public void setUp()
    {
        //hola
        airbnbPageUnderTest.open();
        airbnbPageUnderTest = new AirbnbPage();
    }

    @Test
    public void testExpresionR() {
        // Setup

        // Run the test
        airbnbPageUnderTest.expresionR();
        // Verify the results
    }

    @Test
    public void testExcelente() throws Exception {
        // Setup
        // Run the test
        //  airbnbPageUnderTest.excelente();
        // Verify the results
    }

    @Test(expectedExceptions = {AWTException.class})
    public void testExcelente_ThrowsAWTException() throws Exception {
        // Setup
        // Run the test
        //   airbnbPageUnderTest.excelente();
    }
}
