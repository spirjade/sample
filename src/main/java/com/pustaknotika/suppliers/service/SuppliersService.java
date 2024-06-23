package com.pustaknotika.suppliers.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pustaknotika.suppliers.dao.ISuppliersDao;
import com.pustaknotika.suppliers.pojo.PntkSuppliers;

@Service("pntkSuppliersService")
public class SuppliersService implements ISuppliersService {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SuppliersService.class);
	@Autowired
	ISuppliersDao supplierDao;
	
	@Override
	public PntkSuppliers getSupplier(int supplierId) {
		
		LOGGER.info("Inside SuppliersService->getSupplier");
		return supplierDao.getSupplier(supplierId);
	}	
	
	@Override
	public PntkSuppliers addSupplier(PntkSuppliers supplier) {
		
		LOGGER.info("Inside SuppliersService->addSupplier");
		return supplierDao.addSupplier(supplier);
		
	}

	@Override
	public PntkSuppliers updateSupplier(PntkSuppliers supplier) {
		
		LOGGER.info("Inside SuppliersService->updateSupplier");
		return supplierDao.updateSupplier(supplier);
		
	}
	
	@Override
	public PntkSuppliers deleteSupplier(PntkSuppliers supplier) {
		
		LOGGER.info("Inside SuppliersService->deleteSupplier");
		return supplierDao.deleteSupplier(supplier);
		
	}
	


}
