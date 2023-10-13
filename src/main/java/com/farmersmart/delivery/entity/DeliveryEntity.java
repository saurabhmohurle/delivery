package com.farmersmart.delivery.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Delivery")
public class DeliveryEntity {
	@Id
	private int id;
	private int customerId;
	private String customerName;
	private String customerAddress;
	private int productQuantity;
	/**
	 * 
	 */
	public DeliveryEntity() {
		super();
	}
	/**
	 * @param id
	 * @param customerId
	 * @param customerName
	 * @param customerAddress
	 * @param productQuantity
	 */
	public DeliveryEntity(int id, int customerId, String customerName, String customerAddress, int productQuantity) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.productQuantity = productQuantity;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the customerId
	 */
	public int getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @return the customerAddress
	 */
	public String getCustomerAddress() {
		return customerAddress;
	}
	/**
	 * @param customerAddress the customerAddress to set
	 */
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	/**
	 * @return the productQuantity
	 */
	public int getProductQuantity() {
		return productQuantity;
	}
	/**
	 * @param productQuantity the productQuantity to set
	 */
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	@Override
	public String toString() {
		return "DeliveryEntity [id=" + id + ", customerId=" + customerId + ", customerName=" + customerName
				+ ", customerAddress=" + customerAddress + ", productQuantity=" + productQuantity + "]";
	}
	
	
}
