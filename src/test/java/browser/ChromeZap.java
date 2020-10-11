package browser;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ChromeZap implements IBrowser{
    @Override
    public WebDriver create(){
        String driverPath="D:\\Leonor\\DIPLOMADO-TESTING\\MODULO-4\\codigo\\vulnerabilidad\\src\\test\\resources\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        //Información para que levante apuntando a un puerto (PROXY)
        // 1ro. Preferencias
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("credential_enable_service", false);

        // 2do. Proxy
        Proxy proxy = new Proxy();
        proxy.setHttpProxy("127.0.0.1:8888");
        proxy.setSslProxy("127.0.0.1:8888");

        // 3ro. Capabilities
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability("proxy",proxy);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("ignore-certificate-errors");
        options.setExperimentalOption("prefs",prefs);

        capabilities.setCapability(ChromeOptions.CAPABILITY,options);

        ChromeDriver driver = new ChromeDriver(capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }
}
