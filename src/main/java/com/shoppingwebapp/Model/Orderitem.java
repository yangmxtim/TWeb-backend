package com.shoppingwebapp.Model;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Orderitem {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer order_item_id;
	
	private String status;
	
	private Date date;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private Order_detail order_detail;
	
	@OneToOne
	@JoinColumn(name = "product_detail_id")
	private Product_detail productdetail;

	public Orderitem() {
		super();
	}

	public Orderitem(Integer order_item_id, String status, Date date, Order_detail order_detail,
			Product_detail productdetail) {
		super();
		this.order_item_id = order_item_id;
		this.status = status;
		this.date = date;
		this.order_detail = order_detail;
		this.productdetail = productdetail;
	}

	public Integer getOrder_item_id() {
		return order_item_id;
	}

	public void setOrder_item_id(Integer order_item_id) {
		this.order_item_id = order_item_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Order_detail getOrder_detail() {
		return order_detail;
	}

	public void setOrder_detail(Order_detail order_detail) {
		this.order_detail = order_detail;
	}

	public Product_detail getProductdetail() {
		return productdetail;
	}

	public void setProductdetail(Product_detail productdetail) {
		this.productdetail = productdetail;
	}

	@Override
	public String toString() {
		return "Orderitem [order_item_id=" + order_item_id + ", status=" + status + ", date=" + date + ", order_detail="
				+ order_detail + ", productdetail=" + productdetail + "]";
	}

	

	
	
	
}