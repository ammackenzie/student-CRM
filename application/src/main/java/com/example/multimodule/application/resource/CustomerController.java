package com.example.multimodule.application.resource;

import com.example.multimodule.entity.Customer;
import com.example.multimodule.repository.MongoCustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    private MongoCustomerRepository repository;

    public CustomerController(MongoCustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String index() {
        return "redirect:/customerHome";
    }

    @GetMapping("/customerHome")
    public String customerHomeGet() {
        return "customerHome";
    }

    @ResponseBody
    @RequestMapping(value="/{crn}/customerSearch", method= RequestMethod.GET)
    public String customerSearchGet(@PathVariable("crn") String crn) {
        Optional<Customer> customer = this.repository.findByCrn(crn);
        return customer.isPresent() ? customer.get().getFirstName() : "";
    }

    @PostMapping("/customerHome")
    public String formPost(Customer customer, Model model) {
        Customer saved = this.repository.save(customer);
        model.addAttribute("customer", saved);
        return "customerHome";
    }
}
