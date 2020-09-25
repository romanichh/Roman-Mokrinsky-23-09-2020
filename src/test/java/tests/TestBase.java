package tests;

import fw.ApplicationManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.util.Arrays;

public class TestBase {

    public static ApplicationManager app = new ApplicationManager();

    Logger logger = LoggerFactory.getLogger(TestBase.class);

    @BeforeMethod
    public void startTestLog(Method m, Object[] parameter) {
        logger.info("Start test" + m.getName() + "with parameters" + Arrays.asList(parameter));
    }

    @AfterMethod
    public void stoptestLog(Method m) {
        logger.info("Stop test" + m.getName());

    }

    @BeforeClass
    public void setUp() {
        app.init();

    }

    @AfterClass
    public void tearDown() {
        app.stop();
    }


}
