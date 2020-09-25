package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MessagesTests extends TestBase {

    @BeforeMethod
    public void preconditions() {
        if (!TestBase.app.getSession().logoIsPresent()) {
            TestBase.app.getSession().opening();
        }
    }

    @Test
    public void footerMessageSending() {
        app.getMessage().sendingOfFooterMessage();
    }

    @Test
    public void contactMessageSending() {
        app.getMessage().sendingOfContactMessage();
    }

    @Test
    public void messageFromPopUp() {
        app.getMessage().sendingMessageFromPopUp();
    }
}
