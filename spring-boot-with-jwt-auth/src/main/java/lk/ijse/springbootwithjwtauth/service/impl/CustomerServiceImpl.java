package lk.ijse.springbootwithjwtauth.service.impl;


import lk.ijse.springbootwithjwtauth.dto.CustomerDTO;
import lk.ijse.springbootwithjwtauth.entity.CustomerEntity;
import lk.ijse.springbootwithjwtauth.repository.CustomerRepository;
import lk.ijse.springbootwithjwtauth.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dewmith Mihisara
 * @date 2024-04-04
 * @since 0.0.1
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final ModelMapper mapper;
    public CustomerServiceImpl(CustomerRepository customerRepository, ModelMapper mapper) {
        this.customerRepository = customerRepository;
        this.mapper = mapper;
    }
    @Override
    public List<CustomerDTO> getAllCustomers() {
        return mapper.map(customerRepository.findAll(), new TypeToken<ArrayList<CustomerDTO>>() {
        }.getType());
    }

    @Override
    public CustomerDTO getCustomer(Long id) {
        return mapper.map(customerRepository.findById(id).get(), CustomerDTO.class);
    }

    @Override
    public CustomerDTO saveCustomer(CustomerDTO dto) {
        return mapper.map(customerRepository.save(mapper.map(dto, CustomerEntity.class)), CustomerDTO.class);
    }

    @Override
    public void updateCustomer(Long id, CustomerDTO dto) {
        dto.setId(id);
        mapper.map(customerRepository.save(mapper.map(dto, CustomerEntity.class)), CustomerDTO.class);
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
