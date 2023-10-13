package com.farmersmart.delivery.entity;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<DeliveryEntity, Integer>{

	public Optional<DeliveryEntity> findByCustomerId(int customerId);

	public String deleteByCustomerId(int customerId);

}
