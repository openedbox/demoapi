package demoapi.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@ConfigurationProperties(prefix = "demoapi", ignoreUnknownFields = true)
@Data
public class AppProperties {
    private String env;
    private String version;
}
