package pl.edu.pjwstk.poj.products;

public class Main {

	public static void main(String[] args) {
	


		Product product1 = new Product();
		product1.setCode("code1");
		product1.setName("name1");
		product1.setPrice(101);

		Product product2 = new Product();
		product2.setName("name1");
		product2.setPrice(200);
		product2.setCode("code2");

		Product product3 = new Product();
		product3.setCode("code3");
		product3.setName("name3");
		product3.setPrice(500);

		Cart cart = new Cart();
		cart.addProduct(product1);
		cart.addProduct(product2);
		cart.addProduct(product3);
		cart.printCart();

		double totalPrice = cart.getTotalPrice();
		System.out.println(totalPrice);


		System.out.println("Cart after discount: ");
		cart.applyDiscount300plus();
		cart.applyFreeCup();
		cart.applyDiscountThirdForFree();
		cart.applyVoucher(product2);
		cart.printCart();






	}

}
