package org.anusha.business;

import java.util.ArrayList;
import java.util.List;

import org.anusha.model.Product;

public class ProductServiceImpl {
	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> movieList = new ArrayList<>();

	public ProductServiceImpl() {
		bookList.add("Ignited Minds");
		bookList.add("The Seven Spiritual Laws of Success");
		bookList.add("The Desiderata of Happiness");

		musicList.add("Random Access Memories");
		musicList.add("Night Visions");
		musicList.add("unorthodox jukebox");

		movieList.add("Taare Zameen Par");
		movieList.add("Dhangal");
		movieList.add("Star Trek into Darkness");

	}

	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<>();
		categories.add("BOOKS");
		categories.add("MUSIC");
		categories.add("MOVIES");
		return categories;

	}

	public List<String> getProducts(String category) {
		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;

		}
		return null;
	}

	public boolean addProduct(String category, String product) {
		switch (category.toLowerCase()) {
		case "books":
			bookList.add(product);
		case "music":
			musicList.add(product);
		case "movies":
			movieList.add(product);
			break;
		default:
			return false;

		}
		return true;
	}

	public List<Product> getProductsv2(String category) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("OCJPA","1234", 9999.9));
		productList.add(new Product("ORCLE","ABC", 89999.9));
		return productList;

	}
}
