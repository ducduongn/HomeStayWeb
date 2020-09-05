package uet.homestay.webapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan({ "uet.homestay.webapp.web" })

public class MVCConfig
        extends WebMvcConfigurerAdapter {
}
