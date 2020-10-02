package com.sb.training.policyservicesb.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Policy")
public class Policy {
	
	@Id
	private String policyID;
	private String policyType;
	private Date policyEffectiveDate;
	private Date policyEndDate;
	private Customer customerDetails;
	public String getPolicyID() {
		return policyID;
	}
	public void setPolicyID(String policyID) {
		this.policyID = policyID;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public Date getPolicyEffectiveDate() {
		return policyEffectiveDate;
	}
	public void setPolicyEffectiveDate(Date policyEffectiveDate) {
		this.policyEffectiveDate = policyEffectiveDate;
	}
	public Date getPolicyEndDate() {
		return policyEndDate;
	}
	public void setPolicyEndDate(Date policyEndDate) {
		this.policyEndDate = policyEndDate;
	}
	public Customer getCustomerDetails() {
		return customerDetails;
	}
	public void setCustomerDetails(Customer customerDetails) {
		this.customerDetails = customerDetails;
	}
	
	
}
