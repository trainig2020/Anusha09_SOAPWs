package org.anusha;

import java.util.List;

import javax.jws.WebService;

import org.anusha.business.ProductServiceImpl;
import org.anusha.model.Product;

@WebService(endpointInterface = "org.anusha.ProductCatlogInterface", portName = "TestMartCatlogPort", serviceName = "TestMartCatlogService")
public class ProductCatlog implements ProductCatlogInterface {
	ProductServiceImpl productService = new ProductServiceImpl();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.anusha.ProductCatlogInterface#getProductCategories()
	 */
	@Override
	public List<String> getProductCategories() {
		return productService.getProductCategories();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.anusha.ProductCatlogInterface#getProducts(java.lang.String)
	 */
	@Override
	public List<String> getProducts(String category) {
		return productService.getProducts(category);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.anusha.ProductCatlogInterface#addProduct(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public boolean addProduct(String category, String product) {
		return productService.addProduct(category, product);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.anusha.ProductCatlogInterface#getProductsv2(java.lang.String)
	 */
	@Override
	public List<Product> getProductsv2(String category) {
		return productService.getProductsv2(category);

	}

}
