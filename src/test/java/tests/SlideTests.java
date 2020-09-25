package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SlideTests extends TestBase {

    @BeforeMethod
    public void preconditions() {
        if (!app.getSession().logoIsPresent()) {
            app.getSession().opening();
        }
    }

    @Test
    public void slideOnPageTests() throws InterruptedException {
        app.getSlide().clientGoogleIsPresent();

    }


}
