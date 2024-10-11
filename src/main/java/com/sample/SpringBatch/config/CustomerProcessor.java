package com.sample.SpringBatch.config;

import org.springframework.batch.item.ItemProcessor;

import com.sample.SpringBatch.binding.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer>
{
	public Customer process(Customer item)
	{
		
		//logic to process/filter
		System.out.println("Processor");
		return item;
		
	
			
	}

}
