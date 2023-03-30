package flc.springwebmvc;

import flc.springwebmvc.controller.HomeController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//gestisce tutti i controller

@Configuration  //SERVE A GESTIRE LE ANNOTAZIONI BEAN ALL'INTERNO
@ComponentScan(basePackages = "flc.springwebmvc.controller")
public class FrontControllerContextConfig {
    
//    @Bean("/")
//    public HomeController homeController(){
//        return new HomeController();
//    }
    
//    @Bean
//    public HandlerMapping beanNameUrHandlerMapping(){
//        return new BeanNameUrlHandlerMapping();
//    }
    
    @Bean
    public HandlerMapping beanNameUrHandlerMapping(){
        return new RequestMappingHandlerMapping();
    }
    
    
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        
        return resolver;
    }   
    
}
