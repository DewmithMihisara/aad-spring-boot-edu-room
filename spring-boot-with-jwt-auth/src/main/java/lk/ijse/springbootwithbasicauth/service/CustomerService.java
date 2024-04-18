package lk.ijse.springbootwithbasicauth.service;

import lk.ijse.springbootwithbasicauth.dto.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Dewmith Mihisara
 * @date 2024-04-04
 * @since 0.0.1
 */
@Service
public interface CustomerService {
    List<CustomerDTO>getAllCustomers();
    CustomerDTO getCustomer(Long id);
    CustomerDTO saveCustomer(CustomerDTO dto);
    void updateCustomer(Long id,CustomerDTO dto);
    void deleteCustomer(Long id);
}
