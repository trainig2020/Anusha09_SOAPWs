package org.anusha;

import javax.xml.ws.Endpoint;

public class TestMartPublisher {

	public static void main(String[] args) {

		Endpoint.publish("http://localhost:1234/productcatlog", new ProductCatlog());
		
		
		
	}

}
