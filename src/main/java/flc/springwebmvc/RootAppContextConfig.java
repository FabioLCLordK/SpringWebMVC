package flc.springwebmvc;

import flc.springwebmvc.service.HomeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//registraizone di tutti i beans
@Configuration
@ComponentScan(basePackages ="flc.springwebmvc.service")
public class RootAppContextConfig {
    
    @Bean
    public HomeService homeService(){
        return new HomeService();
    }
}
