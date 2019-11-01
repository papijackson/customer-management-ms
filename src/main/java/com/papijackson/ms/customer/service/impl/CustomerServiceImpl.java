package com.papijackson.ms.customer.service.impl;

import com.papijackson.ms.customer.entity.CustomerEntity;
import com.papijackson.ms.customer.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public void save(CustomerEntity customer) {
        //do nothing
    }

    @Override
    public CustomerEntity findById(String id) {
        return CustomerEntity.builder().id(id).name("Papijackson").build();
    }

    /**
     * Find all customers.
     * @return all customers
     */
    @Override
    public List<CustomerEntity> findAll() {
        List<CustomerEntity> customers = new ArrayList<CustomerEntity>();
        customers.add(CustomerEntity.builder().id("0000000001").name("PJ Corp").build());
        customers.add(CustomerEntity.builder().id("0000000002").name("Leo Corp").build());
        customers.add(CustomerEntity.builder().id("0000000003").name("AAF Corp").build());
        customers.add(CustomerEntity.builder().id("0000000004").name("NMM Corp").build());
        return customers;
    }
}
