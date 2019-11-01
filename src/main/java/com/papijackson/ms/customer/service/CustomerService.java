package com.papijackson.ms.customer.service;

import com.papijackson.ms.customer.entity.CustomerEntity;

import java.util.List;

public interface CustomerService {
    void save(CustomerEntity customer);

     /**
      * Find customer by id
      * @param id customer Id
      */
    CustomerEntity findById(String id);


    List<CustomerEntity> findAll();
}
