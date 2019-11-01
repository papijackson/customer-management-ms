package com.papijackson.ms.customer.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerEntity {

    /**
     * Customer Id
     */
    private String id;

    /**
     * Customer name
     */
    private String name;
}
