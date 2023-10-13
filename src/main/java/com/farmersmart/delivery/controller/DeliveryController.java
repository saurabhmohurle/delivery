package com.farmersmart.delivery.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.farmersmart.delivery.entity.DeliveryEntity;
import com.farmersmart.delivery.service.DeliveryService;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {
	private static final Logger logger = LoggerFactory.getLogger(DeliveryController.class);
	
	@Autowired
	DeliveryService service;
	String response;
	
	@PostMapping("/addDeliveryDetails")
	public String addDeliveryDetails(@RequestBody DeliveryEntity entity) {
		service.addDeliveryDetails(entity);
		response = "Added successfully";
		logger.info(response);
		return response;
	}
	@PutMapping("/updateDeliveryDetails")
	public String updateDeliveryDetails(@RequestBody DeliveryEntity entity) {
		service.updateDeliveryDetails(entity);
		response = "Updated successfully";
		logger.info(response);
		return response;
	}
	@GetMapping("/getDeliveryDetails")
	public List<DeliveryEntity> getDeliveryDetails( ) {
		return service.getDeliveryDetails();
	}
	@GetMapping("/getDeliveryDetailsById")
	public Optional<DeliveryEntity> getDeliveryDetailsById( @RequestParam int id) {
		return service.getDeliveryDetailsById(id);
	}
	@GetMapping("/getDeliveryDetailsByCustomerId")
	public Optional<DeliveryEntity> getDeliveryDetailsByCustomerId( @RequestParam int customerId) {
		return service.getDeliveryDetailsByCustomerId(customerId);
	}
	@DeleteMapping("/deleteDeliveryDetailsById")
	public String deleteDeliveryDetailsById( @RequestParam int id) {
		service.deleteDeliveryDetailsById(id);
		 response = "Deleted successfully";
		 logger.info(response);
		 return response;
	}
	@DeleteMapping("/deleteDeliveryDetailsByCustomerId")
	public String deleteDeliveryDetailsByCustomerId( @RequestParam int CustomerId) {
		service.deleteDeliveryDetailsByCustomerId(CustomerId);
		return "Deleted successfully";
	}
}
