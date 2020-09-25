package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FooterTests extends TestBase {

    @BeforeMethod
    public void preconditions() {
        if (!app.getSession().logoIsPresent()) {
            app.getSession().opening();
        }
    }


    @Test
    public void footerServices() {
        app.getFooterHelper().whatsappServiceOnLeftSide();
        app.getFooterHelper().socialMediaBar();
        app.getFooterHelper().facebookService();
        app.getFooterHelper().footerWhatsAppService();
        app.getFooterHelper().linkedInService();
    }

    @Test
    public void footerElements() throws InterruptedException {
        app.getFooterHelper().managerContactIsPresent();
        app.getFooterHelper().scrollUp();
    }
}
