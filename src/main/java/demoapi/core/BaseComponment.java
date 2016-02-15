package demoapi.core;

import demoapi.config.AppProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.text.SimpleDateFormat;

@Slf4j
@EnableConfigurationProperties(AppProperties.class)
public abstract class BaseComponment implements ApplicationContextAware {

    @Autowired
    protected AppProperties config = new AppProperties();

    protected final ObjectMapper mapper;

    protected final SimpleDateFormat simpleDateFormat;

    protected final SimpleDateFormat longDateFormat;

    public BaseComponment(){

        this.mapper = new ObjectMapper();
        this.simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        this.longDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    protected ApplicationContext applicationContext;
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }
}
