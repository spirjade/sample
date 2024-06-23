package com.pustaknotika.suppliers.dao;

import com.pustaknotika.suppliers.pojo.PntkSuppliers;

public interface ISuppliersDao {
	PntkSuppliers getSupplier(int supplierId);
	PntkSuppliers addSupplier(PntkSuppliers supplier);
	PntkSuppliers updateSupplier(PntkSuppliers supplier);
	PntkSuppliers deleteSupplier(PntkSuppliers supplier);

}
