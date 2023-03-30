package flc.springwebmvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class FrontControllerContextConfig {
    
    @Bean("/")
    public HomeController homeController(){
        return new HomeController();
    }
    
    @Bean
    public HandlerMapping beanNameUrHandlerMapping(){
        return new BeanNameUrlHandlerMapping();
    }
    
    
    
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        
        return resolver;
    }   
    
}
