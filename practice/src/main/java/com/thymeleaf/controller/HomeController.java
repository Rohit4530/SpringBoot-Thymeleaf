package com.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/home")
     public String Home(Model modal){
         modal.addAttribute("name","Rohit Gunjal");
         modal.addAttribute("age",22);
         return "home";
     }
}
