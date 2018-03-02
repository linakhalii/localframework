import com.epam.aqa.khalii.framework.core.BaseTest;
import com.epam.aqa.khalii.framework.core.data.reporter.ReporterLog;
import com.epam.aqa.khalii.framework.pages.MainPage;
import com.epam.aqa.khalii.framework.pages.ProductPage;
import com.epam.aqa.khalii.framework.steps.MainPageSteps;
import com.epam.aqa.khalii.framework.steps.ProductPageSteps;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SmallDemoTest extends BaseTest{

    MainPage mainPage;
    MainPageSteps mainSteps;
    ProductPage productPage;
    ProductPageSteps productSteps;

    @BeforeMethod
    public void windowMaximizer() {
        getDriver().manage().window().maximize();
    }

    @Test
    public void checkNavigationAndSearch(){
        ReporterLog.reportStep("1. Open main page");
        open();
        mainPage = new MainPage();
        mainSteps = new MainPageSteps(mainPage);
        ReporterLog.reportStep("2. Navigate to Mobile phones page");
        productPage = mainSteps.navigateToMobilePhones();
        ReporterLog.reportStep("3. Search 'asus' query on it");
        productSteps = new ProductPageSteps(productPage);
        productSteps.verifySearchOnProductPage();
    }
}
