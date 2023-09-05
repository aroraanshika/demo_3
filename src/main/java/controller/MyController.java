package controller;

import entities.employees;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @GetMapping("/home")
    public String home(){

        return "Welcome to home page";
    }

    @GetMapping("/employees")
    public List<employees> getemployees(){



    }
}
