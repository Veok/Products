package pl.edu.pjwstk.poj.products;

import java.util.List;

public class ProductManager {

	
	
	public static Product getCheapest(List<Product> products){
		
		if (products == null || products.size() == 0){
			return null;
		}
		
		Product cheapest= products.get(0);
		
		for(int i = 1; i < products.size(); i++){
			if (products.get(i).getPrice() < cheapest.getPrice()){
				cheapest = products.get(i);
			}
		}
		return cheapest;
	}
	
	public static double getSum(Product[] products){
		
		if (products == null ){
			return 0;
		}
		
	double Sum = 0;
	
	for(int i = 0; i<products.length; i++){
		Sum+=products[i].getPrice();
		}
	
	return Sum;
}
	
	 public static void printall(Product[] products){
		 
		 if (products == null){
				return;
			}
		 for(int i = 0; i < products.length; i++){
			
			 System.out.println(products[i]);
		 }
		
	 }

	 
	
	 
}
