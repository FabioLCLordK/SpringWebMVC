/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flc.springwebmvc;

import java.lang.annotation.Annotation;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author LordKazor
 */
public class HomeController implements Controller{

    @Autowired
    private HomeService homeService;
    
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message", homeService.sayHello());
        return modelAndView;
    }
    
      
}
