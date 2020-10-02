package com.sb.training.policyservicesb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.training.policyservicesb.model.Customer;
import com.sb.training.policyservicesb.model.Policy;
import com.sb.training.policyservicesb.repository.PolicyRepository;

@Service
public class PolicyService {
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	PolicyRepository policyRepository;
	
	public Policy createPolicy(Policy policy) {
		Customer customer;
		//In the class
		customer = customerService.getCustomerDetails(policy.getCustomerDetails().getCustomerId());
		
		// Ex: 3 - Usage of getForObject
		 		//customer = customerService.getCustomerDetailsByObject(policy.getCustomerDetails().getCustomerId());
				
		//** Ex: 3 - Usage of exchange
		//customer = customerService.getCustomerDetailsByExchange(policy.getCustomerDetails().getCustomerId()); **/
		
		
		policy.setCustomerDetails(customer);
		return policyRepository.save(policy);
	}

	public List<Policy> getPolicies() {
		return policyRepository.findAll();
	}

	
	
}
