package com.farmersmart.delivery.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farmersmart.delivery.entity.DeliveryEntity;
import com.farmersmart.delivery.entity.DeliveryRepository;
@Service
public class DeliveryService {
	private static final Logger logger =  LoggerFactory.getLogger(DeliveryService.class);

	@Autowired
	DeliveryRepository repository;
	
	String response;
	
	public String addDeliveryDetails(DeliveryEntity entity) {
		// TODO Auto-generated method stub
		System.out.println(entity.toString());
		logger.info(entity.toString());
		repository.save(entity);
		response = "Added successfully";
		logger.info(response);
		return response;
	}

	public String updateDeliveryDetails(DeliveryEntity entity) {
		// TODO Auto-generated method stub
		System.out.println(entity.toString());
		logger.info(entity.toString());
		repository.save(entity);
		response = "Updated successfully";
		logger.info(response);
		return response;
	}

	public List<DeliveryEntity> getDeliveryDetails() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public Optional<DeliveryEntity> getDeliveryDetailsById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	public Optional<DeliveryEntity> getDeliveryDetailsByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		return repository.findByCustomerId(customerId);
	}

	public String deleteDeliveryDetailsById(int id) {
		// TODO Auto-generated method stub
		try {
			repository.deleteById(id);
			response = "Deleted successfully";
			logger.info(response);
			return response;
		} catch (Exception e) {
			// TODO: handle exception
			response = "Invalid ID: "+id;
			logger.error(response);
			return response;
		}
	}

	public String deleteDeliveryDetailsByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		try {
			repository.deleteByCustomerId(customerId);
			response = "Deleted successfully";
			logger.info(response);
			return response;
		} catch (Exception e) {
			// TODO: handle exception
			response = "Invalid ID: "+customerId;
			logger.error(response);
			return response;
		}
	}

}
