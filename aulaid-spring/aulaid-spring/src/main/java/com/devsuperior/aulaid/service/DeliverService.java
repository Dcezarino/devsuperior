package com.devsuperior.aulaid.service;

import org.springframework.stereotype.Service;

@Service
public class DeliverService {
	
	public Double fee(String state) {
		if("SP".equalsIgnoreCase(state)) {
			return 10.0;
		} else {
			return 20.0;
		}
	}

}
