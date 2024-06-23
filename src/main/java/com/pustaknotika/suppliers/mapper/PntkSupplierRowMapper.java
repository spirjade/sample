package com.pustaknotika.suppliers.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pustaknotika.suppliers.pojo.PntkSuppliers;

public class PntkSupplierRowMapper implements RowMapper<PntkSuppliers>{
	
	@Override
	public PntkSuppliers mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		PntkSuppliers supplier = new PntkSuppliers();
		supplier.setSupplierId(rs.getInt("supplierId"));
		supplier.setSupplierName(rs.getString("supplierName"));
		supplier.setSupplierName(rs.getString("supplierUserName"));
		supplier.setPhoneNumber(rs.getString("phoneNumber"));
		supplier.setCountryCode(rs.getString("countryCode"));
		supplier.setState(rs.getString("state"));
		supplier.setCity(rs.getString("city"));
		supplier.setArea(rs.getString("area"));
		supplier.setAddress(rs.getString("address"));
		supplier.setPinCode(rs.getString("pinCode"));
		supplier.setIsActive(rs.getBoolean("isActive"));
		supplier.setLongitude(rs.getDouble("longitude"));
		supplier.setLatitude(rs.getDouble("latitude"));
		supplier.setReferralCode(rs.getString("referralCode"));
		supplier.setCreatedDateTime(rs.getString("createdDateTime"));
		supplier.setLastUpdatedDateTime(rs.getString("lastUpdatedDateTime"));
		
		
		return supplier;
		
	}

}
