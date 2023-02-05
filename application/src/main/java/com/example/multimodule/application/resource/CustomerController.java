package com.example.multimodule.application.resource;

import com.example.multimodule.application.usecase.CustomerManager;
import com.example.multimodule.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/{crn}/customerCreate")
    public String customerCreate(@PathVariable("crn") String crn, Model model) {
        model.addAttribute("customer", new Customer(crn));
        return "customerCreate";
    }

    @GetMapping("/{id}/customerDetails")
    public String customerCreateGet(@PathVariable("id") String id, Model model) {
        model.addAttribute("customer", this.customerManager.findById(id));
        return "customerDetails";
    }

    @GetMapping("/{id}/customerEdit")
    public String customerEditGet(@PathVariable("id") String id, Model model) {
        model.addAttribute("customer", this.customerManager.findById(id));
        return "customerEdit";
    }

    @ResponseBody
    @RequestMapping(value="/{crn}/customerSearch", method= RequestMethod.GET)
    public Customer customerSearchGet(@PathVariable("crn") String crn) {
        Customer customerWeb = this.customerManager.findByCrn(crn);
        return this.customerManager.findByCrn(crn);
    }

    @ResponseBody
    @RequestMapping(value="/{crn}/containsView", method= RequestMethod.GET)
    public List<Customer> getAllContains(@PathVariable("crn") String crn) {
        List<Customer> customers = this.customerManager.findAllByCrn(crn);
        return customers;
    }
    @PostMapping("/createCustomer")
    public String createCustomer(Customer customer) {
        Customer saved = this.customerManager.createCustomer(customer);
        //model.addAttribute("customer", saved);
        return "customerHome";
    }

    @PostMapping("/updateCustomer")
    public String updateCustomer(Customer customer, Model model) {
        Customer saved = this.customerManager.updateCustomer(customer);
        model.addAttribute("customer", saved);
        return "customerDetails";
    }
}
