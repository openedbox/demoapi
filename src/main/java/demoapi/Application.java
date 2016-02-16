package demoapi;

import demoapi.core.BaseComponment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Application extends BaseComponment implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("current system on " + config.getEnv());
        log.info("current version on " + config.getVersion());
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
