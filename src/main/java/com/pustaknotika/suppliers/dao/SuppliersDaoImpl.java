package com.pustaknotika.suppliers.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pustaknotika.suppliers.mapper.PntkSupplierRowMapper;
import com.pustaknotika.suppliers.pojo.PntkSuppliers;

@Repository("pntkSuppliersDao")
public class SuppliersDaoImpl implements ISuppliersDao {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SuppliersDaoImpl.class);

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Autowired
	private Environment env;
	
	@Override
	public PntkSuppliers getSupplier(int supplierId) {
		String sql= env.getProperty("SELECT_SUPPLIER");

		Map<String, Object> args = new HashMap<String, Object>();
		args.put("supplierId", supplierId);
		PntkSuppliers supplier = null;
		List<PntkSuppliers> suppliers = null;
		
		// Get a Supplier from DB
		try {
			suppliers = jdbcTemplate.query(sql, args, new PntkSupplierRowMapper());
			
			// logger
			LOGGER.info("{} SupplierId Selected", suppliers.size());
			
		}catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		if (suppliers.size()>0) {
			supplier = suppliers.get(0);
		}
		
		return supplier;
	}	

	@Override
	public PntkSuppliers addSupplier(PntkSuppliers supplier) {
		String sql= env.getProperty("ADD_SUPPLIER");

		Map<String, Object> args = new HashMap<String, Object>();
	
		args.put("supplierId", supplier.getSupplierId()>0?supplier.getSupplierId():null);
		args.put("supplierName", supplier.getSupplierName());
		args.put("supplierUserName", supplier.getSupplierUserName());
		args.put("phoneNumber", supplier.getPhoneNumber());
		args.put("countryCode", supplier.getCountryCode());
		args.put("state", supplier.getState());
		args.put("city", supplier.getCity());
		args.put("area", supplier.getArea());
		args.put("address", supplier.getAddress());
		args.put("pinCode", supplier.getPinCode());
		args.put("isActive", supplier.getIsActive());
		args.put("longitude", supplier.getLongitude());
		args.put("latitude", supplier.getLatitude());
		args.put("referralCode", supplier.getReferralCode());

		
		// Add Supplier in Database
		try {
			int i = jdbcTemplate.update(sql, args);
			// logger

			LOGGER.info("Supplier {} Created successfully", supplier.getSupplierName());
			LOGGER.info("{} record inserted", i);
		}catch (Exception e) {
			
			e.printStackTrace();

		}
		
		return supplier;

	}	

	@Override
	public PntkSuppliers updateSupplier(PntkSuppliers supplier) {
		String sql= env.getProperty("UPDATE_SUPPLIER");

		Map<String, Object> args = new HashMap<String, Object>();
	
		args.put("supplierId", supplier.getSupplierId());
		args.put("supplierName", supplier.getSupplierName());
		args.put("supplierUserName", supplier.getSupplierUserName());
		args.put("phoneNumber", supplier.getPhoneNumber());
		args.put("countryCode", supplier.getCountryCode());
		args.put("state", supplier.getState());
		args.put("city", supplier.getCity());
		args.put("area", supplier.getArea());
		args.put("address", supplier.getAddress());
		args.put("pinCode", supplier.getPinCode());
		args.put("isActive", supplier.getIsActive());
		args.put("longitude", supplier.getLongitude());
		args.put("latitude", supplier.getLatitude());
		args.put("referralCode", supplier.getReferralCode());

		
		// update Supplier in Database
		try {
			int i = jdbcTemplate.update(sql, args);
			// logger

			LOGGER.info("Supplier {} Updated successfully", supplier.getSupplierName());
			LOGGER.info("{} record updated", i);
		}catch (Exception e) {
			
			e.printStackTrace();

		}
		
		return supplier;

	}		
	
	@Override
	public PntkSuppliers deleteSupplier(PntkSuppliers supplier) {
		String sql= env.getProperty("DELETE_SUPPLIER");

		Map<String, Object> args = new HashMap<String, Object>();
	
		args.put("supplierId", supplier.getSupplierId());
		
		// Deactivate Supplier in Database
		try {
			int i = jdbcTemplate.update(sql, args);
			// logger

			LOGGER.info("Supplier {} deactivated successfully", supplier.getSupplierName());
			LOGGER.info("{} record updated", i);
		}catch (Exception e) {
			
			e.printStackTrace();

		}
		
		return supplier;

	}		
}
