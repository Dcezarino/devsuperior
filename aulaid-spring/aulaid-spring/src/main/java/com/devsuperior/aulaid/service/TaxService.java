package com.devsuperior.aulaid.service;

import org.springframework.stereotype.Service;

@Service
public class TaxService {

	public Double tax(Double value) {
		return value * 0.1;
	}

}
