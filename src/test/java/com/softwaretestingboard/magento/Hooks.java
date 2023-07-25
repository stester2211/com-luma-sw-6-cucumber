package com.softwaretestingboard.magento;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import com.softwaretestingboard.magento.propertyreader.PropertyReader;
import com.softwaretestingboard.magento.utilities.Utility;


public class Hooks extends Utility
{
    @Before
    public void setUp()
    {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }
    @After
    public void tearDown()
    {
        closeBrowser();
    }
}
