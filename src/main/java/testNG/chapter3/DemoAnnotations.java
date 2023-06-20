package testNG.chapter3;

import org.testng.annotations.*;

public class DemoAnnotations {

    @BeforeMethod
    public static void setUp() {
        System.out.println("setUp");
    }

    public static void main(String[] args) {

        setUp();
    }

}
