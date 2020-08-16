package org.anusha;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.DOCUMENT)
public class ShopInfo {
	@WebMethod
	@WebResult(partName="LookupOutput")
	 public String getShopInfo(@WebParam(partName="LookupInput") String property) throws InvalidInputException{
		 String response = null;
		 if("shopName".equals(property)){
			 response="Test Mart";
		 }
		 else if("since".equals(property)){
			 response = "since 2015";
		 }
		 else{
			 throw new InvalidInputException("Invalid Input", property + " is naot a valid input");
		 }
		return response; 
	 }

}
