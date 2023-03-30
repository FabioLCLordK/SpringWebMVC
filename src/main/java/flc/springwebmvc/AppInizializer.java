package flc.springwebmvc;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class AppInizializer extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {RootAppContextConfig.class};  //prende tutte le info per la creazione in quella classe
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {FrontControllerContextConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
         return new String[] {"/"};
    }
     
}
