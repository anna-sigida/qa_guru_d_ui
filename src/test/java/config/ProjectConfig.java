package config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({
        "classpath:${env}.properties"
})

public interface ProjectConfig extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    Browsers getBrowser();

    @Key("browserVersion")
    String browserVersion();

    @Key("remoteUrl")
    String remoteUrl();

    @Key("baseUrl")
    String baseUrl();

}
