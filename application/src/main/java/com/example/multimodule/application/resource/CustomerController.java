package com.example.multimodule.application.resource;

import com.example.multimodule.application.usecase.CustomerManager;
import com.example.multimodule.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CustomerController {

    @Autowired
    private CustomerManager customerManager;

    public CustomerController(CustomerManager customerManager) {
        this.customerManager = customerManager;
    }

    @GetMapping("/")
    public String index() {
        return "redirect:/customerHome";
    }

    @GetMapping("/customerHome")
    public String customerHomeGet() {
        return "customerHome";
    }

    @GetMapping("/customerCreate")
    public String customerCreateGet() {
        return "customerCreate";
    }

    @ResponseBody
    @RequestMapping(value="/{crn}/customerSearch", method= RequestMethod.GET)
    public Customer customerSearchGet(@PathVariable("crn") String crn) {
        Customer customerWeb = this.customerManager.findByCrn(crn);
        return this.customerManager.findByCrn(crn);
    }

    @PostMapping("/customerHome")
    public String formPost(Customer customer, Model model) {
        Customer saved = this.customerManager.createCustomer(customer);
        model.addAttribute("customer", saved);
        return "customerHome";
    }
}
