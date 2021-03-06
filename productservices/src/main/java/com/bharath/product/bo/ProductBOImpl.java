package com.bharath.product.bo;

import com.bharath.product.dao.ProductDAO;
import com.bharath.product.dto.Product;

public class ProductBOImpl implements ProductBO {
	
	private ProductDAO dao;
	
	@Override
	public void create(Product product) {
		// TODO Auto-generated method stub
		dao.create(product);
		
	}

	@Override
	public Product findProduct(int id) {
		// TODO Auto-generated method stub
		return dao.read(id);
		
	}
	public ProductDAO getDao() {
		return dao;
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

}
