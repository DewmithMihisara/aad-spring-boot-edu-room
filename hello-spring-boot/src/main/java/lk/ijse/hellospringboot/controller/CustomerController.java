package lk.ijse.hellospringboot.controller;

import lk.ijse.hellospringboot.dto.CustomerDTO;
import lk.ijse.hellospringboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

/**
 * @author Dewmith Mihisara
 * @date 2024-04-04
 * @since 0.0.1
 */
@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;
    @GetMapping
    public List<CustomerDTO> getCustomers(){
        return customerService.getAllCustomers();
    }
    @PostMapping
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO dto){
        return customerService.saveCustomer(dto);
    }
    @PutMapping("/{id}")
    public void updateCustomer(@PathVariable Long id,@RequestBody CustomerDTO dto){
        customerService.updateCustomer(id,dto);
    }
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id){
        customerService.deleteCustomer(id);
    }
}
