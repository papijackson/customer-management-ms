package com.papijackson.ms.customer.service.impl;

import com.papijackson.ms.customer.entity.CustomerEntity;
import com.papijackson.ms.customer.service.CustomerService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceTest {

    private CustomerService customerService = new CustomerServiceImpl();

    @Test
    public void createCustomerTests() {
        //given a basic customer
        CustomerEntity customer = CustomerEntity.builder()
                .id("00000001")
                .name("Jacques FAYE").build();
        // when
        customerService.save(customer);

    }

    @Test
    public void findCustomerTests() {
        //given an existing customer with Id "00000001"

        //when
        CustomerEntity customerEntity = customerService.findById("00000001");

        //Then
        Assert.assertEquals("00000001", customerEntity.getId());
        Assert.assertEquals("Papijackson",customerEntity.getName());


    }
}
