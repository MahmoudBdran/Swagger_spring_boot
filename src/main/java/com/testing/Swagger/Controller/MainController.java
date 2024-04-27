package com.testing.Swagger.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {


    @GetMapping({"/",""})
    public String index() {
        return "Hurraaaaaay!! it is working";
    }
    @GetMapping("/testTheTekton")
    public String testTheTekton() {
        return "Hurraaaaaay!! test page";
    }

}
