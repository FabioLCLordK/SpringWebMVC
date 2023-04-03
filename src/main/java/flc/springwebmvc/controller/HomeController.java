/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flc.springwebmvc.controller;

import flc.springwebmvc.service.HomeService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private HomeService homeService;
     
    
//    @Override
//    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response){
//        ModelAndView modelAndView = new ModelAndView("index");
//        modelAndView.addObject("message", homeService.sayHello());
//        return modelAndView;
//    }
    
    //OPPURE
    
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView readPage(){
        
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message", homeService.sayHello());
        return modelAndView;
    }
    
    //@RequestMapping(value = "/about", method = RequestMethod.GET)
    //oppure invece
    @GetMapping(value ="/about")
    public ModelAndView about(){
        
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message", "roba riguardo noi");
        return modelAndView;
    }
    
      
}
