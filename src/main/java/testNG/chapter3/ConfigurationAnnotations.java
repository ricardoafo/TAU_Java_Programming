package testNG.chapter3;

import org.testng.annotations.*;

public class ConfigurationAnnotations {
    @AfterClass
    public void afterClass() {
        System.out.println("afterClass");
    }
    @AfterGroups
    public void afterGroups() {
        System.out.println("afterGroups");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("afterTest");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass");
    }
    @BeforeGroups
    public void beforeGroups() {
        System.out.println("beforeGroups");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod");
    }
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("beforeTest");
    }
    @Test
    public void test() {
        System.out.println("test");
    }
}
