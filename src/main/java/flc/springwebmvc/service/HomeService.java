package flc.springwebmvc.service;

import org.springframework.stereotype.Service;

@Service 
public class HomeService {
    
//    @Autowired
//    private HomeController homeController;
    
    public String sayHello() {
        return "Ciao a tutti da HomeService";
    }
}
