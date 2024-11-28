package config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;


public class DriverConfig {

    private static final ProjectConfig config = ConfigFactory.create(ProjectConfig.class, System.getProperties());

    public static void configWebDriver() {

        Configuration.remote = config.remoteUrl();
        Configuration.pageLoadStrategy = "eager";

        switch (config.getBrowser()) {
            case CHROME: {
                Configuration.browser = "chrome";
                break;
            }
            case FIREFOX: {
                Configuration.browser = "firefox";
                break;
            }
            default:
                throw new RuntimeException("No such driver");
        }

        Configuration.browserVersion = config.browserVersion();
        Configuration.baseUrl = config.baseUrl();
    }
}
