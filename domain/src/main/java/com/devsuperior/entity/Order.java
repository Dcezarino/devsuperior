package com.devsuperior.entity;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "tb_order")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Instant moment;
	private OrderStatus status;
	
	//Na tabela tb_order, client_id (fk)
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;
	
	@OneToMany(mappedBy = "order")
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {
		
	}

	public Order(Long id, Instant moment, OrderStatus status, Client cliente) {		
		this.id = id;
		this.moment = moment;
		this.status = status;
		this.client = cliente;	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getCliente() {
		return client;
	}

	public void setCliente(Client cliente) {
		this.client = cliente;
	}

	public List<OrderItem> getItems() {
		return items;
	}	
	
	
	public Double getTotal() {
		
		Double sum = 0.0;
		
		for (OrderItem item : items) {
			sum += item.getSubTotal();		
		}
		
		return sum;
		
	}
	
	

}
