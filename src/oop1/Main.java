package oop1;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		product1.setName("Delongi kahve makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		// set value deger atamak
		
		// get okumak
		// System.out.println(product1.name);
		Product product2 = new Product();
		product2.setName("Ar�elik kahve makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");
		
		
		Product product3 = new Product();
		product3.setName("Vestel kahve makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");
		
	
		
		

		Product[] products = { product1, product2, product3 };
		
		for (Product product : products) {
			System.out.println(product.getName());
			

		}
		
		IndividualCustomer individualCustomer =new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05426176405");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Handan");
		individualCustomer.setLastName("Mangal");
		
		
		CorporateCustomer corporateCustomer=new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("kodlama.io");
		corporateCustomer.setPhone("05436476817");
		corporateCustomer.setTaxNumber("111111111");
		corporateCustomer.setCustomerNumber("54321");
		
		
		
		Customer[] customers= {individualCustomer,corporateCustomer};
		


	}

}
