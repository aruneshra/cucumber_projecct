package Libarary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class CreateDriver {
    private static CreateDriver instance=null;
    private final int IMPLICIT_WAIT=0;
    private ThreadLocal<WebDriver> webDriver= new ThreadLocal<WebDriver>();
    private ThreadLocal<String> sessionID= new ThreadLocal<String>();
    private ThreadLocal<String> sessionBrowser= new ThreadLocal<String>();
    private ThreadLocal<String> SessionPlateform= new ThreadLocal<String>();
    private ThreadLocal<String> sessionVersion= new ThreadLocal<String>();
    private String getEnv=null;
    private Properties propert=new Properties();
    private CreateDriver(){
    }
    public static CreateDriver getInstance(){
        if(instance==null){
            instance=new CreateDriver();
        }
        return instance;
    }
    //, Map<String, Object>
    public final void setDriver(String browser, String plateform, String env) throws  Exception{
        DesiredCapabilities cap=null;
        String getPlateform=null;
        propert.load(new FileInputStream("adadda"));
        switch (browser){
            case "Chrome":
                cap=DesiredCapabilities.chrome();
                ChromeOptions chOption=new ChromeOptions();
                Map<String, Object> chromepref=new HashMap<String, Object>();
                chromepref.put("credentials_enable_service",false);
                chOption.setExperimentalOption("pref",chromepref);
                chOption.addArguments("--disable-plugins","--disable-extensions","--disable-popup-blocking");
                cap.setCapability(chOption.CAPABILITY,chOption);
                cap.setCapability("applicationCacheEnabled", false);
                if(env.equalsIgnoreCase("local")){
//             System.setProperty("webdriver.chrome.driver",propert.getProperty("chrome.driver.windows.path"));
                    System.setProperty("webdriver.chrome.driver","src/test/path");
                    webDriver.set(new ChromeDriver(chOption.
                            merge(cap)));
                }

                break;

        }
    }
}
