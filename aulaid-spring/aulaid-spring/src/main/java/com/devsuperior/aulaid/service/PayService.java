package com.devsuperior.aulaid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayService {
	
	@Autowired
	private TaxService taxService;
	
	@Autowired
	private DeliverService deliverService;
	
//	public PayService(TaxService taxService, DeliverService deliverService) {	
//		this.taxService = taxService;
//		this.deliverService = deliverService;
//	}
	
	public Double finalPrice(Double cost, String state) {		
		return cost + taxService.tax(cost) + deliverService.fee(state);		
	}
		
}
