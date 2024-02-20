package com.learning.springbatch.config;

import com.learning.springbatch.entity.Customer;
import org.springframework.batch.item.ItemProcessor;


public class CustomerProcessor implements ItemProcessor<Customer, Customer> {
    @Override
    public Customer process(Customer customer) throws Exception {
        if(customer.getCountry().equals("Ukraine"))
            return customer;
        else
            return null;
    }
}
