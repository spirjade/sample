package com.pustaknotika.suppliers.service;

import com.pustaknotika.suppliers.pojo.PntkSuppliers;

public interface ISuppliersService {
	PntkSuppliers getSupplier(int supplierId);
	PntkSuppliers addSupplier(PntkSuppliers supplier);
	PntkSuppliers updateSupplier(PntkSuppliers supplier);
	PntkSuppliers deleteSupplier(PntkSuppliers supplier);
}
