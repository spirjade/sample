package com.pustaknotika.suppliers.controller;

import javax.security.sasl.AuthenticationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pustaknotika.suppliers.pojo.PntkSuppliers;
import com.pustaknotika.suppliers.service.ISuppliersService;

@RestController

public class SuppliersRestController {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SuppliersRestController.class);
	
	@Autowired
	ISuppliersService supplierService;
	
	@PostMapping("/getSupplier")
	public PntkSuppliers getSupplier(@RequestBody PntkSuppliers supplier) 
			throws AuthenticationException{

		LOGGER.info("Inside SuppliersRestController-> getSupplier");
		LOGGER.info("@RequestParam "+ supplier.getSupplierId());
		return supplierService.getSupplier(supplier.getSupplierId());	
	}
	
	@PostMapping("/supplier")
	public PntkSuppliers addSupplier(@RequestBody PntkSuppliers supplier)
			throws AuthenticationException {

		LOGGER.info("Inside SuppliersRestController-> addSupplier");
		LOGGER.info("@RequestBody"+ supplier);
		return supplierService.addSupplier(supplier);
	}
			
	@PutMapping("/updateSupplier")
	public PntkSuppliers updateSupplier(@RequestBody PntkSuppliers supplier) 
			throws AuthenticationException{

		LOGGER.info("Inside SuppliersRestController-> updatesupplier");
		LOGGER.info("@RequestParam "+supplier.getSupplierId());
		return supplierService.updateSupplier(supplier);
	}	

	@PutMapping("/deleteSupplier")
	public PntkSuppliers deleteSupplier(@RequestBody PntkSuppliers supplier) 
			throws AuthenticationException{

		LOGGER.info("Inside SuppliersRestController-> deletesupplier");
		LOGGER.info("@RequestParam "+ supplier.getSupplierId());
		return supplierService.deleteSupplier(supplier);
	}		
}
