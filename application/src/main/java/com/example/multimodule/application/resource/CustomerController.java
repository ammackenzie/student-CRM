package com.example.multimodule.application.resource;

import com.example.multimodule.entity.Customer;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;

@Controller
public class CustomerController {

    @RequestMapping("/")
    public String customer() {
        Customer customer = new Customer("1111111111", "first", "last", ZonedDateTime.now());
        return "customerHome";
    }

    @GetMapping("/pr")
    public String pr(Model model)
    {
        model.addAttribute( "name", "testing" );
        return "steve";
    }
}
