/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flc.springwebmvc;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author LordKazor
 */
public class HomeService {
    
//    @Autowired
//    private HomeController homeController;
    
    public String sayHello() {
        return "Ciao a tutti da HomeService";
    }
}
