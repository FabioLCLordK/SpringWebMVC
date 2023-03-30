package flc.springwebmvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RootAppContextConfig {
    
    @Bean
    public HomeService homeService(){
        return new HomeService();
    }
}
